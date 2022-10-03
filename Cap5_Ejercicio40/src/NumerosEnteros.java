import javax.swing.*;

public class NumerosEnteros {
    public static Object Numerosenteros(int a) {

            int raiz = Raiz_Cuadrada.RaizCuadrada(a);
            int cuadrado = Cuadrado.cuadrado(a);
            int cubo = Cubo.cubo(a);

            JOptionPane.showMessageDialog(null,"Numero: "+a+" su raiz es: "+raiz+", su cuadrado es: "+cuadrado+", su cubo es: "+cubo,"Calculo de Numeros", JOptionPane.PLAIN_MESSAGE);
        return "Terminado "+a;
    }
}

