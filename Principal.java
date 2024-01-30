import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Principal{
    public static void main(String[] args){
    System.out.println("Hola mundo");
    fechaHoraActual();
    int longitud = arrayLong();
    Usuario[] usuarios = new Usuario[longitud];
    rellenaArray(usuarios);
    mostrarUsuarios(usuarios);
    }

    public static void fechaHoraActual(){
    Date fechaHora = new Date();
        
         // Formateamos fecha y hora
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String todoFormateado = formato.format(fechaHora);
        
        // Mostramos la fecha y hora formateADA
        System.out.println("Hoy es: " + todoFormateado);
        }

    public static  int arrayLong(){
        int longitud = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la longitud del array");
        longitud = sc.nextInt();
        sc.nextLine();
        
        return longitud;

    }

    public static  Usuario[] rellenaArray(Usuario[] usuarios){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < usuarios.length; i++ ){
            System.out.println("====================");
            System.out.println("Usuario: " + i);
            System.out.println("====================");
            Usuario usuario = new Usuario(null, null, null);

            System.out.println("Escriba el nombre de usuario");
            usuario.nombre = sc.nextLine();
            System.out.println("Escriba los apellidos de usuario");
            usuario.apellidos = sc.nextLine();
            System.out.println("Escriba el email de usuario");
            usuario.email = sc.nextLine();

            

            usuarios[i] = usuario;

            

        }
        return usuarios;
        
    }

    public static void mostrarUsuarios(Usuario[] usuarios){
        for(int i = 0; i<usuarios.length; i++){
            usuarios[i].mostrar();
        }
    }
}
