import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoSalario extends JFrame{
    private JPanel pnlMain;
    private JLabel lbTitulo;
    private JPanel pnlContenido;
    private JTextField textNom;
    private JLabel lbSal;
    private JTextField textSal;
    private JTextField textHras;
    private JButton btnCalcular;
    private JTextArea textResp;
    private JButton btnBorrar;

    public static void main(String[] args) {
        CalculoSalario calculoSalario = new CalculoSalario();
        calculoSalario.setVisible(true);
    }

    public CalculoSalario(){
        super("Calcular Salario");
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textNom.getText();
                int sal = Integer.parseInt(textSal.getText());
                int hrs = Integer.parseInt(textHras.getText());

                textResp.setText(String.valueOf(Salario.Calculo(nom,sal,hrs)));
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResp.setText("");
                textHras.setText("");
                textNom.setText("");
                textSal.setText("");
            }
        });
    }
}
