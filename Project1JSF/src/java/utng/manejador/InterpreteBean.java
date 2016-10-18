/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.InterpreteDAO;
import utng.modelo.Interprete;

/**
 *
 * @author janto
 */
@ManagedBean
@SessionScoped
public class InterpreteBean implements Serializable {

    private List<Interprete> interpretes;
    private Interprete interprete;

    public String listar() {
        InterpreteDAO dao = new InterpreteDAO();
        try {
            interpretes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Interpretes";
    }

    public String eliminar() {
        InterpreteDAO dao = new InterpreteDAO();
        try {
            dao.delete(interprete);
            interpretes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        interprete = new Interprete();
        return "Agregar";
    }

    public String guardar() {
        InterpreteDAO dao = new InterpreteDAO();
        try {
            if (interprete.getIdInterprete() != 0) {
                dao.update(interprete);
            } else {
                dao.insert(interprete);
            }
            interpretes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Interprete interprete) {
        this.interprete = interprete;
        return "Editar";
    }

    public List<Interprete> getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(List<Interprete> interpretes) {
        this.interpretes = interpretes;
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
    }

}
