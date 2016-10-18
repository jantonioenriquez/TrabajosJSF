/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "interprete")

public class Interprete implements Serializable
 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_interprete")
    private Long idInterprete;
    @Column(name = "nombre", length = 100)
    private String nombre;
    @Column(length = 150)
    private String apellidos;
    @Column(length = 3)
    private int edad;

    public Interprete(Long idInterprete, String nombre, String apellidos, int edad) {
        this.idInterprete = idInterprete;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Interprete() {
        this(0L, "", "",0);
    }

    public Long getIdInterprete() {
        return idInterprete;
    }

    public void setIdInterprete(Long idInterprete) {
        this.idInterprete = idInterprete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }                   
}

