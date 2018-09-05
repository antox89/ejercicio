

package proyectoat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class adminUsuario {
    
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;

    public adminUsuario() {
    }
    
    
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
            fw = new FileWriter(archivo,true);
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
    
    public void registrarUsuario(String usuario, String password){
        //if(!password.isEmpty() && !usuario.isEmpty()){
            String pass = new String(password);
            String confirm = new String(pass);
            
            //if(pass.equals(confirm)){
                try {
                    BufferedReader input = new BufferedReader(new FileReader("passwords.txt"));
                    String line = input.readLine();
                    while(line !=null){
                        StringTokenizer st = new StringTokenizer(line);
                        if(usuario.equals(st.nextToken())){
                            System.out.println("User already exists");
                            break;
                        }
                        line = input.readLine();
                    }
                    input.close();
                    MessageDigest md = MessageDigest.getInstance("SHA-256");
                    md.update(pass.getBytes());
                    byte byteData[] =md.digest();
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < byteData.length; i++) 
                        sb.append(Integer.toString((byteData[i]& 0xFF)+ 0x100,16).substring(1));
                    BufferedWriter output = new BufferedWriter(new FileWriter("passwords.txt",true));
                    output.write(usuario+ " "+sb.toString()+"\n");
                    output.close();
                    
                    
                } catch (FileNotFoundException ex) {
                    
                } catch (IOException ex) {
                    
                } catch (NoSuchAlgorithmException ex) {
                    
                }
            //}
            
        //}
        
        
    }
    

}
