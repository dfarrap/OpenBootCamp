public class Main {
    public static void main(String[] args){
    /*Crear clase Persona.
        Crear variables las privadas edad, nombre y telefono de la clase Persona.
        Crear gets y sets de cada propiedad.
        Crear un objeto persona en el main.
        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
        por último muéstralas por consola.*/

    Persona persona= new Persona();

     persona.setEdad(30);
     persona.setNombre("Juan Perez");
     persona.setTelefono("3113445566");
     System.out.println(persona.getNombre());
     System.out.println(persona.getEdad());
     System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}
