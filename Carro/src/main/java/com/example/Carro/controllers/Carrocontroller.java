package com.example.Carro.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.Carro.models.CarroModel;
import com.example.Carro.services.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController 
@RequestMapping("/autos") //RUTA DONDE VAMOS A LLAMAR
public class Carrocontroller {
    @Autowired
    CarroService CarService;

       
    @GetMapping()
    public ArrayList<CarroModel> obtenerUsuarios(){
        return CarService.todoLosUsuarios();
    }

    @PostMapping()
    public String guardar(@RequestBody CarroModel car){
        return CarService.guardar(car);
    }

    @GetMapping("/{id}")
    public Optional <CarroModel> guardar(@PathVariable("id")Long id){
        return CarService.buscarid(id);
    }
    @PostMapping("/{search}")
    public List<CarroModel> buscar(@RequestParam("query") String query){
         var au = CarService.buscarPorPalabra(query);
         System.out.println(au);
        return au;   
    }
   
}
