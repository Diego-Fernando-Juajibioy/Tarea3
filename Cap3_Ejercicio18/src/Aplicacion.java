import javax.swing.*;
import java.awt.event.*;

public class Aplicacion extends JFrame{

    private JPanel PanelMain;
    private JTextField Codigo;
    private JTextField Nombre;
    private JPanel Titulo;
    private JPanel Contenido;
    private JTextField Horas;
    private JTextField Valor;
    private JPanel Datos;
    private JPanel Datos1;
    private JTextField Porcentaje;
    private JButton CALCULARButton;
    private JButton BORRARButton;
    private JLabel Resultado;
    private JTextField Resultadotxt;
    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion();
        aplicacion.setVisible(true);
    }

    public Aplicacion() {
        super("Calcular Salario bruto y neto");
        this.setContentPane(PanelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();

        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = Nombre.getText();
                int codigo = Integer.parseInt(Codigo.getText());
                double horas = Double.parseDouble(Horas.getText());
                double valor = Double.parseDouble(Valor.getText());
                double porcentaje = Double.parseDouble(Porcentaje.getText());
                Resultadotxt.setText(String.valueOf(Salario.Calcular_Salario(codigo,nombre,valor,horas,porcentaje)));
            }
        });
        BORRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Codigo.setText("");
                Nombre.setText("");
                Horas.setText("");
                Valor.setText("");
                Porcentaje.setText("");
                Resultadotxt.setText("");
            }
        });
    }
}



