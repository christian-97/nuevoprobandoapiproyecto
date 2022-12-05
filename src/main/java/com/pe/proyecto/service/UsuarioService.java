/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pe.proyecto.service;

import com.pe.proyecto.entity.Usuarios;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author _ADMINISTRADOR_
 */
public interface UsuarioService {
    public List<Usuarios> findAll();
    public List<Usuarios> findAllCustom();
    public Optional<Usuarios> findById(long id);
    public Usuarios add(Usuarios u);
    public Usuarios update(Usuarios u);
    public Usuarios delete(Usuarios u);
}
