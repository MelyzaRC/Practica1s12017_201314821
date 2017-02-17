//Constructor del jugador 
//Se identifica con nombre
//Tiene 7 fichas asignadas al azar
//Guardar en lista circular
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

    public boolean addJugador(Jugador actual, Jugador primero, Jugador ultimo, Ficha ficha) {
        try {
            if (!verificarRepetido(actual.nombre.toString(), primero, ultimo)) {
                if (primero == null) {
                    primero = actual;
                    ultimo = actual;
                    return true;
                } else {
                    ultimo.siguiente = actual;
                    ultimo = actual;
                    ultimo.siguiente = primero;
                    return true;
                }
            } else {
                return false;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Scrabble dice: " + ex.getMessage());
            return false;
        }

    }

    public boolean verificarRepetido(String nombre, Jugador primero, Jugador ultimo) {
        int contadorRepetidos = 0;
        Jugador bandera = new Jugador();
        bandera = primero;
        do {
            if (bandera.nombre.toString().compareTo(nombre) == 0) {
                contadorRepetidos++;
            }

            bandera = bandera.siguiente;

        } while (bandera.siguiente != primero.siguiente);

        if (contadorRepetidos == 0) {
            return false; // No hay repetidos
        } else {
            return true; // Si hay repetidos
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

    public void GenerarImagen(String rutaDot, String rutaArchivo, String rutaImagen) {
        try {
            String dotPath = rutaDot;
            String fileInputPath = rutaArchivo;
            String fileOutputPath = rutaImagen;
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

}
