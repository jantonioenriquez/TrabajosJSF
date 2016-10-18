/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Cancion;

/**
 *
 * @author janto
 */
public class CancionDAO extends DAO<Cancion> {

    public CancionDAO() {
        super(new Cancion());
    }

    public Cancion getOneById(Cancion cancion) throws HibernateException {
        return super.getOneById(cancion.getIdCancion());
    }
}
