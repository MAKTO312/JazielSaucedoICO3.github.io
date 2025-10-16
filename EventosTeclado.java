

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class EventosTeclado extends JFrame {
    public EventosTeclado() {
        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25, 10, 350, 30);

        JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
        lblInstruccion.setBounds(25, 165, 200, 30);

        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);

        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30);

        KeyListener keyL = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {
                System.out.println("keyTyped");
            }

            @Override
            public void keyPressed(KeyEvent event) {
                System.out.println("keyPressed");
                
                if (event.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("Has presionado enter");
                }
                if (event.getKeyCode() == KeyEvent.VK_F1) {
                    System.out.println("Has presionado la tecla F1");
                }
                if (event.getKeyCode() == KeyEvent.VK_A) {
                    System.out.println("Has presionado la tecla a");
                }
            }

            @Override
            public void keyReleased(KeyEvent event) {
                System.out.println("keyReleased");
            }
        };

        campoSaludo.addKeyListener(keyL);

        add(lblSaludo);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);

        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        EventosTeclado objEventosTeclado = new EventosTeclado();
    }
}