/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.Producto;
import com.pe.proyecto.repository.ProductoRepository;
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
public class ProductoServiceIMPL implements ProductoService{
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return productoRepository.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objproducto = productoRepository.getById(p.getId());
        BeanUtils.copyProperties(p, objproducto);
        return productoRepository.save(objproducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objproducto = productoRepository.getById(p.getId());
        objproducto.setEstado(false);
        return productoRepository.save(objproducto);
    }

    @Override
    public List<Producto> findAllCustom() {
        return productoRepository.findAllCustom();
    }
    
}
