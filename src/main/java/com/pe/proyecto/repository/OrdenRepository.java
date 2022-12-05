/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pe.proyecto.repository;

import com.pe.proyecto.entity.Orden;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author _ADMINISTRADOR_
 */
public interface OrdenRepository extends JpaRepository<Orden, Long>{
    @Query("select o from Orden o")
    List<Orden> findAll();
}
