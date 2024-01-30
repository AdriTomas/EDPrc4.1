public class Usuario {

    
    public String nombre;
    public String apellidos;
    public String email;

    public Usuario(String nombre2, String apellidos2, String email2) {
        //TODO Auto-generated constructor stub
    }

    public void Usuario(String nombre, String apellidos, String email){
        this.apellidos = apellidos;
        this.email = email;
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }


    public void mostrar(){
        System.out.println("El nombre del usuario es: "+ getNombre());
        System.out.println("El apellido del usuario es: "+ getApellidos());
        System.out.println("El email del usuario es: "+ getEmail());
    }
    
}