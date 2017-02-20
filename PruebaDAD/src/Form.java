
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MelyzaR
 */
public class Form extends JFrame {

    JLabel pic1, pic2, pic3;

    public Form() {
        super("Drag and Drop Images");
        pic1 = new JLabel();
        pic2 = new JLabel();
        pic3 = new JLabel();

        pic1.setBounds(20, 30, 100, 100);
        pic2.setBounds(250, 30, 100, 100);
        pic3.setBounds(20, 140, 100, 100);

        pic1.setIcon(new ImageIcon("C:\\Users\\MelyzaR\\Desktop\\nave1.png"));
        pic2.setIcon(new ImageIcon("C:\\Users\\MelyzaR\\Desktop\\nave2.png"));
        
        pic1.setText("Lab1");
        pic2.setText("Lab2");
        pic3.setText("Lab3");

        MouseListener ml = new MouseListener() {
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

        
        pic1.addMouseListener(ml);
        pic2.addMouseListener(ml);
        pic3.addMouseListener(ml);
        
        
        pic1.setTransferHandler(new TransferHandler("text"));
        pic2.setTransferHandler(new TransferHandler("text"));
        pic3.setTransferHandler(new TransferHandler("text"));
        
        add(pic1);
        add(pic2);
        add(pic3);

        setLayout(null);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Form();
    }
}
