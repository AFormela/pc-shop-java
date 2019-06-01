package repositories;

import models.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext(unitName = "db")
    private EntityManager em;

    @Override
    public void update(Product product) {
        em.merge(product);
    }

    @Override
    public List<Product> findAll() {
        Query query = em.createQuery("SELECT e FROM Product e");
        return query.getResultList();
    }

    @Override
    public Product findById(long id) {
        return em.find(Product.class, id);
    }

    @Override
    public List<Product> findByCategoryAndNameAndPrice(String category, String name, double priceStart, double priceEnd) {
        Query query = em.createQuery("SELECT e" +
                " FROM Product e" +
                " WHERE lower(e.category) = lower(:category)" +
                " AND lower(e.name) LIKE lower(:name)" +
                " AND e.price BETWEEN :priceStart AND :priceEnd");
        query.setParameter("name", "%" + name + "%");
        query.setParameter("category", category);
        query.setParameter("priceStart", priceStart);
        query.setParameter("priceEnd", priceEnd);
        return query.getResultList();
    }

    @Override
    public List<Product> findByCategory(String category) {
        Query query = em.createQuery("SELECT e" +
                " FROM Product e" +
                " WHERE lower(e.category) = lower(:category)");
        query.setParameter("category", category);
        return query.getResultList();
    }

    @Override
    public List<Product> findByName(String name) {
        Query query = em.createQuery("SELECT e" +
                " FROM Product e" +
                " WHERE lower(e.name) LIKE lower(:name)");
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }

    @Override
    public List<Product> findByPrice(double priceStart, double priceEnd) {
        Query query = em.createQuery("SELECT e" +
                " FROM Product e" +
                " WHERE e.price BETWEEN :priceStart AND :priceEnd");
        query.setParameter("priceStart", priceStart);
        query.setParameter("priceEnd", priceEnd);
        return query.getResultList();
    }

    @Override
    public List<String> findCategories() {
        Query query = em.createQuery("SELECT DISTINCT e.category" +
                " FROM Product e");
        return query.getResultList();
    }
}
