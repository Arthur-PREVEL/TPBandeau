package exemple;
import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Scenario{
    //attributs
    private int id;
    private String nom;
    private LinkedHashMap<Effet, Integer> effets;

    //méthodes
    public void ajouterEffet(Effet effet, int nbRepetitions){
        effets.put(effet, nbRepetitions);
    }
    public void appliquerA(Bandeau bandeau){
        for(Effet effet : effets.keySet()){
            for( int i = 0; i < effets.get(effet) ; i++){
                effet.appliquerA(bandeau);
            }
        }
    }

    //Constructeur
    public Scenario(int id, String nom, LinkedHashMap<Effet, Integer> effets){
        this.id = id;
        this.nom = nom;
        this.effets = effets;
    }

}
