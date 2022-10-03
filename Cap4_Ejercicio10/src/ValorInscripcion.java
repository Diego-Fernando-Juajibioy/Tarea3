public class ValorInscripcion {
    public static String CALCULO(int numins, String nom, int pat, int est) {
    int pagmat = 50000;
    String msg;

    if ((pagmat>2000000)&&(est>3)){
        pagmat = (int) (pagmat + 0.03*pat);
    }
    msg = ("El estudiante con numero de inscripcion "+numins+" y nombre "+nom+" debe pagar $"+pagmat);
    return msg;

    }
}
