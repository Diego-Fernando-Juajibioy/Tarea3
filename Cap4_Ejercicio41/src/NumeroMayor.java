import javax.swing.*;

public class NumeroMayor {
    public static void Calculo(String numsEnt) {
        String[] lista1 = numsEnt.split(",");
        int b = 0;
        for (int i = 0; i < lista1.length; i++) {
            int a = Integer.parseInt(lista1[i]);
            if ((a>b)) {
                b = a;
            }
            else if(a<b){
                b = b;
            }
            else {
                b = b;
            }
        }
        JOptionPane.showMessageDialog(null,"El numero mayor es :"+b,"RESULTADO MAYOR NUMERO" ,JOptionPane.PLAIN_MESSAGE);;
    }
}