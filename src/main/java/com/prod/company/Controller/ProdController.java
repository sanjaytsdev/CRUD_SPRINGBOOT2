package com.prod.company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.prod.company.Entities.Product;
import com.prod.company.Services.ProdService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProdController {

    @Autowired
    ProdService ps;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return ps.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Integer id) {
       return ps.getProductById(id);
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product prod) {
        return ps.createProduct(prod);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product prod) {
       return ps.updateProduct(id, prod);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
       return ps.deleteProduct(id);
    }

    
     

}
