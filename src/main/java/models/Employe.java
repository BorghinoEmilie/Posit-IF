/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author eborghino
 */
@Entity
public class Employe {
 
    // Class code
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idE;
    
    private String Nom;
    private String Prenom;
    private int nbVoyances;
    
    @Column(unique=true)
    private String mail;
    private String status;

    public int getIdE() {
        return idE;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getNbVoyances() {
        return nbVoyances;
    }

    public void setNbVoyances(int nbVoyances) {
        this.nbVoyances = nbVoyances;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employe(String Nom, String Prenom, int nbVoyances, String mail, String status) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.nbVoyances = nbVoyances;
        this.mail = mail;
        this.status = status;
    }

    public Employe() {
    }

    @Override
    public String toString() {
        return "Employe{" + "idE=" + idE + ", Nom=" + Nom + ", Prenom=" + Prenom + ", nbVoyances=" + nbVoyances + ", mail=" + mail + ", status=" + status + '}'+ '\n';
    }

   
    
}
