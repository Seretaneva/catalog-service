package com.fabricadecoduri.shop_online;

import com.fabricadecoduri.shop_online.model.Brand;
import com.fabricadecoduri.shop_online.model.Model;
import com.fabricadecoduri.shop_online.model.Product;
import com.fabricadecoduri.shop_online.repository.BrandRepository;
import com.fabricadecoduri.shop_online.repository.ProductRepository;
import com.fabricadecoduri.shop_online.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopOnlineApplication.class, args);
	}

}
