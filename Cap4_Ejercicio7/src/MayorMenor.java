import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MayorMenor extends JFrame{
    private JPanel MainPanel;
    private JLabel lbTitulo;
    private JPanel pnlContenido;
    private JLabel lbA;
    private JTextField textA;
    private JLabel lbB;
    private JTextField textB;
    private JButton btnComprobar;
    private JButton btnBorrar;
    private JTextField textResultado;

    public static void main(String[] args) {
        MayorMenor mayormenor = new MayorMenor();
        mayormenor.setVisible(true);
    }
    public MayorMenor() {
        super("Calcular perimetro, Altura y Area de un triangulo equilatero");
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();


        btnComprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(textA.getText());
            int b = Integer.parseInt(textB.getText());
            textResultado.setText(String.valueOf(Verificacion.Verificar(a,b)));
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResultado.setText("");
                textA.setText("");
                textB.setText("");
            }

        });
    }
}

