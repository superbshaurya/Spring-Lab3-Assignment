package lab3.cg.gla.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import lab3.cg.gla.spring.entity.Product;



public interface ProductDao extends JpaRepository<Product, Integer> {

}