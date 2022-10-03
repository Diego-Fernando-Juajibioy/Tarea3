import javax.swing.*;

public class Triangulo {
    public static void Calculo(double base, double altura) {
        double area = (base * altura) / 2;
        double hip = Math.pow((base * base) + (altura * altura), 0.5);
        double per = base + altura + hip;
        String tipo = "";
        if ((base == altura) && (base == hip) && (altura == hip)) {
            tipo = "equilatero";
        } else if ((base != altura) && (altura != hip) && (base != hip)) {
            tipo = "escaleno";
        } else
            tipo = "isoseles";
        JOptionPane.showMessageDialog(null, "El area del Triangulo es: " + area + ", el perimetro es: " + per + ", su hipotenusa es: " + hip + " y es de tipo: " + tipo);
    }
}
