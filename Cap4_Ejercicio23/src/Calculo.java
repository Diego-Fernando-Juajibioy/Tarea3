import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculo extends JFrame {
    private JPanel pnlMain;
    private JLabel lbTitulo;
    private JPanel pnlContenido;
    private JTextField textC;
    private JTextField textB;
    private JTextField textA;
    private JLabel lbA;
    private JLabel lbB;
    private JLabel lbC;
    private JButton btnCalcular;
    private JButton btnBorrar;
    private JTextArea textResp;

    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        calculo.setVisible(true);
    }

    public Calculo() {
        super("Calcular Valor de inscripcion");
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Integer.parseInt(textA.getText());
                double b = Integer.parseInt(textB.getText());
                double c = Integer.parseInt(textC.getText());

                textResp.setText(String.valueOf(Soluciones.Calculo(a,b,c)));
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textA.setText("");
                textB.setText("");
                textC.setText("");
                textResp.setText("");
            }
        });
    }
}
