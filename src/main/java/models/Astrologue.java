/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author eborghino
 */
@Entity
public class Astrologue extends Medium {

    private String Ecole;
    private int Promo;

    public String getEcole() {
        return Ecole;
    }

    public void setEcole(String Ecole) {
        this.Ecole = Ecole;
    }

    public int getPromo() {
        return Promo;
    }

    public void setPromo(int Promo) {
        this.Promo = Promo;
    }

    public Astrologue(String Ecole, int Promo, String Nom, String bio, int nbVoyances) {
        super(Nom, bio, nbVoyances);
        this.Ecole = Ecole;
        this.Promo = Promo;
    }

    public Astrologue() {
    }

    @Override
    public String toString() {
        return super.toString() + "Astrologue{" + "Ecole=" + Ecole + ", Promo=" + Promo + "} \n"; 
    }
    
}
