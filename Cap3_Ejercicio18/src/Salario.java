
public class Salario {
    public static Object Calcular_Salario(int codigo, String nombre, double valor, double horas, double porcentaje) {
        double sbruto,sneto;

        sbruto = horas*valor;
        sneto = sbruto-(sbruto*(porcentaje/100));

        String m = codigo+","+nombre+","+sbruto+","+sneto;
        return m;
    }
}
