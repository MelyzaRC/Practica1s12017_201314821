package practica1estructuras;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class MainForm extends javax.swing.JFrame {

    Principal palabraPrincipal = new Principal();

    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MelyzaR\\Documents\\GitHub\\Practica1s12017_201314821\\Practica1Estructuras\\Recursos\\archivo.png")); // NOI18N
        jButton1.setText("Leer Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MelyzaR\\Documents\\GitHub\\Practica1s12017_201314821\\Practica1Estructuras\\Recursos\\play.png")); // NOI18N
        jButton2.setText("Jugar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML FILES", "xml");
        fileChooser.setFileFilter(filter);
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();

        if (file == null) {
            System.out.println("No se ha seleccionado ningun archivo.");
        } else {

            try {
                DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = f.newDocumentBuilder();
                Document doc = dBuilder.parse(file);
                doc.getDocumentElement().normalize();

                //Lee la dimension del tablero
                NodeList nodo = doc.getElementsByTagName("dimension");
                for (int i = 0; i < nodo.getLength(); i++) {
                    Node a = nodo.item(i);
                    Element e = (Element) a;
                    System.out.println("Dimension: " + e.getTextContent());
                    palabraPrincipal.dimension = Integer.parseInt(e.getTextContent());
                }

                //Lee las palabras del diccionario
                NodeList listadoDiccionario = doc.getElementsByTagName("diccionario");
                Node dic = listadoDiccionario.item(0);
                Element palabras = (Element) dic;
                NodeList listadoPalabra = palabras.getElementsByTagName("palabra");

                for (int i = 0; i < listadoPalabra.getLength(); i++) {
                    Node p = listadoPalabra.item(i);
                    Element e = (Element) p;
                    System.out.println("Palabra: " + e.getTextContent());
                    Palabra temp = new Palabra(e.getTextContent());
                    palabraPrincipal.addPalabra(temp);
                }

                //Lee los dobles 
                NodeList listadoDobles = doc.getElementsByTagName("dobles");
                Node dob = listadoDobles.item(0);
                Element dobles = (Element) dob;
                NodeList dobles_def = dobles.getElementsByTagName("casilla");

                for (int i = 0; i < dobles_def.getLength(); i++) {
                    Node px = dobles_def.item(i);
                    Element dx = (Element) px;
                    NodeList listadoX = dx.getElementsByTagName("x");
                    NodeList listadoY = dx.getElementsByTagName("y");

                    for (int a = 0; a < listadoX.getLength(); a++) {
                        Node posX = listadoX.item(0);
                        Element posXx = (Element) posX;
                        Node posY = listadoY.item(0);
                        Element posYy = (Element) posY;
                        Bonus bo = new Bonus(Integer.parseInt(posXx.getTextContent()), Integer.parseInt(posYy.getTextContent()), 2);
                        palabraPrincipal.addBonus(bo);
                        System.out.println("Casilla Doble \n" + "X: " + posXx.getTextContent() + " Y: " + posYy.getTextContent());
                    }
                }

                //Lee los triples
                NodeList listadoTriples = doc.getElementsByTagName("triples");
                Node trip = listadoTriples.item(0);
                Element triples = (Element) trip;
                NodeList triples_def = triples.getElementsByTagName("casilla");

                for (int i = 0; i < triples_def.getLength(); i++) {
                    Node px = triples_def.item(i);
                    Element dx = (Element) px;
                    NodeList listadoX = dx.getElementsByTagName("x");
                    NodeList listadoY = dx.getElementsByTagName("y");

                    for (int a = 0; a < listadoX.getLength(); a++) {
                        Node posX = listadoX.item(0);
                        Element posXx = (Element) posX;
                        Node posY = listadoY.item(0);
                        Element posYy = (Element) posY;
                        Bonus bo = new Bonus(Integer.parseInt(posXx.getTextContent()), Integer.parseInt(posYy.getTextContent()), 3);
                        palabraPrincipal.addBonus(bo);
                        System.out.println("Casilla Triple\n" + "X: " + posXx.getTextContent() + " Y: " + posYy.getTextContent());
                    }
                }
                JOptionPane.showMessageDialog(this, "El archivo ha sido analizado, presione 'JUGAR' \n para iniciar el juego", "Scrabble dice", JOptionPane.INFORMATION_MESSAGE);
                jButton2.setEnabled(true);

            } catch (ParserConfigurationException | SAXException | IOException e) {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.setVisible(false);
        palabraPrincipal.crearTablero(palabraPrincipal.dimension);
        palabraPrincipal.asigArriba();
        palabraPrincipal.asigAbajo();
        palabraPrincipal.retirarIzquierda();
        palabraPrincipal.retirarDerecha();
        palabraPrincipal.recPosicion();
        palabraPrincipal.asignarBonus();
        palabraPrincipal.llenarColaFichas();
        palabraPrincipal.recorrerFichas();
        palabraPrincipal.archivoFichasGeneral();
        palabraPrincipal.generarImagenFichasGeneral();
        palabraPrincipal.setVisible(true);
        JOptionPane.showMessageDialog(this, "Debe ingresar Jugadores:\n-Menú Opciones\n-Agregar Jugador \n(Ctrl + A)", "Scrabble dice", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
