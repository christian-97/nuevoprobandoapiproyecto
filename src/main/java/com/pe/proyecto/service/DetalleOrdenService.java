/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.DetalleOrden;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author _ADMINISTRADOR_
 */
public interface DetalleOrdenService {
    public List<DetalleOrden> findAll();
    public Optional<DetalleOrden> findById(long id);
    public DetalleOrden add(DetalleOrden d);
    public DetalleOrden update(DetalleOrden d);
}
