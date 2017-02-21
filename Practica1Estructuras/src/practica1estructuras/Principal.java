package practica1estructuras;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Principal extends javax.swing.JFrame {

    public int dimension = 10;

    Posicion primeraPosicion = null;
    Posicion ultimaPosicion = null;

    public Palabra primeraPalabra = null;
    public Palabra ultimaPalabra = null;

    public Jugador primeroJugador = null;
    public Jugador ultimoJugador = null;
    public Jugador jugadorActual = new Jugador();

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

    public MouseListener ml;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);

        ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                JComponent jc = (JComponent) me.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, me, TransferHandler.COPY);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };

        jLabel12.addMouseListener(ml);
        jLabel13.addMouseListener(ml);
        jLabel14.addMouseListener(ml);
        jLabel15.addMouseListener(ml);
        jLabel16.addMouseListener(ml);
        jLabel17.addMouseListener(ml);
        jLabel18.addMouseListener(ml);

        jLabel12.setTransferHandler(new TransferHandler("text"));
        jLabel13.setTransferHandler(new TransferHandler("text"));
        jLabel14.setTransferHandler(new TransferHandler("text"));
        jLabel15.setTransferHandler(new TransferHandler("text"));
        jLabel16.setTransferHandler(new TransferHandler("text"));
        jLabel17.setTransferHandler(new TransferHandler("text"));
        jLabel18.setTransferHandler(new TransferHandler("text"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Turno actual:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("---------------------");

        jTabbedPane1.addTab("Diccionario", jLabel1);
        jTabbedPane1.addTab("Fichas Activas", jLabel4);
        jTabbedPane1.addTab("Tablero", jLabel5);
        jTabbedPane1.addTab("Cola de Fichas", jLabel6);
        jTabbedPane1.addTab("Jugadores", jLabel7);

        jLabel8.setText("Puntuación Actual");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Ingresar nueva palabra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Opciones del Diccionario");

        jLabel10.setText("Opciones de Letras");

        jCheckBox1.setText("L");

        jLabel11.setText("Cambiar letras");

        jCheckBox2.setText("L");

        jCheckBox3.setText("L");

        jCheckBox4.setText("L");

        jCheckBox5.setText("L");

        jCheckBox6.setText("L");

        jCheckBox7.setText("L");

        jButton4.setText("Aplicar");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setBackground(java.awt.Color.black);
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("L");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel13.setBackground(java.awt.Color.black);
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("L");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel14.setBackground(java.awt.Color.black);
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("L");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel15.setBackground(java.awt.Color.black);
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("L");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel16.setBackground(java.awt.Color.black);
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("L");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel16.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel17.setBackground(java.awt.Color.black);
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("L");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel17.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel18.setBackground(java.awt.Color.black);
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("L");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Letras activas");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 204, 0));
        jButton5.setText("Validar");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Cancelar");

        jButton1.setText("Pasar de turno");
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(603, 603, 603)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(23, 23, 23))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel10)))
                                .addGap(7, 7, 7)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox7))
                            .addComponent(jCheckBox4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel19)
                                .addGap(162, 162, 162))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addGap(87, 87, 87)))))
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton1))
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jButton2)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox7))
                                .addComponent(jCheckBox4)
                                .addGap(7, 7, 7)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Jugadores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        if (nombre == null) {
            System.out.println("No ingresado");
        } else {
            Jugador nuevo = new Jugador(nombre, 0, null);
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
        jugadorActual = jugadorActual.siguiente;
        indicarTurno();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Ingrese una nueva palabra");
        if (nombre == null) {
            System.out.println("No ingresado");
        } else {
            Palabra nueva = new Palabra(nombre.toLowerCase());
            addPalabra(nueva);
            JOptionPane.showMessageDialog(this, "Palabra ingresada con éxito", "Scrabble dice", JOptionPane.INFORMATION_MESSAGE);

            try {
                generarArchivoPalabras();
                generarImagenPalabras();
            } catch (Exception ex) {
                System.out.println("Scrabble dice: " + ex.getMessage());
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearTablero(dimension);
        asigArriba();
        asigAbajo();
        recPosicion();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    //Metodos de jugador
    public void addJugador(Jugador actual) {
        if (primeroJugador == null) {
            primeroJugador = ultimoJugador = actual;
            JOptionPane.showMessageDialog(null, "El jugador " + actual.nombre.toUpperCase() + " ha sido registrado exitosamente.");
            System.out.println("Ingresado");
            jugadorActual = primeroJugador;
            indicarTurno();
            generarArchivoImagen();
            generarImagen();
        } else if (verificarRepetido(actual.nombre)) {
            ultimoJugador.siguiente = actual;
            ultimoJugador = actual;
            ultimoJugador.siguiente = primeroJugador;
            JOptionPane.showMessageDialog(null, "El jugador " + actual.nombre.toUpperCase() + " ha sido registrado exitosamente.");
            indicarTurno();
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

    public void indicarTurno() {
        jTextArea1.setText("");

        jLabel3.setText(jugadorActual.nombre);

        Jugador bn = new Jugador();
        bn = primeroJugador;

        while (bn != null) {
            if (bn == ultimoJugador) {
                jTextArea1.setText(jTextArea1.getText() + bn.nombre + ":  " + bn.punteo + "  Puntos\n");
                break;
            } else {
                jTextArea1.setText(jTextArea1.getText() + bn.nombre + ":  " + bn.punteo + "  Puntos\n");
                bn = bn.siguiente;
            }
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

    public void recorrerPalabras() {
        Palabra bandera = new Palabra();
        bandera = primeraPalabra;
        while (bandera != null) {
            System.out.println("Palabra: " + bandera.palabra);
            bandera = bandera.siguiente;
        }
    }

    public void generarArchivoPalabras() {
        String textArchivo = "digraph imagenPalabras{\n";

        Palabra bandera = new Palabra();
        bandera = primeraPalabra;

        do {
            if (bandera == primeraPalabra && bandera == ultimaPalabra) {
                textArchivo = textArchivo + bandera.palabra + ";";
            } else if (bandera == primeraPalabra) {
                textArchivo = textArchivo + bandera.palabra;
            } else if (bandera == ultimaPalabra) {
                textArchivo = textArchivo + "->" + bandera.palabra + ";\n";
            } else {
                textArchivo = textArchivo + "->" + bandera.palabra + ";\n" + bandera.palabra;
            }
            bandera = bandera.siguiente;
        } while (bandera != null);
        textArchivo = textArchivo + "}";

        try {
            File archivo = new File("C:\\release\\Estructuras\\archivoPalabras.txt");
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

    public void generarImagenPalabras() {
        try {
            String dotPath = "C:\\release\\bin\\dot.exe";
            String fileInputPath = "C:\\release\\Estructuras\\archivoPalabras.txt";
            String fileOutputPath = "C:\\release\\Estructuras\\imagenPalabras.png";
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
    //Fin metodos de palabra 

    //Creacion de tablero
    //Con esto creo las posiciones y les asigno su izquierda derecha pero aun no 
    //como matriz sino como una lista larga
    public void crearTablero(int dimension) {
        int posx = 21;
        int posy = 6;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                Posicion temp = new Posicion(i, j, 1, null);
                if (primeraPosicion == null) {
                    primeraPosicion = temp;
                    ultimaPosicion = temp;
                    JLabel nu = new JLabel();
                    nu.setBounds(posx, posy, 50, 50);
                    nu.setText("[Posición]");
                    Border border = LineBorder.createGrayLineBorder();
                    nu.setBorder(border);
                    nu.setVisible(true);
                    nu.addMouseListener(ml);
                    nu.setTransferHandler(new TransferHandler("text"));
                    add(nu);
                    System.out.println("Label creado");
                    posx = posx + 55;
                    posy = posy;
                    temp.contenido = nu;
                } else {
                    temp.izquierda = ultimaPosicion;
                    ultimaPosicion.derecha = temp;
                    ultimaPosicion = temp;
                    ultimaPosicion.derecha = null;
                    JLabel nu = new JLabel();
                    nu.setBounds(posx, posy, 50, 50);
                    nu.setText("[Posición]");
                    Border border = LineBorder.createGrayLineBorder();
                    nu.setBorder(border);
                    nu.setVisible(true);
                    nu.addMouseListener(ml);
                    nu.setTransferHandler(new TransferHandler("text"));
                    add(nu);
                    System.out.println("Label creado");
                    posx = posx + 55;
                    posy = posy;
                    temp.contenido = nu;
                }

            }
            posx = 21;
            posy = posy + 55;
        }
    }

    //Con esto les asigno su arriba abajo y si es el ultimo de la fila que su derecha = null y si es
    //el primero que su izquierda = null
    public void asigArriba() {
        Posicion bandera = new Posicion();
        bandera = primeraPosicion;

        while (bandera != null) {
            if (bandera.fila == 0) {
                bandera.arriba = null;
                System.out.println("Posicion: "+bandera.fila+"," + bandera.columna+ "  Arriba es null");
                bandera = bandera.derecha;
            } else {
                Posicion temp = new Posicion();
                temp = primeraPosicion;
                while (temp != null) {
                    if ((bandera.fila -1  == temp.fila) && (bandera.columna == temp.columna)) {
                        bandera.arriba = temp;
                        System.out.println("Posicion: "+bandera.fila+"," + bandera.columna+ "   Arriba tiene a : " + bandera.arriba.fila + "," + bandera.arriba.columna);
                        break;
                    }
                    temp = temp.derecha;

                }
                bandera = bandera.derecha;
            }

        }
    }
    
    public void asigAbajo(){
    Posicion bandera = new Posicion();
        bandera = primeraPosicion;

        while (bandera != null) {
            if (bandera.fila == dimension -1) {
                bandera.abajo = null;
                System.out.println("Posicion: "+bandera.fila+"," + bandera.columna+ "  Abajo es null");
                bandera = bandera.derecha;
            } else {
                Posicion temp = new Posicion();
                temp = primeraPosicion;
                while (temp != null) {
                    if ((bandera.fila +1  == temp.fila) && (bandera.columna == temp.columna)) {
                        bandera.abajo = temp;
                        System.out.println("Posicion: "+bandera.fila+"," + bandera.columna+ "   Abajo tiene a : " + bandera.abajo.fila + "," + bandera.abajo.columna);
                        break;
                    }
                    temp = temp.derecha;

                }
                bandera = bandera.derecha;
            }

        }
    }

    public void recPosicion() {
        Posicion bandera = new Posicion();
        bandera = primeraPosicion;
        while (bandera != null) {
            System.out.println("Posicion: " + bandera.fila + "," + bandera.columna);
            bandera = bandera.derecha;
        }
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
