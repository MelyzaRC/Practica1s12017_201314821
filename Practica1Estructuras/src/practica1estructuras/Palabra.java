
//Constructor de palabra
//Desde archivo
//Guardar en lista simple

package practica1estructuras;

public class Palabra {
    
public String palabra;
public Palabra siguiente;
public Palabra anterior;

public Palabra(){
palabra = null;
siguiente = null;
anterior = null;
}

public Palabra(String p){
palabra = p;
siguiente = null;
anterior = null;
}

}
