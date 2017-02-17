//Constructor del jugador 
//Se identifica con nombre
//Tiene 7 fichas asignadas al azar
//Guardar en lista circular
//Metodos
package practica1estructuras;

import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Jugador {

    public String nombre;
    public Ficha fichas;
    public Jugador siguiente;

    public Jugador() {
        nombre = null;
        fichas = null;
        siguiente = null;
    }

    public Jugador(String name, Ficha f) {
        nombre = name;
        fichas = f;
        siguiente = null;
    }

    public boolean addJugador(Jugador actual, Jugador primero, Jugador ultimo) {
       

            if (primero == null) {
                primero = actual;
                ultimo = actual;
                System.out.println("Ingresado");
                return true;
            } else {
            if (verificarRepetido(actual.nombre, primero, ultimo)) {
                ultimo.siguiente = actual;
                ultimo = actual;
                ultimo.siguiente = primero;
                System.out.println("Ingresado");
                return true;
            } else {
                System.out.println("Repetido");
                return false;
            }
            }
        

    }

    public boolean verificarRepetido(String nombre, Jugador primero, Jugador ultimo) {
        int contadorRepetidos = 0;
        Jugador bandera =  primero;
        do {
            if (bandera.nombre.equals(nombre)) {
                contadorRepetidos++;
            }

            bandera = bandera.siguiente;

        } while (bandera.siguiente != null);

        if (contadorRepetidos == 0) {
            return true; // No hay repetidos
        } else {
            return false; // Si hay repetidos
        }
    }

    public void generarArchivoImagen(Jugador primero, Jugador ultimo) {
        String textArchivo = "digraph imagenJugador{\n";

        Jugador bandera = new Jugador();
        bandera = primero;

        do {
            if (bandera == primero && bandera == ultimo) {
                textArchivo = textArchivo + bandera.nombre + ";";
            } else if (bandera == primero) {
                textArchivo = textArchivo + bandera.nombre;
            } else if (bandera == ultimo) {
                textArchivo = textArchivo + "->" + bandera.nombre + ";\n";
            } else {
                textArchivo = textArchivo + "->" + bandera.nombre + ";\n" + bandera.nombre;
            }
            bandera = bandera.siguiente;
        } while (bandera != null);
        textArchivo = textArchivo + "}";

        try {
            File archivo = new File("C:\\release\\Estructuras\\archivoJugador.txt");
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(textArchivo);
            escribir.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Scrabble dice: " + ex.getMessage());
        }

    }

    public void GenerarImagen() {
        try {
            String dotPath = "C:\\release\\bin\\dot.exe";
            String fileInputPath = "C:\\release\\Estructuras\\archivoJugador.txt";
            String fileOutputPath = "C:\\release\\Estructuras\\imagenJugador.png";
            String tParam = "-Tjpg";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Scrabble dice: " + ex.getMessage());
        } finally {
        }
    }

    public void cargarImagen() {

    }

}
