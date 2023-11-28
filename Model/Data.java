package Model;

import java.util.*;
import java.io.*;

public class Data {
    private ArrayList<Usuario> listaUsuarios;
    // Constructor
    public Data() {
        listaUsuarios = new ArrayList<>();
    }
    // Agregar usuario
    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }
    // Eliminar usuario
    public void eliminarUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }
    public void eliminarUsuario(String id) {
        Usuario aux = buscarUsuario(id);
        listaUsuarios.remove(aux);
    }
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    public Usuario buscarUsuario(String id) {
        Usuario aux = new Usuario();
        for (Usuario u : listaUsuarios) {
            if (u.getId() == id) {
                aux = u;
            }
        }
        return aux;
    }
    // Poblar ArrayList
    public void lecturaUsuarios(String directorio) {
        try(BufferedReader br = new BufferedReader(new FileReader(directorio))) {
            br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String [] datos = linea.split(","); 
                Usuario aux = new Usuario(datos[0], datos[1], datos[2], datos[3]);
                listaUsuarios.add(aux);
            }
            br.close();
        } catch(Exception e) {
            System.out.println("No se encontró el archivo");
        }
    }
    // Escritura
    public void escrituraUsuarios(String directorio) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(directorio))) {
            bw.write("ID,Nombre,Correo,Password\n");
            for (Usuario u : listaUsuarios) {
                bw.write(u.toString() + "\n");
            }
            bw.close();
        } catch(Exception e) {
            System.out.println("No se encontró el archivo");
        }
    }
    public void imprimirUsuarios() {
        for (Usuario u : listaUsuarios) {
            System.out.println(u.toString());
        }
    }
}
