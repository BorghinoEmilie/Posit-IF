/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author eborghino
 */
@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public abstract class Medium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idM;

    private String Nom;
    private String bio;
    private int nbVoyancesDemandees;

    @OneToMany
    private List<Employe> employes;
    
    public int getIdM() {
        return idM;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public void addEmploye(Employe employe) {
        this.employes.add(employe);
    }
    
    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getNbVoyancesDemandees() {
        return nbVoyancesDemandees;
    }
    
    public Employe getEmployeMiniVoyanceDispo(){
        Employe min = null;
        for (Employe e : employes)
        {
            if(e.getStatus().equals("dispo")){
                min = e;
                break;
            }
        }
        if(min == null)
            return null;
        for (Employe e : employes)
        {
            if(min.getNbVoyances() > e.getNbVoyances() && (e.getStatus() == "dispo"))
                min = e;
        }
        return min;
    }

    public void setNbVoyancesDemandees(int nbVoyancesDemandees) {
        this.nbVoyancesDemandees = nbVoyancesDemandees;
    }

    public Medium( String Nom, String bio, int nbVoyancesDemandees) {
        this.Nom = Nom;
        this.bio = bio;
        this.nbVoyancesDemandees = nbVoyancesDemandees;
        this.employes = new ArrayList<Employe>();
    }

    public Medium() {
    }

    @Override
    public String toString() {
        return "Medium{" + "idM=" + idM + ", Nom=" + Nom + ", bio=" + bio + ", nbVoyancesDemandees=" + nbVoyancesDemandees + ", employes=" + employes + '}'+ '\n';
    }

    
    
}
