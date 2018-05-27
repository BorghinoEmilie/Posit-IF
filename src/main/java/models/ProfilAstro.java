/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author eborghino
 */
@Embeddable
public class ProfilAstro {
    
    private String SigneZodiac;
    private String SigneAstro;
    private String CouleurPB;
    private String AnimalTotem;

    public String getSigneZodiac() {
        return SigneZodiac;
    }

    public String getSigneAstro() {
        return SigneAstro;
    }

    public String getCouleurPB() {
        return CouleurPB;
    }

    public String getAnimalTotem() {
        return AnimalTotem;
    }

    public ProfilAstro(String SigneZodiac, String SigneAstro, String CouleurPB, String AnimalTotem) {
        this.SigneZodiac = SigneZodiac;
        this.SigneAstro = SigneAstro;
        this.CouleurPB = CouleurPB;
        this.AnimalTotem = AnimalTotem;
    }

    public ProfilAstro() {
    }

    @Override
    public String toString() {
        return "ProfilAstro{" + "SigneZodiac=" + SigneZodiac + ", SigneAstro=" + SigneAstro + ", CouleurPB=" + CouleurPB + ", AnimalTotem=" + AnimalTotem + '}'+ '\n';
    }
    

    
}
