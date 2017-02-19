//Constructor del jugador 
//Se identifica con nombre
//Tiene 7 fichas asignadas al azar
//Guardar en lista circular

package practica1estructuras;

public class Jugador {

    public String nombre;
    public Jugador siguiente;

    public Jugador() {
        nombre = null;
        siguiente = null;
    }

    public Jugador(String name) {
        nombre = name;
        siguiente = null;
    }
    
}
