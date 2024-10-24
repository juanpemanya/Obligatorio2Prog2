
package Dominio;

import java.util.ArrayList;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Autor {
    private String nombre;
    private String pais;
    private ArrayList<Genero> generosPorAutor = new ArrayList<Genero>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Genero> getGenerosPorAutor() {
        return generosPorAutor;
    }

    public void setGenerosPorAutor(ArrayList<Genero> generosPorAutor) {
        this.generosPorAutor = generosPorAutor;
    }
    
    
}
