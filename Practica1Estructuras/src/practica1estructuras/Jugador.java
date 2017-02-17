
package practica1estructuras;

public class Jugador {
public String nombre;
public Jugador siguiente;
public Jugador anterior;

public Jugador(){
nombre = null;
siguiente = null;
anterior = null;
}

public Jugador(String name){
nombre = name;
siguiente = null;
anterior = null;
}
}
