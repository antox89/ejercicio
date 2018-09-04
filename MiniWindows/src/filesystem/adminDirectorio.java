

package filesystem;

import java.io.File;
import java.util.ArrayList;


public class adminDirectorio {
    
    private ArrayList<Directorio> listaDirectorios = new ArrayList();
    private File archivo = null;
    
    public adminDirectorio(String path){
        archivo = new File(path);
    }

    public ArrayList<Directorio> getListaDirectorios() {
        return listaDirectorios;
    }

    public void setListaDirectorios(ArrayList<Directorio> listaDirectorios) {
        this.listaDirectorios = listaDirectorios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminDirectorio{" + "listaDirectorios=" + listaDirectorios + ", archivo=" + archivo + '}';
    }

    public void agregarDirectorio(Directorio d){
        this.listaDirectorios.add(d);
    }
    
    public void crearUsuarios(){
        
    }
    
    
}
