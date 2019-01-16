import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Radio radio = new Radio();
        Scanner input = new Scanner(System.in);
        String opcion1;
        Boolean in = true;
        Boolean on = false;
        do{
            System.out.println(radio.estadoActual());
            System.out.println("");
            System.out.println(radio.menu());
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
    }
}
