
//Constructor de la ficha o letra 
//Guardar en cola
//Asignar al azar


package practica1estructuras;

import javax.swing.JLabel;

public class Ficha {
    public String letra;
    public int puntos;
    public Ficha primera;
    public Ficha ultima;
    public Ficha siguiente;
    
    public Ficha(){
    letra = null;
    puntos = 0;
    primera = null;
    ultima = null;
    siguiente = null;
    }
 
    public Ficha(String l, int p, Ficha pri, Ficha ul){
    letra = l;
    puntos = p;
    primera = pri;
    ultima = ul;
    siguiente = null;
    }
    
}
