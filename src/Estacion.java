public class Estacion {

    private double frecuenciaFm;
    private int frecuenciaAm;

    public Estacion(double fF, int fA){
        this.frecuenciaFm = fF;
        this.frecuenciaAm = fA;
    }

    public double getFM(){
        return frecuenciaFm;
    }

    public int getAM(){
       return frecuenciaAm;
    }
}
