package pelicules;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;


/**
 *
 * @author clara
 */
public class PeliculaOut {
   
    FileOutputStream sortida;
    ObjectOutputStream oos;
    

    public PeliculaOut(String nom) {
        try {
            sortida = new FileOutputStream(nom);
            oos = new ObjectOutputStream(sortida);         
   
        } catch (Exception e) {
            System.out.println(e);
        }
    }  

    
    
    public void escriurePelicula(Pelicula p) {
        try { 
            oos.writeObject(p);          

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void tancarFitxer() {
        try {
            oos.close();            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
