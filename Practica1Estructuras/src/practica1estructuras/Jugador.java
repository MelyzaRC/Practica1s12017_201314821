//Constructor del jugador 
//Se identifica con nombre
//Tiene 7 fichas asignadas al azar
//Guardar en lista circular

package practica1estructuras;

public class Jugador {

    public String nombre;
    public int punteo;
    public Ficha fichas;
    public Jugador siguiente;

    public Jugador() {
        nombre = null;
        punteo = 0;
        fichas = null;
        siguiente = null;
    }

    public Jugador(String name, int p, Ficha fi) {
        nombre = name;
        punteo = p;
        fichas = fi;
        siguiente = null;
    }
    
}
