public class Estacion {

    private double frecuenciaFm;
    private int frecuenciaAm;

    public Estacion(double fF, int fA){
        this.frecuenciaFm = fF;
        this.frecuenciaAm = fA;
    }
    /**
     * Metodo para obtener la frecuencia FM guardada 
     */
    public double getFM(){
        return frecuenciaFm;
    }
    /**
     * Metodo para obtener la frecuencia AM guardada 
     */
    public int getAM(){
       return frecuenciaAm;
    }
}
