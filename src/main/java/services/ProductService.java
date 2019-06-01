package services;

import models.Comment;
import models.Product;

import java.util.List;

public interface ProductService {
    void update(Product product);
    Comment findComment(List<Comment> comments, long id);
    List<Product> findAll();
    Product findById(long id);
    List<Product> findByCategoryAndNameAndPrice(String category, String name, double priceStart, double priceEnd);
    List<Product> findByCategory(String category);
    List<Product> findByName(String name);
    List<Product> findByPrice(double priceStart, double priceEnd);
    List<String> findCategories();
}
