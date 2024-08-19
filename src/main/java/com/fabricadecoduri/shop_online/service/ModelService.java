package com.fabricadecoduri.shop_online.service;

import com.fabricadecoduri.shop_online.model.Model;
import com.fabricadecoduri.shop_online.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;

    public Model getModelById(Long id){
        return modelRepository.getReferenceById(id);
    }

    public void addModel(Model model){
        modelRepository.save(model);
    }
    public void deleteModelById(Long id){
        modelRepository.deleteById(id);
    }

    public List<Model> getAllModels(){
        return modelRepository.findAll();
    }
    public void editModelById(Model model,Long id){
        Model modelToEdit = modelRepository.getReferenceById(id);
        modelToEdit.setName(model.getName());
        modelToEdit.setDescription(model.getDescription());
        modelToEdit.setBrand(model.getBrand());
        modelToEdit.setCategory(model.getCategory());
        modelRepository.save(modelToEdit);
    }
}
