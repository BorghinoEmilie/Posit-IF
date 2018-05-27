/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eborghino
 */
@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idC;
    
    private String civilite;
    private String nom;
    private String prenom;
    
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String adresse;
    @Column(unique=true)
    private String mail;
    private String numTel;
    
    @Embedded
    private ProfilAstro profilAstro;

    public ProfilAstro getProfilAstro() {
        return profilAstro;
    }

    public int getIdC() {
        return idC;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public void setProfilAstro(ProfilAstro profilAstro) {
        this.profilAstro = profilAstro;
    }

    public Client( String civilite, String nom, String prenom, Date dateNaissance, String adresse, String mail, String numTel) {
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.mail = mail;
        this.numTel = numTel;
        this.profilAstro = null;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" + "idC=" + idC + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", mail=" + mail + ", numTel=" + numTel + ", profilAstro=" + profilAstro + '}' + '\n';
    }
    
    
    
}
