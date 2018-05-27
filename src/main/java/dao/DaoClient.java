/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import models.Client;
import org.eclipse.persistence.jpa.JpaHelper;

/**
 *
 * @author eborghino
 */
public class DaoClient {
    public void createClient(Client client)throws EntityExistsException, IllegalArgumentException, TransactionRequiredException{
       EntityManager em = JpaUtil.obtenirEntityManager();
       em.persist(client);
    }

    public Client findById(int idc) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select c from Client c where c.idC = :idc");
        query.setParameter("idc", idc);
        Client resultat = (Client) query.getSingleResult();
        return resultat;
    }
    
    public Client findByMail(String mail) {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("select c from Client c where c.mail = :mail");
        query.setParameter("mail", mail);
        Client resultat = (Client) query.getSingleResult();
        return resultat;
    }
}
