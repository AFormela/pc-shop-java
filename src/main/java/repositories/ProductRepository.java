package repositories;

import models.Product;

import java.util.List;

public interface ProductRepository {
    void update(Product product);
    List<Product> findAll();
    Product findById(long id);
    List<Product> findByCategoryAndNameAndPrice(String category, String name, double priceStart, double priceEnd);
    List<Product> findByCategory(String category);
    List<Product> findByName(String name);
    List<Product> findByPrice(double priceStart, double priceEnd);
    List<String> findCategories();
}
