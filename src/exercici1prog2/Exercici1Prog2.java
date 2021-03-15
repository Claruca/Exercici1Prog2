package exercici1prog2;

import pelicules.Pelicula;
import pelicules.PeliculaIn;
import pelicules.PeliculaOut;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import pelicules.Genere;

/**
 *
 * @author clara
 */
public class Exercici1Prog2 {

    public static void main(String[] args) {
        String nomFitxer = "fitxer.dat";

       PeliculaOut pOut = new PeliculaOut(nomFitxer);
        for (int i = 1; i < 4; i++) {
            Pelicula peli = new Pelicula();           
            System.out.print("Titol: ");
            String titol = llegirCadena();
            System.out.print("Nom Director: ");
            String nomDire = llegirCadena();
            System.out.print("Any: ");
            int num = llegirNum();
            System.out.print("Selecciona un génere: (1)ACCIO, (2)AUTOR, (3)CIFI, (4)COMEDIA, (5)DRAMA, (6)POLICIACA, (7)TERROR");
            Genere gen = llegirGenere();
            
            peli.setTitol(titol);
            peli.setNomDirector(nomDire);
            peli.setAnyEstrena(num);   
            peli.setGenere(gen);
            
            pOut.escriurePelicula(peli);
        }

        pOut.escriurePelicula(Pelicula.CENTINELA);
        pOut.tancarFitxer();

        PeliculaIn p = new PeliculaIn(nomFitxer);
        p.llegirPelis();
        

    }

    private static String llegirCadena() {
        String s = "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));            
            s = in.readLine();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return s;
    }

    private static int llegirNum() {
        int x = 0;
        try {
            String s;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));            
            s = in.readLine();
            x = Integer.parseInt(s);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return x;
    }
    
    private static Genere llegirGenere(){
        Genere gen = null;
        int opcion = llegirNum();       
        
        try {
            switch(opcion){
                case 1: gen = Genere.ACCIO; break;
                case 2: gen = Genere.AUTOR; break;
                case 3: gen = Genere.CIFI; break;
                case 4: gen = Genere.COMEDIA; break;
                case 5: gen = Genere.DRAMA; break;
                case 6: gen = Genere.POLICIACA; break;
                case 7: gen = Genere.TERROR; break;
                default: System.out.println("No hay genero posible");
            }

            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return gen;
        
        
        
        
        
         
        
    }
        
    

}
