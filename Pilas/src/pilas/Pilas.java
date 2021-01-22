package pilas;
import java.util.Stack;
/**
 *
 * @author Noemi
 */
public class Pilas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Vecinos> pila = new Stack<Vecinos>();
        Vecinos a = new Vecinos ("Roberto","centro");
        Vecinos b = new Vecinos ("Mauro","Cerro cuate");
        Vecinos c = new Vecinos ("Femima","Aviación");
        Vecinos d = new Vecinos ("Judith","Universidad");
        
        pila.push(a);//para agregar los datos a la pila
        pila.push(b);//para agregar los datos a la pila
        pila.push(c);//para agregar los datos a la pila
        pila.push(d);//para agregar los datos a la pila
        
        pila.pop();//Para eliminar el último valor agregado a la pila
        //System.out.println(pila.peek().getNombre());//Mostrará el último nombre agregado a la pila
        System.out.println(pila.peek().getColonia());//Mostrará la última colonia agregada a la pila  
    }   
}
