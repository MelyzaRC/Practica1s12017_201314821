
//Constructor de la ficha o letra 
//Guardar en cola
//Asignar al azar


package practica1estructuras;

public class Ficha {
    
    public String letra;
    public int puntos;
    public Palabra siguiente;
    public Palabra anterior;
    
    public Ficha(){
    letra = null;
    puntos = 0;
    siguiente = null;
    anterior = null;
    }
 
    public Ficha(String l, int p){
    letra = l;
    puntos = p;
    siguiente = null;
    anterior = null;
    }
    
}
