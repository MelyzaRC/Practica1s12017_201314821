
//Constructor de la ficha o letra 
//Guardar en cola
//Asignar al azar


package practica1estructuras;

import javax.swing.JLabel;

public class Ficha {
    
    public String letra;
    public int puntos;
    public String imagen;
    public Palabra siguiente;
    public Palabra anterior;
    
    public Ficha(){
    letra = null;
    puntos = 0;
    imagen = null;
    siguiente = null;
    anterior = null;
    }
 
    public Ficha(String l, int p, String pic){
    letra = l;
    puntos = p;
    imagen = pic;
    siguiente = null;
    anterior = null;
    }
    
}
