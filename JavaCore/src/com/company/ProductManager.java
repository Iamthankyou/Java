package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> listProduct = new ArrayList<Product>();

    public Product addProduct(Product product) {
        this.listProduct.add(product);
        return product;
    }

    public Product findProduct(String name) {
        return this.listProduct.stream().filter(product->product.getName().equals(name)).findAny().orElse(null);
    }

    public void deleteProductById(String id) {
        this.listProduct.removeIf(product->product.getId().equals(id));
    }

    public void display() {
        this.listProduct.forEach(System.out::println);
    }

    public void sortAccesding() {
        Collections.sort(this.listProduct, (a,b)-> (int) (a.getPrice()-b.getPrice()));
    }

    public void sortDescesding() {
        Collections.sort(this.listProduct, (a,b)-> (int) (b.getPrice()-a.getPrice()));
    }

}
