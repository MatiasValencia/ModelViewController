package Controller;

import Model.*;
import View.*;
import java.util.*;

public class Controlador {
    private String archivo;
    Data data;
    Menu menu;
    public Controlador(String archivo) {
        this.archivo = archivo;
        data = new Data();
        menu = new Menu();
        data.lecturaUsuarios(archivo);
        ArrayList<String> listaUsuarios = new ArrayList<>();
        for (Usuario u : data.getListaUsuarios()) {
            listaUsuarios.add(u.toString());
        }
        menu.menuInicial(listaUsuarios);
    }
}
