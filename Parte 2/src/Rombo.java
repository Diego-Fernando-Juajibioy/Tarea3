import javax.swing.*;

public class Rombo {
    public static void Calculo(double diagMy,double diagMn, double lado) {
        double area = (diagMy*diagMn)/2;
        double per = 4*lado;
        JOptionPane.showMessageDialog(null, "El area del Rombo es: " + area + ", el perimetro es: " + per);

    }
}
