

package messenger;

import java.util.ArrayList;
import proyectoat.Usuario;


public class UsuarioMsj extends Usuario{

    private ArrayList<Mensaje> listaMensajes = new ArrayList();
    private ArrayList<Mensaje> enviado = new ArrayList();
    private ArrayList<Mensaje> recibido = new ArrayList();
    private String nombre, apellido;

    public UsuarioMsj() {
        super();
    }

    public UsuarioMsj(String nombre, String apellido, String usuario) {
        super(usuario);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public ArrayList<Mensaje> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensaje> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public void agregarMensaje(Mensaje m){
        this.listaMensajes.add(m);
    }
    
    public void enviarMensaje(Mensaje m){
        this.listaMensajes.add(m);
    }
    
    public void recibirMensaje(Mensaje m){
        this.listaMensajes.add(m);
    }
    
}
