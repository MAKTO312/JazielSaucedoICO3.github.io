import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumaGUI {
    private Frame f;
    private Panel pan1;
    private Panel pan2;
    private Panel pan3;
    private Panel pan4;

    private JLabel lblInstruccion, lblInstruccion2, lblNum1, lblNum2, lblResultado;
    private TextField tfNum1, tfNum2, tfResultado;
    private Button btSalir, btCalcular;
    private Checkbox cbSuma, cbResta, cbMultiplicacion, cbDivision;
    private CheckboxGroup operacionesGroup;

    public SumaGUI(){
        f = new Frame("Operaciones Aritméticas");
        pan1 = new Panel();
        pan2 = new Panel();
        pan3 = new Panel();
        pan4 = new Panel();

        lblInstruccion = new JLabel("Instrucciones: ");
        lblInstruccion2 = new JLabel("Ingresa dos números y selecciona una operación");
        lblNum1 = new JLabel("Primer número:");
        lblNum2 = new JLabel("Segundo número:");
        lblResultado = new JLabel("Resultado:");

        tfNum1 = new TextField(10);
        tfNum2 = new TextField(10);
        tfResultado = new TextField(15);
        tfResultado.setEditable(false);

        btCalcular = new Button("Calcular");
        btSalir = new Button("Salir");
        
        // Crear grupo para checkboxes (solo una selección a la vez)
        operacionesGroup = new CheckboxGroup();
        cbSuma = new Checkbox("Suma", operacionesGroup, true);
        cbResta = new Checkbox("Resta", operacionesGroup, false);
        cbMultiplicacion = new Checkbox("Multiplicación", operacionesGroup, false);
        cbDivision = new Checkbox("División", operacionesGroup, false);
    }

    public void acomodarFrame(){
        // Panel de instrucciones
        pan1.setLayout(new GridLayout(2, 1));
        pan1.add(lblInstruccion);
        pan1.add(lblInstruccion2);
        f.add(pan1, BorderLayout.NORTH);

        // Panel de números en horizontal
        pan2.setLayout(new FlowLayout());
        pan2.add(lblNum1);
        pan2.add(tfNum1);
        pan2.add(lblNum2);
        pan2.add(tfNum2);
        f.add(pan2, BorderLayout.CENTER);

        // Panel de operaciones
        pan3.setLayout(new FlowLayout());
        pan3.add(cbSuma);
        pan3.add(cbResta);
        pan3.add(cbMultiplicacion);
        pan3.add(cbDivision);
        f.add(pan3, BorderLayout.WEST);

        // Panel de resultados y botones
        pan4.setLayout(new FlowLayout());
        pan4.add(lblResultado);
        pan4.add(tfResultado);
        pan4.add(btCalcular);
        pan4.add(btSalir);
        f.add(pan4, BorderLayout.SOUTH);

        // Agregar ActionListener al botón Calcular
        btCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });

        // Agregar ActionListener al botón Salir
        btSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.setSize(500, 250);
        f.setVisible(true);
    }

    private void calcularResultado() {
        try {
            double num1 = Double.parseDouble(tfNum1.getText());
            double num2 = Double.parseDouble(tfNum2.getText());
            double resultado = 0;

            if (cbSuma.getState()) {
                resultado = num1 + num2;
            } else if (cbResta.getState()) {
                resultado = num1 - num2;
            } else if (cbMultiplicacion.getState()) {
                resultado = num1 * num2;
            } else if (cbDivision.getState()) {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    tfResultado.setText("Error: División por 0");
                    return;
                }
            }

            tfResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException ex) {
            tfResultado.setText("Error: Números inválidos");
        }
    }

    public static void main(String[] args){
        SumaGUI ventanaSuma = new SumaGUI();
        ventanaSuma.acomodarFrame();
    }
}