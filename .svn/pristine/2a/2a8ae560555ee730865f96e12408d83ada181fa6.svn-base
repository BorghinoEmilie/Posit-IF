/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TransactionRequiredException;
import models.Client;
import models.ProfilAstro;

/**
 *
 * @author eborghino
 */
public class DaoProfilAstro {
    public void createProfilAstro(ProfilAstro pa)throws EntityExistsException, IllegalArgumentException, TransactionRequiredException{
       EntityManager em = JpaUtil.obtenirEntityManager();
       em.persist(pa);
    }
}
