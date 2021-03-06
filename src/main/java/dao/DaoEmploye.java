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

/**
 *
 * @author eborghino
 */
public class DaoEmploye {
    public void createEmploye(Employe employe)throws EntityExistsException, IllegalArgumentException, TransactionRequiredException{
       EntityManager em = JpaUtil.obtenirEntityManager();
       em.persist(employe);
    }

    public Employe findByEmail(String mail) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select e from Employe e where e.mail = :mail");
        query.setParameter("mail", mail);
        Employe resultat = (Employe) query.getSingleResult();
        return resultat;
    }
    
    public List<Employe> findAll() {
        List<Employe> resultat;
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select e from Employe e ");
        resultat = query.getResultList();
        return resultat;
    }

    public List<Employe> findAllDispo() {
        List<Employe> resultat;
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select e from Employe e where e.status = 'dispo'");
        resultat = query.getResultList();
        return resultat;
    }

    public Employe findById(int id) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select e from Employe e where e.idE = :ide");
        query.setParameter("ide", id);
        Employe resultat = (Employe) query.getSingleResult();
        return resultat;
    }
    
    public Employe updateEmploye(Employe employe) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        return em.merge(employe);
    }
}
