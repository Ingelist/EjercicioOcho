public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Betuel");
        System.out.println("Hola, yo soy " + persona.getNombre());
        persona.setEdad(50);
        System.out.println("y tengo " + persona.getEdad() + " años de edad");
        persona.setTelefono(897456321);
        System.out.println("Mi numero de teléfono es: " + persona.getTelefono() + ", y soy Mexicano");
    }
}
class Persona{
    private String nombre;
    private int edad;
    private  int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;


    }

}