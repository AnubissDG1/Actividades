package com.example.Carro.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.Carro.models.CarroModel;
import com.example.Carro.repositories.CarroRepository;


@Service
public class CarroService {
    @Autowired 
   CarroRepository CRepo; 


   public ArrayList<CarroModel> todoLosUsuarios(){
          return (ArrayList<CarroModel>) CRepo.findAll();
   }

   public String guardar(CarroModel car){
       CRepo.save(car);
       return "guardado correctamente";
   }
   public Optional<CarroModel> buscarid(Long id){
      return CRepo.findById(id);
    
   }
   public List buscarPorPalabra(String query){
    List <CarroModel> auto = CRepo.findByKeyword(query);
     return auto;
}
  
   
   
}
