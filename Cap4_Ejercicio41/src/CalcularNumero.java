import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularNumero extends JFrame{
    private JPanel pnlMain;
    private JLabel lbTitulo;
    private JPanel pnlContenido;
    private JLabel lbNum;
    private JTextField textNum;
    private JButton btnBorrar;
    private JButton btnCalcular;

    public static void main(String[] args) {
        CalcularNumero calcularNumero = new CalcularNumero();
        calcularNumero.setVisible(true);
    }
    public CalcularNumero() {
        super("CALCULAR NUMERO MAYOR");
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numsEnt = textNum.getText();
                NumeroMayor.Calculo(numsEnt);
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textNum.setText("");
            }
        });
    }
}





