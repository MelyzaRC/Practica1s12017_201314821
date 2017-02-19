
//Constructor de la ficha o letra 
//Guardar en cola
//Asignar al azar


package practica1estructuras;

import javax.swing.JLabel;

public class Ficha {
    public String letra;
    public int puntos;
    public Ficha siguiente;
    
    public Ficha(){
    letra = null;
    puntos = 0;
    siguiente = null;
    }
 
    public Ficha(String l, int p){
    letra = l;
    puntos = p;
    siguiente = null;
    }
    
}
