//Constructor del jugador 
//Se identifica con nombre
//Tiene 7 fichas asignadas al azar
//Guardar en lista circular

package practica1estructuras;

public class Jugador {

    public String nombre;
    public int punteo;
    public Ficha primera;
    public Ficha ultima;
    public Jugador siguiente;

    public Jugador() {
        nombre = null;
        punteo = 0;
        primera = null;
        ultima = null;
        siguiente = null;
    }

    public Jugador(String name, int p) {
        nombre = name;
        punteo = p;
        primera = null;
        ultima = null;
        siguiente = null;
    }
    
}
