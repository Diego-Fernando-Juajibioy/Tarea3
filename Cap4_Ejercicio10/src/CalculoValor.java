import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoValor extends JFrame{
    private JPanel pnlMain;
    private JLabel lbTitulo;
    private JPanel pnlContenido;
    private JLabel lbNombre;
    private JTextField textNombre;
    private JLabel lbNumIns;
    private JTextField textNumIns;
    private JLabel lbPatri;
    private JButton btnCalcular;
    private JTextArea textResp;
    private JButton btnBorrar;
    private JTextField textPat;
    private JLabel lbEst;
    private JTextField textEst;

    public static void main(String[] args) {
        CalculoValor calculoValor = new CalculoValor();
        calculoValor.setVisible(true);
    }
    public CalculoValor(){
        super("Calcular Valor de inscripcion");
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numins = Integer.parseInt(textNumIns.getText());
                String nom = textNombre.getText();
                int pat =Integer.parseInt(textPat.getText());
                int est =Integer.parseInt(textEst.getText());

                textResp.setText(String.valueOf(ValorInscripcion.CALCULO(numins,nom,pat,est)));
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNumIns.setText("");
                textNombre.setText("");
                textPat.setText("");
                textEst.setText("");
                textResp.setText("");
            }
        });
    }
}
