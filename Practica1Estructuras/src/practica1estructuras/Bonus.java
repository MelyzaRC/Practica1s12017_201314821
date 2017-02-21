/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1estructuras;

public class Bonus {
public int fila;
public int columna;
public int bonus;
public Bonus siguiente;

public Bonus(){
fila = 0;
columna=0;
bonus = 1;
siguiente = null;
}

public Bonus(int f, int c,  int b){
fila = f;
columna=c;
bonus = b;
siguiente = null;
}

}
