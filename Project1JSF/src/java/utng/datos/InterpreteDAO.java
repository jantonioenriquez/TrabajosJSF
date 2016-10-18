/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Interprete;

/**
 *
 * @author janto
 */
public class InterpreteDAO extends DAO<Interprete> {
        public InterpreteDAO() {
        super(new Interprete());
    }

    public Interprete getOneById(Interprete interprete) throws HibernateException {
        return super.getOneById(interprete.getIdInterprete());
    }
   
}
