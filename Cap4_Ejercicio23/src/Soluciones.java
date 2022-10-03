public class Soluciones {
    public static String Calculo(double a, double b, double c) {
        double x1,x2,d;
        d = (b*b)-(4*a*c);
        if (d==0){
            x1 = (-b)/(2*a);
            return "La solucion es "+x1;
        }
        else if (d>0){
            x1 = ((-b)+(Math.sqrt(d)))/(2*a);
            x2 = ((-b)-(Math.sqrt(d)))/(2*a);
            return "Las soluciones son: \n x1: "+x1+"\n x2: "+x2;
        }
        else{
            return "no tiene solucion";
        }
    }
}
