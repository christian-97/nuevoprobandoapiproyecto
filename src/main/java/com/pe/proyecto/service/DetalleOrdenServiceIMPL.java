/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.DetalleOrden;
import com.pe.proyecto.repository.DetalleOrdenRepository;
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
public class DetalleOrdenServiceIMPL implements DetalleOrdenService{
    
    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    @Override
    public List<DetalleOrden> findAll() {
        return detalleOrdenRepository.findAll();
    }

    @Override
    public Optional<DetalleOrden> findById(long id) {
        return detalleOrdenRepository.findById(id);
    }

    @Override
    public DetalleOrden add(DetalleOrden d) {
        return detalleOrdenRepository.save(d);
    }

    @Override
    public DetalleOrden update(DetalleOrden d) {
        DetalleOrden objdetalleorden = detalleOrdenRepository.getById(d.getId());
        BeanUtils.copyProperties(d, objdetalleorden);
        return detalleOrdenRepository.save(objdetalleorden);
    }

    
}
