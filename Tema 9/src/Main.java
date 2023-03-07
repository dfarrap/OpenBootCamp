public class Main {
    public static void main(String[] args) {

        /*Crea una clase Persona con las siguientes variables:
        La edad
        El nombre
        El teléfono
        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
        esta nueva clase tendrá la variable credito solo para esa clase.
        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
        tienes que darles valor y mostrarlas por pantalla.
        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga
        la clase Trabajador.
        */

        Cliente cliente1 = new Cliente();
        cliente1.credito= 100;
        cliente1.nombre="Pedro";
        cliente1.edad= 30;
        cliente1.telefono= "5678901";
        System.out.println("Nombre: " + cliente1.nombre);
        System.out.println("Edad: " + cliente1.edad);
        System.out.println("Telefono: " + cliente1.telefono  );
        System.out.println("Credito: " + cliente1.credito);
        System.out.println("-----");

        Trabajador trabajador1= new Trabajador();
        trabajador1.nombre= "Maria";
        trabajador1.edad= 35;
        trabajador1.telefono= "1234567";
        trabajador1.salario= 1000;
        System.out.println("Nombre: " + trabajador1.nombre );
        System.out.println("Edad: " + trabajador1.edad);
        System.out.println("Telefono: " + trabajador1.telefono);
        System.out.println("Salario:" + trabajador1.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona{
    double credito;
}

class Trabajador  extends Persona{
    int salario;
}