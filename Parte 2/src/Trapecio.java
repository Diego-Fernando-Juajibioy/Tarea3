import javax.swing.*;

public class Trapecio {
    public static void Calculo(double baseMy, double baseMn, double altura, double ladoa, double ladob) {
        double area = (baseMy+baseMn)+altura/2;
        double per = baseMy+baseMn+ladoa+ladob;
        JOptionPane.showMessageDialog(null, "El area del Trapecio es: " + area + ", el perimetro es: " + per);

    }
}
