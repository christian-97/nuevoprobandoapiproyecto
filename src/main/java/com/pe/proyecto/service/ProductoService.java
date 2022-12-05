/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author _ADMINISTRADOR_
 */
public interface ProductoService {
    public List<Producto> findAll();
    public List<Producto> findAllCustom();
    public Optional<Producto> findById(long id);
    public Producto add(Producto p);
    public Producto update(Producto p);
    public Producto delete(Producto p);
}
