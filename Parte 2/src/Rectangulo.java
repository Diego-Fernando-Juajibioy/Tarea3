import javax.swing.*;

public class Rectangulo {
    public static void Calculo(double base, double altura) {
        double area = base*altura;
        double perimetro = (2*base)+(2*altura);
        JOptionPane.showMessageDialog(null,"El area del Rectangulo es: "+area+" y el perimetro es: "+perimetro);
    }
}
