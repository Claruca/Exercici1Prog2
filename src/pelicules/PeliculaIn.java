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
            System.out.println("Pel·lícules llegides");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void llegirPelisperGenere(PeliculaOut[] po) {
        try {
            Pelicula pe = (Pelicula) ois.readObject();
            while (!pe.esCentinela()) {
                Genere gen = pe.getGenere();
                int i = 0;
                boolean found = false;
                while (i < po.length && found != true) {
                    for (Genere g : Genere.values()) {
                        if (gen == g && found != true) {
                                po[i].escriurePelicula(pe);
                                found = true;
                                break;
                        }
                        i++;
                    }
                }
                pe = (Pelicula) ois.readObject();
            }            
            //Escrivim el centinela a tots els fitxers resultants
            for (int i = 0; i < po.length; i++) {
                po[i].escriurePelicula(Pelicula.CENTINELA);
            }
            ois.close();
            System.out.println("Pel·lícules classificades");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

//Opció amb switch (millor per pocs elements)
            /*
                switch (gen) {
                    case ACCIO:
                        po[0].escriurePelicula(pe);
                        break;
                    case AUTOR:
                        po[1].escriurePelicula(pe);
                        break;
                    case CIFI:
                        po[2].escriurePelicula(pe);
                        break;
                    case COMEDIA:
                        po[3].escriurePelicula(pe);
                        break;
                    case DRAMA:
                        po[4].escriurePelicula(pe);
                        break;
                    case POLICIACA:
                        po[5].escriurePelicula(pe);
                        break;
                    case TERROR:
                        po[6].escriurePelicula(pe);
                        break;
                }
                pe = (Pelicula) ois.readObject();
             */
