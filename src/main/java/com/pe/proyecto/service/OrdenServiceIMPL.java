/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.Orden;
import com.pe.proyecto.repository.OrdenRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author _ADMINISTRADOR_
 */
@Service
public class OrdenServiceIMPL implements OrdenService{
    
    @Autowired
    private OrdenRepository ordenRepository;

    @Override
    public List<Orden> findAll() {
        return ordenRepository.findAll();
    }

    @Override
    public Optional<Orden> findById(long id) {
        return ordenRepository.findById(id);
    }

    @Override
    public Orden add(Orden o) {
        return ordenRepository.save(o);
    }

    @Override
    public Orden update(Orden o) {
        Orden objorden = ordenRepository.getById(o.getId());
        BeanUtils.copyProperties(o, objorden);
        return ordenRepository.save(objorden);
    }
    
}
