package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Rainbow extends Effet {
    public void appliquerA(Bandeau bandeau){
        bandeau.setForeground(Color.YELLOW);
        bandeau.setBackground(Color.GREEN);
        bandeau.sleep(200);
        bandeau.setForeground(Color.BLUE);
        bandeau.setBackground(Color.GREEN);
        bandeau.sleep(200);
        bandeau.setForeground(Color.PINK);
        bandeau.setBackground(Color.BLUE);
        bandeau.sleep(200);
        bandeau.setForeground(Color.GREEN);
        bandeau.setBackground(Color.BLUE);
        bandeau.sleep(200);
        bandeau.setForeground(Color.YELLOW);
        bandeau.setBackground(Color.PINK);
        bandeau.sleep(200);
        bandeau.setForeground(Color.BLUE);
        bandeau.setBackground(Color.RED);
        bandeau.sleep(200);
        bandeau.setForeground(Color.BLUE);
        bandeau.setBackground(Color.PINK);
        bandeau.sleep(200);
    }
}
