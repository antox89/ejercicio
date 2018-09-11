

package proyectoat;

import java.io.Serializable;
import java.util.ArrayList;
import messenger.Mensaje;


public class Usuario implements Serializable {

    private String usuario, password;
    private String nombre, apellido;
    private int edad;
    private ArrayList<Mensaje> listaMensajes = new ArrayList();
    private ArrayList<Mensaje> enviado = new ArrayList();
    private ArrayList<Mensaje> recibido = new ArrayList();

    public Usuario() {
    }
    
    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Mensaje> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensaje> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public ArrayList<Mensaje> getEnviado() {
        return enviado;
    }

    public void setEnviado(ArrayList<Mensaje> enviado) {
        this.enviado = enviado;
    }

    public ArrayList<Mensaje> getRecibido() {
        return recibido;
    }

    public void setRecibido(ArrayList<Mensaje> recibido) {
        this.recibido = recibido;
    }
    
    

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
