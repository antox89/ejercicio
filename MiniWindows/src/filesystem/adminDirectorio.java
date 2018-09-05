

package filesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;


public class adminDirectorio {
    
    private ArrayList<Directorio> listaDirectorios = new ArrayList();
    private File archivo = null;
    
    public adminDirectorio(){
        
    }
    
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
    
    public void crearDirectorioUsuario(String dir){
        File directorio,docs,pics,music,calendario,msj,correo;
        
        directorio = new File("./Z/Usuarios/"+dir);
        docs = new File("./Z/Usuarios/"+dir+"/Documentos");
        pics = new File("./Z/Usuarios/"+dir+"/Pictures");
        music = new File("./Z/Usuarios/"+dir+"/Music");
        calendario = new File("./Z/Usuarios/"+dir+"/Calendario");
        msj = new File("./Z/Usuarios/"+dir+"/Mensajes");
        correo = new File("./Z/Usuarios/"+dir+"/Correo");
        
        directorio.mkdir();
        docs.mkdir();
        pics.mkdir();
        music.mkdir();
        calendario.mkdir();
        msj.mkdir();
        correo.mkdir();
        
    }
    
    
}
