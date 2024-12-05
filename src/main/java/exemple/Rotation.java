package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {
    public void appliquerA(Bandeau bandeau){
        for (int i = 1; i <= 50; i++ ){
            bandeau.setRotation( i * Math.PI / 25.0f); // on fait 2 tours (2 * pi rad = 50 * (pi /25)
            bandeau.sleep(20);
        }

    }


}
