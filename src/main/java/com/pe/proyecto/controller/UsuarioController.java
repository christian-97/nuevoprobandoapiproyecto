/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.controller;

import com.pe.proyecto.entity.Usuarios;
import com.pe.proyecto.service.UsuarioService;
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
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public List<Usuarios> findAll(){
        return usuarioService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Usuarios> findAllCustom(){
        return usuarioService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Usuarios> findById(@PathVariable Long id){
        return usuarioService.findById(id);
    }
    
    @PostMapping
    public Usuarios add(@RequestBody Usuarios u){
        return usuarioService.add(u);
    }
    
    @PutMapping("/{id}")
    public Usuarios update(@PathVariable Long id,@RequestBody Usuarios u){
        u.setId(id);
        return usuarioService.update(u);
    }
    
    @DeleteMapping("/{id}")
    public Usuarios delete(@PathVariable Long id){
        Usuarios objusuarios = new Usuarios();
        objusuarios.setEstado(false);
        return usuarioService.delete(Usuarios.builder().id(id).build());
    }
    
}
