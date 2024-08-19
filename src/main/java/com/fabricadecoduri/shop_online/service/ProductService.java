package com.fabricadecoduri.shop_online.service;

import com.fabricadecoduri.shop_online.model.Brand;
import com.fabricadecoduri.shop_online.model.Product;
import com.fabricadecoduri.shop_online.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product getProductById( Long id){
        return productRepository.getReferenceById(id);
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public void editProductById(Product product, Long id){
    Product productForEdit = productRepository.getReferenceById(id);
    productForEdit.setPrice(product.getPrice());
    productForEdit.setQuantity(product.getQuantity());
    productForEdit.setColor(product.getColor());
    productForEdit.setGender(product.getGender());
    productForEdit.setSize(product.getSize());
    productForEdit.setModel(product.getModel());
    productRepository.save(productForEdit);
    }
}
