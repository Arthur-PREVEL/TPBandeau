package exemple;
import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Scenario{
    //attributs
    private ArrayList<Effet> effets; //ArrayList pour pouvoir conserver l'ordre et accepter les doublons
    private ArrayList<Integer> nbRepetitions;


    //méthodes
    public void ajouterEffet(Effet effet, Integer nbRepetitions){

        this.effets.add(effet);
        this.nbRepetitions.add( nbRepetitions );
    }
    public void appliquerA(Bandeau bandeau) {
        for (int i = 0; i < effets.size(); i++) {
            for (int j = 0; j < nbRepetitions.get(i); j++) {
                effets.get(i).appliquerA(bandeau);
            }
        }
    }
        //Constructeur
    public Scenario(ArrayList < Effet > effets, ArrayList < Integer > nbRepetitions) {
            this.effets = effets;
            this.nbRepetitions = nbRepetitions;
        }

    }
