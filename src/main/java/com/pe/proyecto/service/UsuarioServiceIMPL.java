/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.Usuarios;
import com.pe.proyecto.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.User;

/**
 *
 * @author _ADMINISTRADOR_
 */
@Service
public class UsuarioServiceIMPL implements UsuarioService{
    @Autowired
    HttpSession session;
    
    @Autowired
    private UsuarioRepository usuarioRepository;
  

    @Override
    public List<Usuarios> findAll() {
        return usuarioRepository.findAll();
        
    }

    @Override
    public Optional<Usuarios> findById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuarios add(Usuarios u) {
        return usuarioRepository.save(u);
    }

    @Override
    public Usuarios update(Usuarios u) {
        Usuarios objusuario = usuarioRepository.getById(u.getId());
        BeanUtils.copyProperties(u, objusuario);
        return usuarioRepository.save(objusuario);
    }

    @Override
    public Usuarios delete(Usuarios u) {
        Usuarios objproducto = usuarioRepository.getById(u.getId());
        objproducto.setEstado(false);
        return usuarioRepository.save(objproducto);
    }

    @Override
    public List<Usuarios> findAllCustom() {
        return usuarioRepository.findAllCustom();
    }

    @Override
    public Optional<Usuarios> login(Long id){
        return usuarioRepository.findById(id);
    }
}