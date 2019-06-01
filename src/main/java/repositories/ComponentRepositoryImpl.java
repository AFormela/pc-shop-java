package repositories;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ComponentRepositoryImpl<T> implements ComponentRepository<T> {

    @PersistenceContext(unitName = "db")
    private EntityManager em;

    @Override
    public void create(T component) {
        em.persist(component);
    }

    @Override
    public void update(T component) {
        em.merge(component);
    }

    @Override
    public T findById(Class<T> clazz, long id) {
        return em.find(clazz, id);
    }
}
