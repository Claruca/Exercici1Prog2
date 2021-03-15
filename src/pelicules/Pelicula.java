
package pelicules;

import java.io.Serializable;

/**
 *
 * @author clara
 */
public class Pelicula implements Serializable {
    
    private String  titol;
    private String nomDirector;
    private int anyEstrena;
    private Genere genere;
    
    public static final Pelicula CENTINELA = new Pelicula("zzz","zzz",999,Genere.ACCIO);

    public Pelicula() {
    }    
    

    public Pelicula(String titol, String nomDirector, int anyEstrena, Genere genere) {
        this.titol = titol;
        this.nomDirector = nomDirector;
        this.anyEstrena = anyEstrena;
        this.genere = genere;
    }    

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getNomDirector() {
        return nomDirector;
    }

    public void setNomDirector(String nomDirector) {
        this.nomDirector = nomDirector;
    }

    public int getAnyEstrena() {
        return anyEstrena;
    }

    public void setAnyEstrena(int anyEstrena) {
        this.anyEstrena = anyEstrena;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
    

    @Override
    public String toString() {
        return "Pelicula{" + "titol=" + titol + ", nomDirector=" + nomDirector + ", anyEstrena=" + anyEstrena + ", genere=" + genere + '}';
    }

   
    
    public boolean esCentinela(){
        return titol.equals(CENTINELA.titol);
    }
    
    
           
    
    
}
