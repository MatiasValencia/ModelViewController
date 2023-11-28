package View;

import java.util.*;

public class Menu {
    public void imprimirUsuarios(ArrayList<String> listaUsuarios) {
        for (String u : listaUsuarios) {
            System.out.println(u);
        }
    }
    public void menuInicial(ArrayList<String> listaUsuarios) {
        int opcion;
        boolean menu = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Imprimir usuarios");
            System.out.println("2. Salir");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    imprimirUsuarios(listaUsuarios);
                    break;
                case 2:
                    menu = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while(menu);
        sc.close();
    }
}