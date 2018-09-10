

package proyectoat;

import java.io.Serializable;


public class Usuario implements Serializable {

    private String usuario, password;

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

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
