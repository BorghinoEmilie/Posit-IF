/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.JpaUtil;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javafx.util.Pair;
import models.Astrologue;
import models.Client;
import models.Employe;
import models.Medium;
import models.ProfilAstro;
import models.Tarologue;
import models.Voyance;
import models.Voyant;
import services.Services;

/**
 *
 * @author eborghino
 */
public class Main {    
    
    public static void main(String args[]) throws ParseException, IOException{
        JpaUtil.init();
        Services services = new Services();
       // services.initiatePositif();
        
        // Inscription
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse("12/11/1995");
        Client c = new Client("femme", "Bernardette", "Roberta", d, "1 route balabala", "bernardettebalabla@coucou.com", "0211554789" );
        services.inscription(c);
        *//*Client c1 = services.recupererClientById(52);  
        /*System.out.println("CLIENT BY ID  :  " + c1);
        
        
        
        //Connexion
        System.out.println("Le client avec le mail bernardettebalabla@coucou.com existe t il ?  : " + services.connexionClient("bernardettebalabla@coucou.com")); //true si existe
        System.out.println("Le client avec le mail richardo@coucou.com existe t il ?  : " + services.connexionClient("richardo@coucou.com")); //false
        
        System.out.println("L'employe avec le mail employe1@positif.com existe t il ?  : " + services.connexionEmploye("employe1@positif.com")); //true si existe
        System.out.println("L'employe avec le mail tesst@positif.com existe t il ?  : " + services.connexionEmploye("tesst@positif.com")); //false

        //Prediction
        System.out.println("PREDICTION de " + c1.getNom() + "  :  " + services.recupererPrediction(c1, 2, 6, 4)); 
        
        //Mediums
        System.out.println("LISTE MEDIUMS");
        System.out.println(services.consulterListeMediums());
        /**/
        //Medium m = services.recupererMediumById(7);
        /*System.out.println("MEDIUM BY ID : " + m);
        
        //Employes
        System.out.println("EMPLOYES DISPOS");
        System.out.println(services.recupererEmployesDispo());
        
        Employe e = services.recupererEmployeById(6);
        System.out.println("EMPLOYE BY ID : " + e);
        e.setStatus("indispo");
        services.updateEmploye(e);
        
        System.out.println("EMPLOYES DISPOS (1 en moins)");
        System.out.println(services.recupererEmployesDispo());
        
        
        //VOYANCE
        System.out.println("MEDIUM AVANT VOYANCE");
        System.out.println(m);
        services.demanderVoyance(c1, m);
        System.out.println("MEDIUM APRES VOYANCE");
        System.out.println(m);
        *///Voyance voyance = services.recupererVoyanceById(101);
       /* System.out.println("VOYANCE BY ID");
        System.out.println(voyance);
        services.commencerVoyance(voyance);
        System.out.println("VOYANCE APRES DEBUT");
        System.out.println(voyance);
        services.terminerVoyance(voyance, "Good");
        System.out.println("VOYANCE APRES FIN");
        System.out.println(voyance);
        
        Employe e1 = services.recupererEmployeById(1);
        e1.setStatus("indispo");
        services.updateEmploye(e1);
        e1 = services.recupererEmployeById(1);
        System.out.println("EMPLOYE BY ID : " + e1);
        
        Medium m2 = services.recupererMediumById(9);
        System.out.println("MEDIUM AVANT VOYANCE");
        System.out.println(m2);
        
        services.demanderVoyance(c1, m2);
        System.out.println("MEDIUM APRES VOYANCE");
        System.out.println(m2);
        *//*Voyance voyance2 = services.recupererVoyanceById(151);
        System.out.println("VOYANCE BY ID");
        System.out.println(voyance2);
        services.commencerVoyance(voyance2);
        System.out.println("VOYANCE APRES DEBUT");
        System.out.println(voyance2);
        services.terminerVoyance(voyance2, "Good");
        System.out.println("VOYANCE APRES FIN");
        System.out.println(voyance2);/*
        
        
        /*System.out.println("HISTORIQUE CLIENT");
        for (Voyance v : services.consulterHistorique(c1))
            System.out.println(v);
        
        System.out.println("NBVOYANCES PAR MEDIUMS");
        for (Pair<Medium,Integer> v : services.recupererVoyancesParMedium())
            System.out.println(v);
        
        System.out.println("NBVOYANCES PAR EMPLOYES");
        for (Pair<Employe,Integer> v : services.recupererVoyancesParEmploye())
            System.out.println(v);
        
        System.out.println("POURCENTAGE VOYANCSE PAR EMPLOYES");
        for (Pair<Employe,Integer> v : services.recupererVoyancesParEmployePourcentage())
            System.out.println(v);
        /**/
        JpaUtil.destroy();
        
    }
}
