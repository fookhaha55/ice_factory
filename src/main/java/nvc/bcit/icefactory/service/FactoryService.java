package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Service จากสปริงเฟมเวิก

import nvc.bcit.icefactory.model.Factory;
import nvc.bcit.icefactory.repository.FactoryRepository;
@Service
public class FactoryService {
    @Autowired
    private FactoryRepository factoryRepository;


    //Get All factory//
    public List<Factory> getAllFactories(){
        return factoryRepository.findAll();
    
    }

    public Factory getFactoryById(int id){
        return factoryRepository.getById(id);
    }
    

    
}
