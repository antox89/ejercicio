

package proyectoat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class adminUsuario {
    
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;
    
    public adminUsuario(String path){
        archivo=new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaUsuarios=" + listaUsuarios + '}';
    }
    
    public void agregarUsuario(Usuario u){
        this.listaUsuarios.add(u);
    }
    
    public void escribirUsuarioT() throws IOException{
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try{
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            
            for (Usuario usuario : listaUsuarios) {
                bw.write(usuario.getUsuario()+";");
                bw.write(usuario.getPassword()+";");
            }
            bw.flush();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ex) {
            
        }
        fw.close();
        bw.close();
        
    }

}
