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
public class Tarologue extends Medium {

    private String Cartes;

    public String getCartes() {
        return Cartes;
    }

    public void setCartes(String Cartes) {
        this.Cartes = Cartes;
    }

    public Tarologue(String Cartes, String Nom, String bio, int nbVoyances) {
        super(Nom, bio, nbVoyances);
        this.Cartes = Cartes;
    }

    public Tarologue() {
    }

    @Override
    public String toString() {
        return super.toString() + "Tarologue{" + "Cartes=" + Cartes + '}'+ '\n';
    }

}
