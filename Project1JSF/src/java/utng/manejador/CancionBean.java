/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

/**
 *
 * @author janto
 */
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import utng.datos.CancionDAO;
import utng.datos.InterpreteDAO;
import utng.modelo.Cancion;
import utng.modelo.Interprete;

@ManagedBean
@SessionScoped
public class CancionBean implements Serializable {

    private List<Cancion> canciones;
    private Cancion cancion;
    private List<Interprete> interpretes;

    public CancionBean() {
        cancion = new Cancion();
        cancion.setInterprete(new Interprete());
    }

    public String listar() {
        CancionDAO dao = new CancionDAO();
        try {
            canciones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Canciones";
    }

    public String eliminar() {
        CancionDAO dao = new CancionDAO();
        try {
            dao.delete(cancion);
            canciones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        cancion = new Cancion();
        cancion.setInterprete(new Interprete());
        try {
            interpretes = new InterpreteDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Agregar";
    }

    public String guardar() {
        CancionDAO dao = new CancionDAO();
        try {
            if (cancion.getIdCancion() != 0) {
                dao.update(cancion);
            } else {
                dao.insert(cancion);
            }
            canciones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Cancion cancion) {
        this.cancion = cancion;
        try {
            interpretes = new InterpreteDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public List<Interprete> getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(List<Interprete> interpretes) {
        this.interpretes = interpretes;
    }

    
}
