package com.prod.company.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prod.company.Entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
