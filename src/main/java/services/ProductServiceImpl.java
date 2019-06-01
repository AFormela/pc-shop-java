package services;

import models.Comment;
import models.Product;
import repositories.ProductRepository;

import javax.inject.Inject;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductRepository productRepository;

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public Comment findComment(List<Comment> comments, long id) {
        for (Comment comment : comments) {
            if (comment.getId() == id) {
                return comment;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByCategoryAndNameAndPrice(String category, String name, double priceStart, double priceEnd) {
        return productRepository.findByCategoryAndNameAndPrice(category, name, priceStart, priceEnd);
    }

    @Override
    public List<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findByPrice(double priceStart, double priceEnd) {
        return productRepository.findByPrice(priceStart, priceEnd);
    }

    @Override
    public List<String> findCategories() {
        return productRepository.findCategories();
    }
}
