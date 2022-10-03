import javax.swing.*;

public class Circulo {
    public static void Calculo(double Radio) {
        double area = Math.PI*Math.pow(Radio,2);
        double perimetro = Math.PI*2*Radio;
        JOptionPane.showMessageDialog(null,"El Area del circulo es: "+area+" y el perimetro es: "+perimetro);
    }

}
