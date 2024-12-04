package exemple;
import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Scenario{
    //attributs
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
    public Scenario( LinkedHashMap<Effet, Integer> effets){

        this.effets = effets;
    }

}
