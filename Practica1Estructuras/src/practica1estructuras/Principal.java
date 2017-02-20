package practica1estructuras;

import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Posicion primeraPosicion= null;
    Posicion ultimaPosicion = null;
    Palabra primeraPalabra = null;
    Palabra ultimaPalabra = null;

    public Jugador primeroJugador = null;
    Jugador ultimoJugador = null;

    Ficha primeraFicha = null;
    Ficha ultimaFicha = null;

    Ficha a = new Ficha("A", 1);
    int contadorA = 12;
    int contadorAA = 0;
    Ficha b = new Ficha("B", 3);
    int contadorB = 2;
    int contadorBB = 0;
    Ficha c = new Ficha("C", 1);
    int contadorC = 4;
    int contadorCC = 0;
    Ficha d = new Ficha("D", 2);
    int contadorD = 5;
    int contadorDD = 0;
    Ficha e = new Ficha("E", 1);
    int contadorE = 12;
    int contadorEE = 0;
    Ficha f = new Ficha("F", 4);
    int contadorF = 1;
    int contadorFF = 0;
    Ficha g = new Ficha("G", 2);
    int contadorG = 2;
    int contadorGG = 0;
    Ficha h = new Ficha("H", 4);
    int contadorH = 2;
    int contadorHH = 0;
    Ficha i = new Ficha("I", 1);
    int contadorI = 6;
    int contadorII = 0;
    Ficha j = new Ficha("J", 8);
    int contadorJ = 1;
    int contadorJJ = 0;
    Ficha l = new Ficha("L", 1);
    int contadorL = 4;
    int contadorLL = 0;
    Ficha m = new Ficha("M", 3);
    int contadorM = 2;
    int contadorMM = 0;
    Ficha n = new Ficha("N", 1);
    int contadorN = 5;
    int contadorNN = 0;
    Ficha n_ = new Ficha("Ñ", 8);
    int contadorN_ = 1;
    int contadorNN_ = 0;
    Ficha o = new Ficha("O", 1);
    int contadorO = 9;
    int contadorOO = 0;
    Ficha p = new Ficha("P", 3);
    int contadorP = 2;
    int contadorPP = 0;
    Ficha q = new Ficha("Q", 5);
    int contadorQ = 1;
    int contadorQQ = 0;
    Ficha r = new Ficha("R", 1);
    int contadorR = 5;
    int contadorRR = 0;
    Ficha s = new Ficha("S", 1);
    int contadorS = 6;
    int contadorSS = 0;
    Ficha t = new Ficha("T", 1);
    int contadorT = 4;
    int contadorTT = 0;
    Ficha u = new Ficha("U", 1);
    int contadorU = 5;
    int contadorUU = 0;
    Ficha v = new Ficha("V", 4);
    int contadorV = 1;
    int contadorVV = 0;
    Ficha x = new Ficha("X", 8);
    int contadorX = 1;
    int contadorXX = 0;
    Ficha y = new Ficha("Y", 4);
    int contadorY = 1;
    int contadorYY = 0;
    Ficha z = new Ficha("Z", 10);
    int contadorZ = 1;
    int contadorZZ = 0;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel4.setText("jLabel1");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Agregar jugador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1037, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(531, 531, 531)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        if (nombre == null) {
            System.out.println("No ingresado");
        } else {
            Jugador nuevo = new Jugador(nombre, 0);
            addJugador(nuevo);
            try {
                generarArchivoImagen();
                generarImagen();
            } catch (Exception ex) {
                System.out.println("Scrabble dice: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
recorrerPalabras();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    //Metodos de jugador
    public void addJugador(Jugador actual) {
        if (primeroJugador == null) {
            primeroJugador = ultimoJugador = actual;
            JOptionPane.showMessageDialog(null, "El jugador " + actual.nombre.toUpperCase() + " ha sido registrado exitosamente.");
            System.out.println("Ingresado");
            generarArchivoImagen();
        generarImagen();
        } else if (verificarRepetido(actual.nombre)) {
            ultimoJugador.siguiente = actual;
            ultimoJugador = actual;
            ultimoJugador.siguiente = primeroJugador;
            JOptionPane.showMessageDialog(null, "El jugador " + actual.nombre.toUpperCase() + " ha sido registrado exitosamente.");
            System.out.println("Ingresado");
            generarArchivoImagen();
        generarImagen();
        } else {
            JOptionPane.showMessageDialog(null, "El nombre " + actual.nombre.toUpperCase() + " ya ha sido registrado.");
            System.out.println("Repetido");
        }
        
    }

    public boolean verificarRepetido(String nombre) {
        int contadorRepetidos = 0;
        Jugador bandera = primeroJugador;
        do {
            if (bandera.nombre.equals(nombre)) {
                contadorRepetidos++;
            }

            bandera = bandera.siguiente;

        } while (bandera != ultimoJugador.siguiente);

        if (contadorRepetidos == 0) {
            return true; // No hay repetidos
        } else {
            return false; // Si hay repetidos
        }
    }

    public void generarArchivoImagen() {
        String textArchivo = "digraph imagenJugador{\n";

        Jugador bandera = new Jugador();
        bandera = primeroJugador;

        do {
            if (bandera == primeroJugador && bandera == ultimoJugador) {
                textArchivo = textArchivo + bandera.nombre + ";";
            } else if (bandera == primeroJugador) {
                textArchivo = textArchivo + bandera.nombre;
            } else if (bandera == ultimoJugador) {
                textArchivo = textArchivo + "->" + bandera.nombre + "->" + primeroJugador.nombre + ";\n";
            } else {
                textArchivo = textArchivo + "->" + bandera.nombre + ";\n" + bandera.nombre;
            }
            bandera = bandera.siguiente;
        } while (bandera != ultimoJugador.siguiente);
        textArchivo = textArchivo + "}";

        try {
            File archivo = new File("C:\\release\\Estructuras\\archivoJugador.txt");
            if (archivo.exists()) {
                archivo.delete();
            }
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(textArchivo);
            escribir.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Scrabble dice: " + ex.getMessage());
        }

    }

    public void generarImagen() {
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
    //fin metodos de jugador

    //Metodos de ficha
    public void llenarColaFichas() {

        for (int index = 1; index < 8; index++) {
            valuarFicha(index);
        }
    }

    public void valuarFicha(int index) {
        int numero = (int) (Math.random() * 25) + 1;
        switch (numero) {
            case 1:
                if (contadorAA < contadorA) {
                    addFicha(a, index);
                    contadorAA++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 2:
                if (contadorBB < contadorB) {
                    addFicha(b, index);
                    contadorBB++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 3:
                if (contadorCC < contadorC) {
                    addFicha(c, index);
                    contadorCC++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 4:
                if (contadorDD < contadorD) {
                    addFicha(d, index);
                    contadorDD++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 5:
                if (contadorEE < contadorE) {
                    addFicha(e, index);
                    contadorEE++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 6:
                if (contadorFF < contadorF) {
                    addFicha(f, index);
                    contadorFF++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 7:
                if (contadorGG < contadorG) {
                    addFicha(g, index);
                    contadorGG++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 8:
                if (contadorHH < contadorH) {
                    addFicha(h, index);
                    contadorHH++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 9:
                if (contadorII < contadorI) {
                    addFicha(i, index);
                    contadorII++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 10:
                if (contadorJJ < contadorJ) {
                    addFicha(j, index);
                    contadorJJ++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 11:
                if (contadorLL < contadorL) {
                    addFicha(l, index);
                    contadorLL++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 12:
                if (contadorMM < contadorM) {
                    addFicha(m, index);
                    contadorMM++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 13:
                if (contadorNN < contadorN) {
                    addFicha(n, index);
                    contadorNN++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 14:
                if (contadorNN_ < contadorN_) {
                    addFicha(n_, index);
                    contadorNN_++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 15:
                if (contadorOO < contadorO) {
                    addFicha(o, index);
                    contadorOO++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 16:
                if (contadorPP < contadorP) {
                    addFicha(p, index);
                    contadorPP++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 17:
                if (contadorQQ < contadorQ) {
                    addFicha(q, index);
                    contadorQQ++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 18:
                if (contadorRR < contadorR) {
                    addFicha(r, index);
                    contadorRR++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 19:
                if (contadorSS < contadorS) {
                    addFicha(s, index);
                    contadorSS++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 20:
                if (contadorTT < contadorT) {
                    addFicha(t, index);
                    contadorTT++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 21:
                if (contadorUU < contadorU) {
                    addFicha(u, index);
                    contadorUU++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 22:
                if (contadorVV < contadorV) {
                    addFicha(v, index);
                    contadorVV++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 23:
                if (contadorXX < contadorX) {
                    addFicha(x, index);
                    contadorXX++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 24:
                if (contadorYY < contadorY) {
                    addFicha(y, index);
                    contadorYY++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 25:
                if (contadorZZ < contadorZ) {
                    addFicha(z, index);
                    contadorZZ++;
                } else {
                    llenarNulas(index);
                }
                break;
        }
    }

    public void addFicha(Ficha actual, int index) {
        if (primeraFicha == null) {
            primeraFicha = actual;
            ultimaFicha = actual;
            System.out.println(index + " - Ingresada Ficha: " + actual.letra);
        } else {
            ultimaFicha.siguiente = actual;
            ultimaFicha = ultimaFicha.siguiente;
            ultimaFicha.siguiente = null;
            System.out.println(index + " - Ingresada Ficha: " + actual.letra);
        }
    }

    public void llenarNulas(int index) {
        if (contadorAA < contadorA) {
            addFicha(a, index);
            contadorAA++;
        } else if (contadorBB < contadorB) {
            addFicha(b, index);
            contadorBB++;
        } else if (contadorCC < contadorC) {
            addFicha(c, index);
            contadorCC++;
        } else if (contadorDD < contadorD) {
            addFicha(d, index);
            contadorDD++;
        } else if (contadorEE < contadorE) {
            addFicha(e, index);
            contadorEE++;
        } else if (contadorFF < contadorF) {
            addFicha(f, index);
            contadorFF++;
        } else if (contadorGG < contadorG) {
            addFicha(g, index);
            contadorGG++;
        } else if (contadorHH < contadorH) {
            addFicha(h, index);
            contadorHH++;
        } else if (contadorII < contadorI) {
            addFicha(i, index);
            contadorII++;
        } else if (contadorJJ < contadorJ) {
            addFicha(j, index);
            contadorJJ++;
        } else if (contadorLL < contadorL) {
            addFicha(l, index);
            contadorLL++;
        } else if (contadorMM < contadorM) {
            addFicha(m, index);
            contadorMM++;
        } else if (contadorNN < contadorN) {
            addFicha(n, index);
            contadorNN++;
        } else if (contadorNN_ < contadorN_) {
            addFicha(n_, index);
            contadorNN_++;
        } else if (contadorOO < contadorO) {
            addFicha(o, index);
            contadorOO++;
        } else if (contadorPP < contadorP) {
            addFicha(p, index);
            contadorPP++;
        } else if (contadorQQ < contadorQ) {
            addFicha(q, index);
            contadorQQ++;
        } else if (contadorRR < contadorR) {
            addFicha(r, index);
            contadorRR++;
        } else if (contadorSS < contadorS) {
            addFicha(s, index);
            contadorSS++;
        } else if (contadorTT < contadorT) {
            addFicha(t, index);
            contadorTT++;
        } else if (contadorUU < contadorU) {
            addFicha(u, index);
            contadorUU++;
        } else if (contadorVV < contadorV) {
            addFicha(v, index);
            contadorVV++;
        } else if (contadorXX < contadorX) {
            addFicha(x, index);
            contadorXX++;
        } else if (contadorYY < contadorY) {
            addFicha(y, index);
            contadorYY++;
        } else if (contadorZZ < contadorZ) {
            addFicha(z, index);
            contadorZZ++;
        }
    }

    public void recorrerFichas() {
        int at = 1;
        Ficha bandera = primeraFicha;
        while (bandera.siguiente != null) {
            System.out.println(at + "  - Letra: " + bandera.letra + " Puntos que da: " + bandera.puntos + "  Siguiente: " + bandera.siguiente.letra);
            at++;
            bandera = bandera.siguiente;
        }
        System.out.println("Hay: " + at);
    }
    //Fin metodos de ficha

    //Metodos de palabra
    public void addPalabra(Palabra nuevaPalabra) {
        if (primeraPalabra == null) {
            primeraPalabra = ultimaPalabra = nuevaPalabra;
        } else if (verificarPalabra(nuevaPalabra.palabra)) {
            ultimaPalabra.siguiente = nuevaPalabra;
            ultimaPalabra = nuevaPalabra;
            ultimaPalabra.siguiente = null;
            System.out.println("Agregada: " + nuevaPalabra.palabra);
        } else {
            System.out.println("Palabra Repetida");
            //Ya no ingresarla porque ya está
        }
    }

    public boolean verificarPalabra(String s) {
        int contadorRepetidos = 0;
        Palabra bandera = primeraPalabra;
        do {
            if (bandera.palabra.equals(s)) {
                contadorRepetidos++;
            }
            bandera = bandera.siguiente;
        } while (bandera != ultimaPalabra.siguiente);

        if (contadorRepetidos == 0) {
            return true; // No hay repetidos
        } else {
            return false; // Si hay repetidos
        }
    }

    public boolean buscarPalabra(String p) {
        Palabra bandera = new Palabra();
        bandera = primeraPalabra;
        int contador = 0;

        while (bandera != null) {
            if (p.equals(bandera.palabra)) {
                contador++;
            }
        }

        if (contador == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void recorrerPalabras(){
    Palabra bandera = new Palabra();
    bandera = primeraPalabra;
        while(bandera != null){
            System.out.println("Palabra: " + bandera.palabra);
            bandera = bandera.siguiente;
    }
    }
    //Fin metodos de palabra 

    //Creacion de tablero
    public void crearTablero(int dimension) {
        for (int i = 0; i < dimension; i++) {
            Posicion temp = new Posicion(i, 1, 0, null);
            if(primeraPosicion == null){
            primeraPosicion = temp;
            ultimaPosicion = temp;
            }else{
            ultimaPosicion.derecha = temp;
            ultimaPosicion = temp;
            ultimaPosicion.derecha = null;
            }
        }
    }
public void recorrerFila(){
Posicion bandera = new Posicion();
bandera = primeraPosicion;

while(bandera != null){
    System.out.println("posicion: " + bandera.columna);
    bandera = bandera.derecha;
}
}
    public void addPosicion(Posicion p){
    
    }
    //Fin creacion de tablero
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
