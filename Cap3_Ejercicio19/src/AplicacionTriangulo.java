import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacionTriangulo extends JFrame {
    private JPanel MainPanel;
    private JPanel pnlTitulo;
    private JPanel pnlContenido;
    private JPanel pnlResultados;
    private JLabel lbPerimetro;
    private JLabel lbAltura;
    private JLabel lbArea;
    private JTextField textPerimetro;
    private JTextField textAltura;
    private JTextField textArea;
    private JPanel pnlDatos;
    private JLabel Valor;
    private JButton btnCalcular;
    private JButton btnBorrar;
    private JLabel lbTitulo;
    private JTextField textValor;

    public static void main(String[] args) {
        AplicacionTriangulo aplicacionTriangulo = new AplicacionTriangulo();
        aplicacionTriangulo.setVisible(true);
    }

    public AplicacionTriangulo() {
        super("Calcular perimetro, Altura y Area de un triangulo equilatero");
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(textValor.getText());
                textPerimetro.setText(String.valueOf(Perimetro.Calcular_Perimetro(valor)));
                textAltura.setText(String.valueOf(Altura.Calcular_Altura(valor)));
                textArea.setText(String.valueOf(Area.Calcular_Area(valor)));
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                textAltura.setText("");
                textPerimetro.setText("");
                textValor.setText("");
            }
        });
    }
}

