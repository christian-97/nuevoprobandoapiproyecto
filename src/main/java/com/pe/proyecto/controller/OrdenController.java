/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.controller;

import com.pe.proyecto.entity.Orden;
import com.pe.proyecto.service.OrdenService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author _ADMINISTRADOR_
 */

@RestController
@RequestMapping("/ordenes")
public class OrdenController {
    
    @Autowired
    private OrdenService ordenService;
    
    @GetMapping
    public List<Orden> findAll(){
        return ordenService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Orden> findById(@PathVariable Long id){
        return ordenService.findById(id);
    }
    
    @PostMapping
    public Orden add(@RequestBody Orden o){
        return ordenService.add(o);
    }
    
}
