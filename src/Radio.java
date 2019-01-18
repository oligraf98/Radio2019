import java.util.ArrayList;

public class Radio implements iRadio {

    private boolean encendido = false;
    private boolean esFm = true;
    private double frecuenciaFmActual = 97.7;
    private double frecuenciaAmActual = 1000;
//    private ArrayList<Estacion> favoritos = new ArrayList<Estacion>();
    private double [] favoritosFM = new double[12];
    private double[] favoritosAM = new double[12];

    public Radio(){
    	for(int i = 0; i < NUMERO_FAVORITOS; i++) {
            this.favoritosAM[i] = 1000;
            this.favoritosFM[i] = 97.7;
    	}
    }

    private static double 	LIMITE_INFERIORFM 	= 87.9;
    private static double 	LIMITE_SUPERIORFM 	= 107.9;
    private static double 	INCREMENTOFM 		= 0.2;
    private static int 		LIMITE_INFERIORAM 	= 530;
    private static int 		LIMITE_SUPERIORAM 	= 1610;
    private static int 		INCREMENTOAM 		= 10;
    private static int 		NUMERO_FAVORITOS 	= 12;

    public boolean isOn(){
        return encendido;
    }

    @Override
    public boolean encendidoRadio() {
        encendido = !encendido;
        return encendido;
    }

    public String estadoActual(){
        String frec;
        String sint;
        String onoff;
        if(encendido) {
            if (esFm) {
                sint = "Fm";
                frec = String.format("%.1f",frecuenciaFmActual);
            } else {
                sint = "Am";
                frec = String.valueOf(frecuenciaAmActual);
            }
            onoff = "encendida";
        }else{
            sint = "Radio apagada";
            frec = "Radio apagada";
            onoff = "Radio apagada";
        }
        String r = "Estado actual de la radio:\n\tEstacion: "+frec+"\n\tFm/Am: "+sint+"\n\tEncendido/Apagado: "+onoff;
        return r;
    }

    @Override
    public double subirFrecuencia() {
        if (esFm){
            frecuenciaFmActual = Math.min(frecuenciaFmActual+=INCREMENTOFM, LIMITE_SUPERIORFM);
            return frecuenciaFmActual;
        }else{
            frecuenciaAmActual = Math.min(frecuenciaAmActual += INCREMENTOAM, LIMITE_SUPERIORAM);
            return frecuenciaAmActual;
        }
    }

    @Override
    public double bajarFrecuencia() {
        if (esFm){
            frecuenciaFmActual = Math.max(frecuenciaFmActual -= INCREMENTOFM, LIMITE_INFERIORFM);
            return frecuenciaFmActual;
        }else{
            frecuenciaAmActual = Math.max(frecuenciaAmActual -= INCREMENTOAM, LIMITE_INFERIORAM);
            return frecuenciaAmActual;
        }
    }

    @Override
    public void setFavorito(int posicion) {
        favoritosFM[posicion - 1] = frecuenciaFmActual;
        favoritosAM[posicion - 1] = frecuenciaAmActual;
    }

    @Override
    public double getFavorito(int posicion) {
            if(esFm){
                frecuenciaFmActual = favoritosFM[posicion-1];
                return frecuenciaFmActual;
            }else{
                frecuenciaAmActual = favoritosAM[posicion-1];
                return frecuenciaAmActual;
            }

    }

    @Override
    public boolean cambiarAmFm() {
        esFm = !esFm;
        return esFm;
    }
}
