/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.controller;

import com.pe.proyecto.entity.DetalleOrden;
import com.pe.proyecto.service.DetalleOrdenService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*raaaa*/
@RestController
@RequestMapping("/detalleorden")
public class DetalleOrdenController {
    
     @Autowired
    private DetalleOrdenService detalleOrdenService;
     
     @GetMapping
    public List<DetalleOrden> findAll(){
        return detalleOrdenService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<DetalleOrden> findById(@PathVariable Long id){
        return detalleOrdenService.findById(id);
    }
    
    @PostMapping
    public DetalleOrden add(@RequestBody DetalleOrden dto){
        return detalleOrdenService.add(dto);
    }
    
    
}
