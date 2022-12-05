/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author _ADMINISTRADOR_
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Producto")
@Table(name="productos")
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "imagen")
    private String imagen;
    
    @Column(name = "precio")
    private double precio;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "estado")
    private boolean estado;
    
    @Column(name = "usuario_id")
    private int usuario_id;
    
    @Column(name = "categoria_id")
    private int categoria_id;
   
    /*
    @ManyToOne
    @JoinColumn(name="usuario_id",nullable = false)
    private int usuario_id;
*/

}
