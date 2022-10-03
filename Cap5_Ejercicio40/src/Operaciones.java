import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operaciones extends JFrame{
    private JPanel pnlMain;
    private JLabel lbTitulo;
    private JPanel pnlContenido;
    private JTextField textNum;
    private JLabel lbNumeros;
    private JButton btnCalcular;
    private JButton btnBorrar;
    private JTextArea textRespuesta;

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        operaciones.setVisible(true);
    }

    public Operaciones(){
        super("OPERACIONES RAIZ, CUADRADO Y CUBO DE NUMEROS ENTEROS");
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numsEnt = textNum.getText();
                String[] lista1 = numsEnt.split(",");
                for (int i = 0; i < lista1.length; i++) {
                    int a = Integer.parseInt(lista1[i]);
                    textRespuesta.setText(String.valueOf(NumerosEnteros.Numerosenteros(a)));
                }
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNum.setText(" ");
                textRespuesta.setText(" ");
            }
        });
    }
}
