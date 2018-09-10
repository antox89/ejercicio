

package messenger;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class adminUsuariosMsj implements Serializable{
    
    private ArrayList<UsuarioMsj> listaUsuariosMsj = new ArrayList();
    private File archivo = null;

    public adminUsuariosMsj(String path) {
        archivo = new File(path);
    }

    public ArrayList<UsuarioMsj> getListaUsuariosMsj() {
        return listaUsuariosMsj;
    }

    public void setListaUsuariosMsj(ArrayList<UsuarioMsj> listaUsuariosMsj) {
        this.listaUsuariosMsj = listaUsuariosMsj;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminUsuariosMsj{" + "listaUsuariosMsj=" + listaUsuariosMsj + '}';
    }

    public void agregarUsuarioMsj(UsuarioMsj umsj){
        this.listaUsuariosMsj.add(umsj);
    }
    
    public void createUser() throws IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (UsuarioMsj u : listaUsuariosMsj) {
                bw.writeObject(u);
            }
            bw.flush();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        bw.close();
        fw.close();
    }
    
    public void readUser(){
        
        listaUsuariosMsj = new ArrayList();
        UsuarioMsj temp;
        
        FileInputStream fr = null;
        ObjectInputStream br = null;
        
        if(archivo.exists()){
            try{
                fr=new FileInputStream(archivo);
                br = new ObjectInputStream(fr);
                
                while( (temp = (UsuarioMsj) br.readObject())!=null){
                    listaUsuariosMsj.add(temp);
                }
                br.close();
                fr.close();
            }catch (EOFException e) {

            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
                
            }
        }
    }
    
    
    public void escribirMensaje() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw= null;
        try{
            fw = new FileWriter(archivo,true);
            bw= new BufferedWriter(fw);
            for (UsuarioMsj usuario : listaUsuariosMsj) {
                bw.write(usuario.getUsuario()+";");
                
                for (Mensaje m : usuario.getListaMensajes()) {
                    bw.write(m.getEmisor()+",");
                    bw.write(m.getReceptor()+",");
                    bw.write(m.getMensaje()+",");
                }
                bw.write(";");
                bw.write(usuario.getApellido()+";");
                
            }
            bw.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        fw.close();
        bw.close();
    }
    
    public void leerMensaje(){
        Scanner sc = null;
        
        listaUsuariosMsj = new ArrayList();
        if(archivo.exists()){
            try{
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                
                while(sc.hasNext()){
                    String usuario, apellido;
                    String receptor,mensaje;
                    
                    usuario = sc.next();
                    receptor = sc.next();
                    mensaje = sc.next();
                    
                    ArrayList<Mensaje> temp = new ArrayList();
                    Mensaje mt = new Mensaje();
                    
                    mt.setEmisor(usuario);
                    mt.setReceptor(receptor);
                    mt.setMensaje(mensaje);
                    
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    
                    while(s2.hasNext()){
                        temp.add(mt);
                    }
                    apellido = sc.next();
                    
                    UsuarioMsj u = new UsuarioMsj();
                    u.setUsuario(usuario);
                    u.setApellido(apellido);
                    
                    listaUsuariosMsj.add(u);
                    listaUsuariosMsj.get(listaUsuariosMsj.size()-1).setListaMensajes(temp);
                }
            }catch(FileNotFoundException e){
                
            }
        }
    }
    

}
