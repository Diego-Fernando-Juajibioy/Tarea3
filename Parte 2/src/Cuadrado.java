import javax.swing.*;

public class Cuadrado {
    public static void Calculo(double lado) {
        double area = Math.pow(lado,2);
        double per = 4*lado;
        JOptionPane.showMessageDialog(null,"El area del Cuadrado es: "+area+" y el perimetro es: "+per);
    }
}
