package com.codegym.services;

import com.codegym.entities.Product;
import com.codegym.services.interfaces.ProductServices;
import com.codegym.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductServices implements ProductServices {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.getAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.getById(id);
    }

    @Override
    public void addProduct(Integer id, Product product) {
        productRepository.add(id,product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }

    @Override
    public void updateProduct(Integer id, Product product) {
        productRepository.update(id,product);
    }
}
