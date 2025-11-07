package como.krakedev.composicion;

public class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private Double estatura;
    private  int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

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
    public void imprimir(){
        if(direccion!=null){
            System.out.println("Persona: "+nombre+" Apellido: "+apellido+" Direccion: "+direccion.getCallePrincial()+" "+" "+direccion.getNumero()+" y "+direccion.getCalleSecundaria());

        }else{
            System.out.println("Persona: "+nombre+" Apellido: "+apellido+" Direccion: null");
        }

    }
}
