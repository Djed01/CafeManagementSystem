package com.inn.caffe.dao;

import com.inn.caffe.model.Product;
import com.inn.caffe.dto.ProductDTO;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductDTO> getAllProduct();

    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status, @Param("id") Integer id);

    List<ProductDTO> getProductByCategory(@Param("id") Integer id);

    ProductDTO getProductById(@Param("id") Integer id);
}
