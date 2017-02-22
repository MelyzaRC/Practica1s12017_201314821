package practica1estructuras;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Principal extends javax.swing.JFrame {

    public boolean jugarOK = false;

    public int dimension;

    public Ficha fichaRetirar = new Ficha();
    public Ficha asTemp = new Ficha();
    Posicion primeraPosicion = null;
    Posicion ultimaPosicion = null;

    public Bonus primerBonus = null;
    public Bonus ultimoBonus = null;

    public Palabra primeraPalabra = null;
    public Palabra ultimaPalabra = null;

    public Jugador primeroJugador = null;
    public Jugador ultimoJugador = null;
    public Jugador jugadorActual = new Jugador();

    public Ficha primeraFicha = null;
    public Ficha ultimaFicha = null;

    public Ficha a;
    int contadorA = 12;
    int contadorAA = 0;
    public Ficha b;
    int contadorB = 2;
    int contadorBB = 0;
    public Ficha c;
    int contadorC = 4;
    int contadorCC = 0;
    public Ficha d;
    int contadorD = 5;
    int contadorDD = 0;
    public Ficha e;
    int contadorE = 12;
    int contadorEE = 0;
    public Ficha f;
    int contadorF = 1;
    int contadorFF = 0;
    public Ficha g;
    int contadorG = 2;
    int contadorGG = 0;
    public Ficha h;
    int contadorH = 2;
    int contadorHH = 0;
    public Ficha i;
    int contadorI = 6;
    int contadorII = 0;
    public Ficha j;
    int contadorJ = 1;
    int contadorJJ = 0;
    public Ficha l;
    int contadorL = 4;
    int contadorLL = 0;
    public Ficha m;
    int contadorM = 2;
    int contadorMM = 0;
    public Ficha n;
    int contadorN = 5;
    int contadorNN = 0;
    public Ficha n_;
    int contadorN_ = 1;
    int contadorNN_ = 0;
    public Ficha o;
    int contadorO = 9;
    int contadorOO = 0;
    public Ficha p;
    int contadorP = 2;
    int contadorPP = 0;
    public Ficha q;
    int contadorQ = 1;
    int contadorQQ = 0;
    public Ficha r;
    int contadorR = 5;
    int contadorRR = 0;
    public Ficha s;
    int contadorS = 6;
    int contadorSS = 0;
    public Ficha t;
    int contadorT = 4;
    int contadorTT = 0;
    public Ficha u;
    int contadorU = 5;
    int contadorUU = 0;
    public Ficha v;
    int contadorV = 1;
    int contadorVV = 0;
    public Ficha x;
    int contadorX = 1;
    int contadorXX = 0;
    public Ficha y;
    int contadorY = 1;
    int contadorYY = 0;
    public Ficha z;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Turno actual:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("---------------------");

        jTabbedPane1.addTab("Diccionario", jLabel1);
        jTabbedPane1.addTab("Fichas Activas", jLabel4);
        jTabbedPane1.addTab("Cola de Fichas", jLabel6);
        jTabbedPane1.addTab("Jugadores", jLabel7);
        jTabbedPane1.addTab("Tablero", jLabel5);

        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Puntuación Actual");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Ingresar nueva palabra");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Opciones del Diccionario");

        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Opciones de Letras");

        jCheckBox1.setText("L");

        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Cambiar letras");

        jCheckBox2.setText("L");

        jCheckBox3.setText("L");

        jCheckBox4.setText("L");

        jCheckBox5.setText("L");

        jCheckBox6.setText("L");

        jCheckBox7.setText("L");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Aplicar");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 204, 0));
        jButton5.setText("Validar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Letras activas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 0, 0));
        jButton7.setText("Iniciar Juego");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("00:00:00");

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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(jCheckBox5))
                                        .addComponent(jLabel11)))
                                .addGap(12, 12, 12))))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Jugadores");

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
                cargarImagenPantallaPalabras();
            } catch (Exception ex) {
                System.out.println("Scrabble dice: " + ex.getMessage());
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jugarOK) {
            asignarFichasAJugador();
            recorrerFichas();
            ArchivoFichasActivas();
            generarImagenFichasActivas();
            imprimirJugadores();
        } else {
            JOptionPane.showMessageDialog(this, "No se han ingresado los jugadores", "Scrabble dice", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        devolverFichas();
        recorrerFichas();
        jugadorActual = jugadorActual.siguiente;
        indicarTurno();
        asignarFichasAJugador();
        //recorrerFichas();
        //ArchivoFichasActivas();
          //  generarImagenFichasActivas();
            imprimirJugadores();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    //Creacion de tablero
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
                    nu.setText("");
                    Border border = LineBorder.createGrayLineBorder();
                    nu.setBorder(border);
                    nu.addMouseListener(ml);
                    nu.setTransferHandler(new TransferHandler("text"));
                    add(nu);
                    nu.setVisible(true);
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
                    nu.setText("");
                    Border border = LineBorder.createGrayLineBorder();
                    nu.setBorder(border);

                    nu.addMouseListener(ml);
                    nu.setTransferHandler(new TransferHandler("text"));
                    add(nu);
                    nu.setVisible(true);
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

    public void asigArriba() {
        Posicion bandera = new Posicion();
        bandera = primeraPosicion;

        while (bandera != null) {
            if (bandera.fila == 0) {
                bandera.arriba = null;
                System.out.println("Posicion: " + bandera.fila + "," + bandera.columna + "  Arriba es null");
                bandera = bandera.derecha;
            } else {
                Posicion temp = new Posicion();
                temp = primeraPosicion;
                while (temp != null) {
                    if ((bandera.fila - 1 == temp.fila) && (bandera.columna == temp.columna)) {
                        bandera.arriba = temp;
                        System.out.println("Posicion: " + bandera.fila + "," + bandera.columna + "   Arriba tiene a : " + bandera.arriba.fila + "," + bandera.arriba.columna);
                        break;
                    }
                    temp = temp.derecha;

                }
                bandera = bandera.derecha;
            }

        }
    }

    public void asigAbajo() {
        Posicion bandera = new Posicion();
        bandera = primeraPosicion;

        while (bandera != null) {
            if (bandera.fila == dimension - 1) {
                bandera.abajo = null;
                System.out.println("Posicion: " + bandera.fila + "," + bandera.columna + "  Abajo es null");
                bandera = bandera.derecha;
            } else {
                Posicion temp = new Posicion();
                temp = primeraPosicion;
                while (temp != null) {
                    if ((bandera.fila + 1 == temp.fila) && (bandera.columna == temp.columna)) {
                        bandera.abajo = temp;
                        System.out.println("Posicion: " + bandera.fila + "," + bandera.columna + "   Abajo tiene a : " + bandera.abajo.fila + "," + bandera.abajo.columna);
                        break;
                    }
                    temp = temp.derecha;

                }
                bandera = bandera.derecha;
            }

        }
    }

    public void retirarIzquierda() {
        Posicion bandera = new Posicion();
        bandera = primeraPosicion;

        while (bandera != null) {
            if (bandera.columna == 0) {
                bandera.izquierda = null;
            }
            bandera = bandera.derecha;
        }
    }

    public void retirarDerecha() {
        Posicion bandera = new Posicion();
        bandera = primeraPosicion;

        while (bandera != null) {
            if (bandera.columna == dimension - 1) {
                Posicion temp = new Posicion();
                temp = bandera.derecha;
                bandera.derecha = null;
                bandera = temp;
            } else {
                bandera = bandera.derecha;
            }
        }
    }

    public void recPosicion() {
        Posicion bandera = new Posicion();
        bandera = primeraPosicion;
        while (bandera != null) {
            Posicion temp = new Posicion();
            temp = bandera;
            while (temp != null) {
                System.out.println("Posicion: " + temp.fila + "," + temp.columna + " de recorrido");
                temp = temp.derecha;
            }
            bandera = bandera.abajo;
        }
    }

    public void addBonus(Bonus actual) {
        if (primerBonus == null) {
            primerBonus = actual;
            ultimoBonus = actual;
            System.out.println("Se ha registrado una casilla de bonus: " + actual.fila + "," + actual.columna + "  x" + actual.bonus);
        } else {
            ultimoBonus.siguiente = actual;
            ultimoBonus = actual;
            ultimoBonus.siguiente = null;
            System.out.println("Se ha registrado una casilla de bonus: " + actual.fila + "," + actual.columna + "  x" + actual.bonus);
        }
    }

    public void asignarBonus() {
        Bonus bandera = new Bonus();
        bandera = primerBonus;

        while (bandera != null) {

            Posicion temp = new Posicion();
            temp = primeraPosicion;

            while (temp != null) {

                Posicion temp2 = new Posicion();
                temp2 = temp;
                while (temp2 != null) {
                    if ((temp2.fila == bandera.fila) && (temp2.columna == bandera.columna)) {
                        temp2.bonus = bandera.bonus;
                        temp2.contenido.setText("x" + String.valueOf(temp2.bonus));
                    }
                    temp2 = temp2.derecha;
                }
                temp = temp.abajo;
            }
            bandera = bandera.siguiente;
        }
    }
    //Fin creacion de tablero

    //Metodos de jugador
    public void addJugador(Jugador actual) {
        if (primeroJugador == null) {
            primeroJugador = ultimoJugador = actual;
            JOptionPane.showMessageDialog(null, "El jugador " + actual.nombre.toUpperCase() + " ha sido registrado exitosamente.");
            System.out.println("Ingresado");
            jugadorActual = primeroJugador;
            jugarOK = true;
            indicarTurno();
            generarArchivoImagen();
            cargarImagenPantalla();

        } else if (verificarRepetido(actual.nombre)) {
            ultimoJugador.siguiente = actual;
            ultimoJugador = actual;
            ultimoJugador.siguiente = primeroJugador;
            JOptionPane.showMessageDialog(null, "El jugador " + actual.nombre.toUpperCase() + " ha sido registrado exitosamente.");
            indicarTurno();
            System.out.println("Ingresado");
            generarArchivoImagen();
            generarImagen();
            cargarImagenPantalla();
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
            String fileOutputPath = "C:\\Users\\MelyzaR\\Documents\\GitHub\\Practica1s12017_201314821\\Practica1Estructuras\\src\\practica1estructuras\\imagenJugador.png";
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

    public void asignarFichasAJugador() {
        
        for (int asig = 0; asig < 7; asig++) {
            
            if (jugadorActual.primera == null) {
                Ficha fi = new Ficha();
                fi = primeraFicha.siguiente;
                jugadorActual.primera = primeraFicha;
                jugadorActual.ultima = primeraFicha;

                primeraFicha = fi;
                primeraFicha.siguiente = fi.siguiente;
                primeraFicha.anterior = null;
            } else {
                Ficha fi = new Ficha();
                fi = primeraFicha.siguiente;
                fichaRetirar.anterior = jugadorActual.ultima;
                jugadorActual.ultima.siguiente = primeraFicha;
                jugadorActual.ultima = primeraFicha;
                jugadorActual.ultima.siguiente = null;
                primeraFicha = fi;
                primeraFicha.siguiente = fi.siguiente;
                primeraFicha.anterior = null;
            }
        } 

    }

    public void generarImagenFichasActivas() {
        try {
            String dotPath = "C:\\release\\bin\\dot.exe";
            String fileInputPath = "C:\\release\\Estructuras\\archivoJugadorFichas.txt";
            String fileOutputPath = "C:\\Users\\MelyzaR\\Documents\\GitHub\\Practica1s12017_201314821\\Practica1Estructuras\\src\\practica1estructuras\\imagenFichasActivas.png";
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

    public void ArchivoFichasActivas() {
        String textArchivo = "digraph imagenFichasActivas{\n";

        Ficha bandera = new Ficha();
        bandera = jugadorActual.ultima;

        do {
            if (bandera == jugadorActual.primera && bandera == jugadorActual.ultima) {
                textArchivo = textArchivo + bandera.letra + ";";
            } else if (bandera == jugadorActual.ultima) {
                textArchivo = textArchivo + bandera.letra;
            } else if (bandera == jugadorActual.primera) {
                textArchivo = textArchivo + "->" + bandera.letra + ";\n";
            } else {
                textArchivo = textArchivo + "->" + bandera.letra + ";\n" + bandera.letra;
            }
            bandera = bandera.anterior;
        } while (bandera != null);
        textArchivo = textArchivo + "}";

        try {
            File archivo = new File("C:\\release\\Estructuras\\archivoJugadorFichas.txt");
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

    public void archivoFichasGeneral() {
        String textArchivo = "digraph imagenFichas{\n";

        Ficha bandera = new Ficha();
        bandera = ultimaFicha;
        char a = 34;
        do {
            if (bandera == primeraFicha && bandera == ultimaFicha) {
                textArchivo = textArchivo + bandera.letra + ";";
            } else if (bandera == ultimaFicha) {
                textArchivo = textArchivo + a + bandera.letra + a;
            } else if (bandera == primeraFicha) {
                textArchivo = textArchivo + "->" + a + bandera.letra + a + ";\n";
            } else {
                textArchivo = textArchivo + "->" + a + bandera.letra + a + ";\n" + bandera.letra;
            }
            bandera = bandera.anterior;
        } while (bandera != null);
        textArchivo = textArchivo + "}";

        try {
            File archivo = new File("C:\\release\\Estructuras\\archivoFichas.txt");
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

    public void generarImagenFichasGeneral() {
        try {
            String dotPath = "C:\\release\\bin\\dot.exe";
            String fileInputPath = "C:\\release\\Estructuras\\archivoFichas.txt";
            String fileOutputPath = "C:\\Users\\MelyzaR\\Documents\\GitHub\\Practica1s12017_201314821\\Practica1Estructuras\\src\\practica1estructuras\\imagenFichas.png";
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

    public void imprimirJugadores() {
        Jugador bandera = new Jugador();
        bandera = primeroJugador;

        while (bandera != null) {

            if (bandera == ultimoJugador) {
                if (bandera.primera != null) {
                    Ficha temp = new Ficha();
                    temp = bandera.primera;
                    String text = "El jugador: " + bandera.nombre + " Tiene las fichas: ";
                    while (temp != null) {
                        text = text + temp.letra + "  ";
                        temp = temp.siguiente;
                    }
                    System.out.println(text);
                }
                break;
            } else {
                if (bandera.primera != null) {
                    Ficha temp = new Ficha();
                    temp = bandera.primera;
                    String text = "El jugador: " + bandera.nombre + " Tiene las fichas: ";
                    while (temp != null) {
                        text = text + temp.letra + "  ";
                        temp = temp.siguiente;
                    }
                    System.out.println(text);
                }
                bandera = bandera.siguiente;
            }

        }
    }

    public void cargarImagenPantalla() {
        try {
            ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("imagenJugador.png"));
            Image imagen = icono.getImage();
            ImageIcon iconoEscalado = new ImageIcon(imagen.getScaledInstance(275, 460, Image.SCALE_SMOOTH));
            jLabel7.setIcon(iconoEscalado);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void devolverFichas(){
    Ficha fichaDevolver = new Ficha();
    fichaDevolver =jugadorActual.primera;
     
    while(fichaDevolver != jugadorActual.ultima.siguiente){
    addFicha(fichaDevolver,0);
    fichaDevolver = fichaDevolver.siguiente;
    }
    jugadorActual.primera = null;
    jugadorActual.ultima = null;
    
    }

    //fin metodos de jugador
    //Metodos de ficha
    public void llenarColaFichas() {
        int counter = 0;
        for (int index = 0; index < 95; index++) {
            valuarFicha(counter);
        }
    }

    public void valuarFicha(int index) {

        int numero = (int) (Math.random() * 25) + 1;
        switch (numero) {
            case 1:
                if (contadorAA < contadorA) {
                    a = new Ficha("A", 1);
                    addFicha(a, index);
                    contadorAA++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 2:
                if (contadorBB < contadorB) {
                    b = new Ficha("B", 3);
                    addFicha(b, index);
                    contadorBB++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 3:
                if (contadorCC < contadorC) {
                    c = new Ficha("C", 1);
                    addFicha(c, index);
                    contadorCC++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 4:
                if (contadorDD < contadorD) {
                    d = new Ficha("D", 2);
                    addFicha(d, index);
                    contadorDD++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 5:
                if (contadorEE < contadorE) {
                    e = new Ficha("E", 1);
                    addFicha(e, index);
                    contadorEE++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 6:
                if (contadorFF < contadorF) {
                    f = new Ficha("F", 4);
                    addFicha(f, index);
                    contadorFF++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 7:
                if (contadorGG < contadorG) {
                    g = new Ficha("G", 2);
                    addFicha(g, index);
                    contadorGG++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 8:
                if (contadorHH < contadorH) {
                    h = new Ficha("H", 4);
                    addFicha(h, index);
                    contadorHH++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 9:
                if (contadorII < contadorI) {
                    i = new Ficha("I", 1);
                    addFicha(i, index);
                    contadorII++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 10:
                if (contadorJJ < contadorJ) {
                    j = new Ficha("J", 8);
                    addFicha(j, index);
                    contadorJJ++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 11:
                if (contadorLL < contadorL) {
                    l = new Ficha("L", 1);
                    addFicha(l, index);
                    contadorLL++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 12:
                if (contadorMM < contadorM) {
                    m = new Ficha("M", 3);
                    addFicha(m, index);
                    contadorMM++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 13:
                if (contadorNN < contadorN) {
                    n = new Ficha("N", 1);
                    addFicha(n, index);
                    contadorNN++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 14:
                if (contadorNN_ < contadorN_) {
                    n_ = new Ficha("Ñ", 8);
                    addFicha(n_, index);
                    contadorNN_++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 15:
                if (contadorOO < contadorO) {
                    o = new Ficha("O", 1);
                    addFicha(o, index);
                    contadorOO++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 16:
                if (contadorPP < contadorP) {
                    p = new Ficha("P", 3);
                    addFicha(p, index);
                    contadorPP++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 17:
                if (contadorQQ < contadorQ) {
                    q = new Ficha("Q", 5);
                    addFicha(q, index);
                    contadorQQ++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 18:
                if (contadorRR < contadorR) {
                    r = new Ficha("R", 1);
                    addFicha(r, index);
                    contadorRR++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 19:
                if (contadorSS < contadorS) {
                    s = new Ficha("S", 1);
                    addFicha(s, index);
                    contadorSS++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 20:
                if (contadorTT < contadorT) {
                    t = new Ficha("T", 1);
                    addFicha(t, index);
                    contadorTT++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 21:
                if (contadorUU < contadorU) {
                    u = new Ficha("U", 1);
                    addFicha(u, index);
                    contadorUU++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 22:
                if (contadorVV < contadorV) {
                    v = new Ficha("V", 4);
                    addFicha(v, index);
                    contadorVV++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 23:
                if (contadorXX < contadorX) {
                    x = new Ficha("X", 8);
                    addFicha(x, index);
                    contadorXX++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 24:
                if (contadorYY < contadorY) {
                    y = new Ficha("Y", 4);
                    addFicha(y, index);
                    contadorYY++;
                } else {
                    llenarNulas(index);
                }
                break;
            case 25:
                if (contadorZZ < contadorZ) {
                    z = new Ficha("Z", 10);
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
            asTemp = primeraFicha;
            System.out.println(index + " - Ingresada Ficha: " + actual.letra);
        } else {
            ultimaFicha.siguiente = actual;
            ultimaFicha = actual;
            //ultimaFicha.siguiente = null;
            System.out.println(index + " - Ingresada Ficha: " + actual.letra);
        }
    }

    public void llenarNulas(int index) {
        if (contadorAA < contadorA) {
            a = new Ficha("A", 1);
            addFicha(a, index);
            contadorAA++;
        } else if (contadorBB < contadorB) {
            b = new Ficha("B", 3);
            addFicha(b, index);
            contadorBB++;
        } else if (contadorCC < contadorC) {
            c = new Ficha("C", 1);
            addFicha(c, index);
            contadorCC++;
        } else if (contadorDD < contadorD) {
            d = new Ficha("D", 2);
            addFicha(d, index);
            contadorDD++;
        } else if (contadorEE < contadorE) {
            e = new Ficha("E", 1);
            addFicha(e, index);
            contadorEE++;
        } else if (contadorFF < contadorF) {
            f = new Ficha("F", 4);
            addFicha(f, index);
            contadorFF++;
        } else if (contadorGG < contadorG) {
            g = new Ficha("G", 2);
            addFicha(g, index);
            contadorGG++;
        } else if (contadorHH < contadorH) {
            h = new Ficha("H", 4);
            addFicha(h, index);
            contadorHH++;
        } else if (contadorII < contadorI) {
            i = new Ficha("I", 1);
            addFicha(i, index);
            contadorII++;
        } else if (contadorJJ < contadorJ) {
            j = new Ficha("J", 8);
            addFicha(j, index);
            contadorJJ++;
        } else if (contadorLL < contadorL) {
            l = new Ficha("L", 1);
            addFicha(l, index);
            contadorLL++;
        } else if (contadorMM < contadorM) {
            m = new Ficha("M", 3);
            addFicha(m, index);
            contadorMM++;
        } else if (contadorNN < contadorN) {
            n = new Ficha("N", 1);
            addFicha(n, index);
            contadorNN++;
        } else if (contadorNN_ < contadorN_) {
            n_ = new Ficha("Ñ", 8);
            addFicha(n_, index);
            contadorNN_++;
        } else if (contadorOO < contadorO) {
            o = new Ficha("O", 1);
            addFicha(o, index);
            contadorOO++;
        } else if (contadorPP < contadorP) {
            p = new Ficha("P", 3);
            addFicha(p, index);
            contadorPP++;
        } else if (contadorQQ < contadorQ) {
            q = new Ficha("Q", 5);
            addFicha(q, index);
            contadorQQ++;
        } else if (contadorRR < contadorR) {
            r = new Ficha("R", 1);
            addFicha(r, index);
            contadorRR++;
        } else if (contadorSS < contadorS) {
            s = new Ficha("S", 1);
            addFicha(s, index);
            contadorSS++;
        } else if (contadorTT < contadorT) {
            t = new Ficha("T", 1);
            addFicha(t, index);
            contadorTT++;
        } else if (contadorUU < contadorU) {
            u = new Ficha("U", 1);
            addFicha(u, index);
            contadorUU++;
        } else if (contadorVV < contadorV) {
            v = new Ficha("V", 4);
            addFicha(v, index);
            contadorVV++;
        } else if (contadorXX < contadorX) {
            x = new Ficha("X", 8);
            addFicha(x, index);
            contadorXX++;
        } else if (contadorYY < contadorY) {
            y = new Ficha("Y", 4);
            addFicha(y, index);
            contadorYY++;
        } else if (contadorZZ < contadorZ) {
            z = new Ficha("Z", 10);
            addFicha(z, index);
            contadorZZ++;
        }
    }

    public void recorrerFichas() {
        int at = 1;
        Ficha fichaTemp = new Ficha();
        fichaTemp = primeraFicha;
        while (fichaTemp != null) {
            System.out.println(at + "  - Letra: " + fichaTemp.letra + " Puntos que da: " + fichaTemp.puntos);
            at++;
            fichaTemp = fichaTemp.siguiente;
        }
        System.out.println("Hay: " + at);
    }

    public void retirarFicha(JLabel label) {
        fichaRetirar = primeraFicha;
        label.setText(fichaRetirar.letra);
        Ficha fi = new Ficha();
        fi = primeraFicha.siguiente;
        primeraFicha = fi;
        recorrerFichas();
    }

    public void asignarALab() {
        retirarFicha(jLabel12);
        retirarFicha(jLabel13);
        retirarFicha(jLabel14);
        retirarFicha(jLabel15);
        retirarFicha(jLabel16);
        retirarFicha(jLabel17);
        retirarFicha(jLabel18);

        Ficha che = new Ficha();
        che = primeraFicha;
        jCheckBox1.setText(che.letra);
        che = che.siguiente;
        jCheckBox2.setText(che.letra);
        che = che.siguiente;
        jCheckBox3.setText(che.letra);
        che = che.siguiente;
        jCheckBox4.setText(che.letra);
        che = che.siguiente;
        jCheckBox5.setText(che.letra);
        che = che.siguiente;
        jCheckBox6.setText(che.letra);
        che = che.siguiente;
        jCheckBox7.setText(che.letra);
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
            String fileOutputPath = "C:\\Users\\MelyzaR\\Documents\\GitHub\\Practica1s12017_201314821\\Practica1Estructuras\\src\\practica1estructuras\\imagenPalabras.png";
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

    public void cargarImagenPantallaPalabras() {
        try {
            ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("imagenPalabras.png"));
            Image imagen = icono.getImage();
            ImageIcon iconoEscalado = new ImageIcon(imagen.getScaledInstance(275, 460, Image.SCALE_SMOOTH));
            jLabel1.setIcon(iconoEscalado);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    //Fin metodos de palabra 
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel20;
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
