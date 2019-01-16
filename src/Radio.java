import java.lang.reflect.Array;
import java.util.ArrayList;

public class Radio implements iRadio {

    private Boolean encendido = false;
    private Boolean esFm = true;
    private double frecuenciaFmActual = 97.7;
    private int frecuenciaAmActual = 1000;
    private ArrayList<Estacion> favoritos = new ArrayList<Estacion>();

    public Radio(){
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
        this.favoritos.add(new Estacion(97.5, 1000));
    }

    private static double LIMITE_INFERIORFM = 87.9;
    private static double LIMITE_SUPERIORFM = 107.9;
    private static int LIMITE_INFERIORAM = 530;
    private static int LIMITE_SUPERIORAM = 1610;
    private static double INCREMENTOFM = 0.2;
    private static int INCREMENTOAM = 10;

    public Boolean isOn(){
        return encendido;
    }

    @Override
    public boolean encendidoRadio() {

        encendido = !encendido;

        return false;
    }

    public String menu(){
        return "¿Cual de las siguientes acciones desea tomar?\nIngrese el numero de la opcion que quiere(1-6)\n\t1.Incrementar frecuencia\n\t2.Disminuir frecuencia\n\t3.Guardar estacion en favoritos\n\t4.Ir a favoritos\n\t5.Cambiar Fm/Am\n\t6.Encender o apagar la radio\n\t7.Salir del programa ";
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

        }else{
            frecuenciaAmActual = Math.min(frecuenciaAmActual += INCREMENTOAM, LIMITE_SUPERIORAM);
        }
        return 0;
    }

    @Override
    public double bajarFrecuencia() {
        if (esFm){
            frecuenciaFmActual = Math.max(frecuenciaFmActual -= INCREMENTOFM, LIMITE_INFERIORFM);
        }else{
            frecuenciaAmActual = Math.max(frecuenciaAmActual -= INCREMENTOAM, LIMITE_INFERIORAM);
        }
        return 0;
    }

    @Override
    public void setFavorito(int posicion) {
        if(posicion >0 && posicion <13){
            favoritos.set(posicion, new Estacion(frecuenciaFmActual, frecuenciaAmActual));
        }else{
            System.out.println("Solo existen los espacios 1 a 12!");
        }
    }

    @Override
    public double getFavorito(int posicion) {
        if(posicion >0 && posicion <13){
            if(esFm){
                frecuenciaFmActual = favoritos.get(posicion).getFM();

            }else{
                frecuenciaAmActual = favoritos.get(posicion).getAM();
            }
        }else{
            System.out.println("Solo existen los espacios 1 a 12!");
        }
        return 0;
    }

    @Override
    public boolean cambiarAmFm() {
        esFm = !esFm;
        return false;
    }
}
