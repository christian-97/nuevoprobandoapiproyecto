/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.controller;

import com.pe.proyecto.entity.Producto;
import com.pe.proyecto.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author _ADMINISTRADOR_
 */
@RestController
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping
    public List<Producto> findAll(){
        return productoService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Producto> findAllCustom(){
        return productoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id){
        return productoService.findById(id);
    }
    
    @PostMapping
    public Producto add(@RequestBody Producto p){
        return productoService.add(p);
    }
    
    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id,@RequestBody Producto p){
        p.setId(id);
        return productoService.update(p);
    }
    
    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable Long id){
        Producto objproducto = new Producto();
        objproducto.setEstado(false);
        return productoService.delete(Producto.builder().id(id).build());
    }
}
