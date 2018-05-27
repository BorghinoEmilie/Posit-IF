/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import models.Employe;
import models.Medium;

/**
 *
 * @author eborghino
 */
public class DaoMedium {
    public void createMedium(Medium medium)throws EntityExistsException, IllegalArgumentException, TransactionRequiredException{
       EntityManager em = JpaUtil.obtenirEntityManager();
       em.persist(medium);
    }

    public List<Medium> findAll() {
        List<Medium> resultat;
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select m from Medium m ");
        resultat = query.getResultList();
        return resultat;
    }

    public Medium findById(int idM) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select m from Medium m where m.idM = :idM");
        query.setParameter("idM", idM);
        Medium resultat = (Medium) query.getSingleResult();
        return resultat;
    }

    public Medium updateMedium(Medium medium) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        return em.merge(medium);
    }
}
