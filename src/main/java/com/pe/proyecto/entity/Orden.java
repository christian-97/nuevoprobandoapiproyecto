/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.entity;

/**
 *
 * @author _ADMINISTRADOR_
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Orden")
@Table(name="ordenes")
public class Orden implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "numero")
    private String numero;
    
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
    
    @Column(name = "fechaRecibida")
    private Date fechaRecibida;
    
    @Column(name = "total")
    private double total;
    
    @Column(name = "usuario_id")
    private double usuario_id;
}
