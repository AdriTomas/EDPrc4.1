import java.util.Date;
import java.text.SimpleDateFormat;

public class Principal{
    public static void main(String[] args){
    System.out.println("Hola mundo");
    fechaHoraActual();
    }

    public static void fechaHoraActual(){
    Date fechaHora = new Date();
        
         // Formateamos fecha y hora
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String todoFormateado = formato.format(fechaHora);
        
        // Mostramos la fecha y hora formateADA
        System.out.println("Hoy es: " + todoFormateado);
        }
}
