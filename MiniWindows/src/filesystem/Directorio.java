

package filesystem;

import java.util.ArrayList;


public class Directorio {
    
    private String nombre;
    private ArrayList<Archivo> listaArchivos = new ArrayList();

    public Directorio() {
    }

    public Directorio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Archivo> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }
    
    public void agregarArchivo(Archivo a){
        this.listaArchivos.add(a);
    }

}
