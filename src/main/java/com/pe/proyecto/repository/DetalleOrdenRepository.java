/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pe.proyecto.repository;

import com.pe.proyecto.entity.DetalleOrden;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author _ADMINISTRADOR_
 */
public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden,Long>{
    @Query("select do from DetalleOrden do")
    List<DetalleOrden> findAll();
}
