package com.fabricadecoduri.catalog_service.repository;

import com.fabricadecoduri.catalog_service.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Long> { }
