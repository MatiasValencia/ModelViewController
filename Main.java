import Model.*;

public class Main {
    public static void main(String[] args) {
        String directorio = "./Data/Usuarios.csv";
        Data data = new Data();
        data.lecturaUsuarios(directorio);
        data.imprimirUsuarios();
        
        Usuario aux = new Usuario("16","Juan","juancito@msn.com","ahtuvieja_xddcc");
        data.agregarUsuario(aux);
        data.escrituraUsuarios(directorio);
    }
}