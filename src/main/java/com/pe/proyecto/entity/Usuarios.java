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
@Entity(name = "Usuarios")
@Table(name="usuarios")
public class Usuarios implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "nombre")
	private String nombre;
    
    @Column(name = "username")
	private String username;
    
    @Column(name = "email")
	private String email;
    
    @Column(name = "direccion")
	private String direccion;
        
        @Column(name = "telefono")
	private String telefono;
        
        @Column(name = "tipo")
	private String tipo;
        
        @Column(name = "password")
	private String password;
        
        @Column(name = "estado")
	private boolean estado;
        
        @Column(name = "rol_id")
	private int rol_id;
}
