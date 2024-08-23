package com.prod.company.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prod.company.Entities.Product;
import com.prod.company.Repository.ProductRepo;
import org.springframework.stereotype.Service;


@Service
public class ProdService {

    @Autowired
    private ProductRepo p;

    public List<Product> getProducts() {
        return p.findAll();
    }

    public Product getProductById(Integer id) {
        return p.findById(id).get();
    }

    public Product createProduct(Product prod) {
        return p.save(prod);
    }

    public Product updateProduct(Integer id, Product prod) {
        Product exist = p.findById(id).get();
        exist.setName(prod.getName());
        exist.setPrice(prod.getPrice());
        return p.save(exist);
    }

    public String deleteProduct(Integer id) {
        p.findById(id).get();
        p.deleteById(id);
        return "Product Deleted Sucessfully";
    }
}
