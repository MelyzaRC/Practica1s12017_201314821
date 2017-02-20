//Constructor del jugador 
//Se identifica con nombre
//Tiene 7 fichas asignadas al azar
//Guardar en lista circular

package practica1estructuras;

public class Jugador {

    public String nombre;
    public int punteo;
    public Jugador siguiente;

    public Jugador() {
        nombre = null;
        punteo = 0;
        siguiente = null;
    }

    public Jugador(String name, int p) {
        nombre = name;
        punteo = p;
        siguiente = null;
    }
    
}
