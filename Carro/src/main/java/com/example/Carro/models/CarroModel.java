package com.example.Carro.models;

import javax.persistence.*;


@Entity
@Table(name = "Carros")
public class CarroModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id;
    
    private String Marca;
    private String Modelo;
    private String Color;
    private Integer año;

    
    
    public Integer getAño() {
        return año;
    }
    public void setAño(Integer año) {
        this.año = año;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        this.Color = color;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
   
}
