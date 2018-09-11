

package proyectoat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class adminHora implements Runnable{
    
    JLabel hora;

    public adminHora(JLabel hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
        while(true){
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm");
            hora.setText(f.format(h));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                
            }
        }
    }

    

}
