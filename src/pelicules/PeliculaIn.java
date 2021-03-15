package pelicules;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author clara
 */
public class PeliculaIn {

    FileInputStream entrada;
    ObjectInputStream ois;

    public PeliculaIn(String nom) {
        try {
            entrada = new FileInputStream(nom);
            ois = new ObjectInputStream(entrada);           
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void llegirPelis() {
        try {
            Pelicula pe = (Pelicula) ois.readObject();
            while (!pe.esCentinela()) {
                System.out.println(pe);
                pe = (Pelicula) ois.readObject();
            }
            ois.close();
            System.out.println("Fi de programa");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
