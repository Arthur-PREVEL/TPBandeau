package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        //création effets
        Zoom zoom1 = new Zoom();
        Rainbow rainbow1 = new Rainbow();
        Rotation rotation1 = new Rotation();

        //création séquences
        ArrayList<Effet> effets = new ArrayList<>();

        ArrayList<Integer> nbRepetitions = new ArrayList<>();

        effets.add(zoom1);
        nbRepetitions.add(2);
        effets.add(rainbow1);
        nbRepetitions.add(1);
        effets.add(zoom1);
        nbRepetitions.add(1);
        effets.add(rotation1);
        nbRepetitions.add(1);
        effets.add(zoom1);
        nbRepetitions.add(1);
        effets.add(rainbow1);
        nbRepetitions.add(5);
        Scenario scenario1 = new Scenario(effets, nbRepetitions);

        //test zoom
        monBandeau.setMessage("On va tester le Zoom");
        monBandeau.sleep(1000);
        monBandeau.setMessage("GO !!");
        monBandeau.sleep(1000);
        zoom1.appliquerA(monBandeau);
        monBandeau.sleep(1000);

        //test rainbow
        monBandeau.setMessage("On va tester le Rainbow");
        monBandeau.sleep(1000);
        monBandeau.setMessage("☼ Magnifique ☼");
        rainbow1.appliquerA(monBandeau);
        monBandeau.sleep(1000);

        //test rotation
        monBandeau.setMessage("On va tester la rotation");
        monBandeau.sleep(1000);
        monBandeau.setMessage("☼ ça tourne ☼");
        rotation1.appliquerA(monBandeau);
        monBandeau.sleep(1000);




        //test scenario
        monBandeau.setMessage("Appliquons une séquence ! ");
        monBandeau.sleep(1000);
        monBandeau.setMessage(" SEQUENCE EN COURS");
        scenario1.appliquerA(monBandeau);

        monBandeau.close();







 /*     monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va changer de police");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne de 45°...");
        monBandeau.setRotation(Math.PI / 2.0f);
        monBandeau.sleep(1000);
        monBandeau.setRotation(0.0f);

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();

  */
    }
}
