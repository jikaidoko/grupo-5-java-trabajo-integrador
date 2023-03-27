package prode.datos;

public class Participante {

    private String nombre;
    private String apellido;

    //SE CREA EL METODO CONSTRUCTOR

    public Participante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //SE CREAN LOS METODOS GETTER AND SETTER DESDE EL IDE

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}