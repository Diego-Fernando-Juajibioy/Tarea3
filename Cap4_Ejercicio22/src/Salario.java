public class Salario {
    public static String Calculo(String nom, int salario, int horas) {
        int mensual=horas*salario;
        if (mensual>450000){
            return nom+" "+mensual;
        }
        else {
            return nom;
        }
    }
}
