package reigns;


import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import metodos.Metodos;

public class Reigns {

    public static void main(String[] args) {
        try{    //Try por posibles excepciones.
            metodos.Metodos obj = new Metodos();    //Instanciamos un objeto de la clase Metodos.
            obj.menu();    //Llamamos al metodo menu.
        }catch(NoSuchElementException e){ //Catch por posibles excepciones.
            JOptionPane.showMessageDialog(null, "Cerrando Reigns");
        }
    }
}
