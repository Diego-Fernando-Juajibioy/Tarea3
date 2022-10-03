import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoublePredicate;

public class Figuras extends JFrame{
    private JPanel pnlMain;
    private JLabel lbTitulo;
    private JPanel pnlContenido;
    private JPanel pnlCirculo;
    private JPanel pnlRectangulo;
    private JPanel pnlCuadrado;
    private JPanel pnlTriangulo;
    private JPanel pnlRombo;
    private JPanel pnlTrapecio;
    private JLabel lbCirculo;
    private JTextField textRadioC;
    private JLabel lbRadio;
    private JTextField textBaseRect;
    private JTextField textAlturaRect;
    private JLabel lbLongitud;
    private JLabel lbCuad;
    private JTextField textLongitud;
    private JTextField textBaseTriang;
    private JTextField textAltTriang;
    private JTextField textDiagMay;
    private JTextField textDiagMen;
    private JTextField textBaseMay;
    private JTextField textBaseMen;
    private JLabel lbBaseRect;
    private JLabel lbAlturaRect;
    private JLabel lbRectangulo;
    private JLabel lbTriang;
    private JLabel lbBaseTriang;
    private JLabel lbAlturaTriang;
    private JLabel lbRombo;
    private JLabel lbDiaglMay;
    private JLabel lbDiagMen;
    private JLabel lbTrap;
    private JLabel lbBaseMay;
    private JLabel lbBaseMen;
    private JButton btnBorrar;
    private JButton btnCalcular;
    private JTextField textLado;
    private JLabel lbLado;
    private JTextField textAlturaTr;
    private JLabel lbaltura;
    private JLabel lbLadoa;
    private JLabel lbLadob;
    private JTextField textLadoA;
    private JTextField textLadob;

    public static void main(String[] args) {
        Figuras figuras = new Figuras();
        figuras.setVisible(true);
    }
    public Figuras(){
        super("FIGURAS GEOMETRICAS");
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Radio = Double.parseDouble(textRadioC.getText());
                Circulo.Calculo(Radio);
                double Base = Double.parseDouble(textBaseRect.getText());
                double Altura = Double.parseDouble(textAlturaRect.getText());
                Rectangulo.Calculo(Base,Altura);
                double LongLad = Double.parseDouble(textLongitud.getText());
                Cuadrado.Calculo(LongLad);
                double basetri = Double.parseDouble(textBaseTriang.getText());
                double alttri = Double.parseDouble(textAltTriang.getText());
                Triangulo.Calculo(basetri,alttri);
                double diagM = Double.parseDouble(textDiagMay.getText());
                double diagMen = Double.parseDouble(textDiagMen.getText());
                double lado = Double.parseDouble(textLado.getText());
                Rombo.Calculo(diagM,diagMen,lado);
                double baseMy = Double.parseDouble(textBaseMay.getText());
                double baseMn = Double.parseDouble(textBaseMen.getText());
                double alturatra = Double.parseDouble(textAlturaTr.getText());
                double ladoa = Double.parseDouble(textLadoA.getText());
                double ladob = Double.parseDouble(textLadob.getText());
                Trapecio.Calculo(baseMy,baseMn,alturatra,ladoa,ladob);
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAltTriang.setText("");
                textRadioC.setText("");
                textAlturaRect.setText("");
                textLongitud.setText("");
                textBaseTriang.setText("");
                textAltTriang.setText("");
                textDiagMay.setText("");
                textDiagMen.setText("");
                textLado.setText("");
                textBaseMay.setText("");
                textBaseMen.setText("");
                textAlturaTr.setText("");
                textLadoA.setText("");
                textLadob.setText("");
            }
        });
    }
}
