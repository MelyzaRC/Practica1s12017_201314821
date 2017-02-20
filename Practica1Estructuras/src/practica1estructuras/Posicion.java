
package practica1estructuras;

import javax.swing.JLabel;


public class Posicion {
    public int fila;
    public int columna;
    public int bonus;
    public JLabel contenido;
    public Posicion izquierda;
    public Posicion derecha;
    public Posicion arriba;
    public Posicion abajo;
    
    public Posicion(){
    fila = 0;
    columna = 0;
    bonus = 0;
    contenido = null;
    izquierda = null;
    derecha = null;
    arriba = null;
    abajo = null;
    }
    public Posicion(int f, int c, int b, JLabel k){
    fila = f;
    columna = c;
    bonus = b;
    contenido = k;
    izquierda = null;
    derecha = null;
    arriba = null;
    abajo = null;
    }
}
