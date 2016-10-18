/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "cancion")
public class Cancion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cancion")
    private Long idCancion;
    @Column(name = "nombre_cancion", length = 10)
    private String nombreCancion;
    @Column(length = 40)
    private String genero;
    @Column(length = 40)
    private String duracion;
    @ManyToOne
    @JoinColumn(name = "id_interprete")
    private Interprete interprete;

    
    public Cancion(Long idCancion, String nombreCancion, String genero, String duracion, Interprete interprete) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.genero = genero;
        this.duracion = duracion;
        this.interprete = interprete;
    }

    public Cancion() {
        idCancion = 0L;
    }

    public Long getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Long idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
    }

    
}
