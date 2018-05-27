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
import models.Client;
import models.Employe;
import models.Medium;
import models.Voyance;


/**
 *
 * @author eborghino
 */
public class DaoVoyance {
    public void createVoyance( Voyance voyance )throws EntityExistsException, IllegalArgumentException, TransactionRequiredException{
       EntityManager em = JpaUtil.obtenirEntityManager();
       em.persist(voyance);
    }

    public void updateVoyance(Voyance voyance) {
       EntityManager em = JpaUtil.obtenirEntityManager();
       em.merge(voyance);
    }

    public Voyance findNewVoyanceByEmp(Employe emp) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select v from Voyance v where v.idE = :idE and v.enddate = 'null'");
        query.setParameter("idE", emp.getIdE());
        Voyance resultat = (Voyance) query.getSingleResult();
        return resultat;
    }

    public Voyance findById(int idv) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select c from Voyance c where c.idV = :idv");
        query.setParameter("idv", idv);
        Voyance resultat = (Voyance) query.getSingleResult();
        return resultat;
    }

    public List<Voyance> findVoyancesByClient(Client client) {
        List<Voyance> resultat;
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select c from Voyance c where c.client = :client");
        query.setParameter("client", client);
        resultat = query.getResultList();
        return resultat;
    }
    
    public List<Medium> findMediumByClient(Client client){
    	List<Medium> resultat;
    	EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select c.medium from Voyance c where c.client = :client");
        query.setParameter("client", client);
        resultat = query.getResultList();
        return resultat;
    }
}
