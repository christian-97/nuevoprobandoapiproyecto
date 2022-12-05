/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.Orden;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author _ADMINISTRADOR_
 */
public interface OrdenService {
    public List<Orden> findAll();
    public Optional<Orden> findById(long id);
    public Orden add(Orden o);
    public Orden update(Orden o);
}
