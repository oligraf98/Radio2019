import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Radio radio = new Radio();
        Scanner input = new Scanner(System.in);
        String opcion1;
        boolean in = true;
        do{
            System.out.println(radio.estadoActual());
            System.out.println("");
            System.out.println("¿Cual de las siguientes acciones desea tomar?\nIngrese el numero de la opcion que quiere(1-6)\n\t1.Incrementar frecuencia\n\t2.Disminuir frecuencia\n\t3.Guardar estacion en favoritos\n\t4.Ir a favoritos\n\t5.Cambiar Fm/Am\n\t6.Encender o apagar la radio\n\t7.Salir del programa ");
            opcion1 = input.nextLine();

            switch (opcion1){
                case "1":
                    if(!radio.isOn()){
                        System.out.println("Por favor encienda la radio antes de usarla.");
                    }else{
                        radio.subirFrecuencia();
                    }
                    break;
                case"2":
                    if(!radio.isOn()){
                        System.out.println("Por favor encienda la radio antes de usarla.");
                    }else{
                        radio.bajarFrecuencia();
                    }
                    break;
                case"3":
                    if(!radio.isOn()){
                        System.out.println("Por favor encienda la radio antes de usarla.");
                    }else{
                        System.out.println("Elija en que numero quiere guardar la estacion actual (1-12)");
                        String elNum = input.nextLine();
                        radio.setFavorito(Integer.parseInt(elNum));
                    }
                    break;
                case"4":
                    if(!radio.isOn()){
                        System.out.println("Por favor encienda la radio antes de usarla.");
                    }else{
                        System.out.println("Elija el numero de estacion (1-12)");
                        String elNum = input.nextLine();
                        radio.getFavorito(Integer.parseInt(elNum));
                    }
                    break;
                case"5":
                    if(!radio.isOn()){
                        System.out.println("Por favor encienda la radio antes de usarla.");
                    }else{
                        radio.cambiarAmFm();
                    }
                    break;
                case"6":
                    radio.encendidoRadio();
                    break;
                case"7":
                    System.out.println("Adios!");
                    in = false;
                    break;
                default:
                    System.out.println("La opcion que ingreso no es valida. Por favor intentelo de nuevo: ");
                    System.out.println("");
                    break;
            }

        }while(in);
        input.close();
    }
}
