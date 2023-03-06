public class Main {
    public static void main(String[] args) {

        /*PRIMERA PARTE
        Crear una función con tres parámetros que sean números que se suman entre sí.
        *Llamar a la función en el main y darle valores.*/

        int a = suma(1, 2, 3);
        System.out.println("suma:" + a);


        /*SEGUNDA PARTE*/
        Coche esteCoche = new Coche();
        esteCoche.AgregarPuerta();
        esteCoche.AgregarPuerta();
        esteCoche.AgregarPuerta();
        System.out.println("Puertas:" + esteCoche.puertas);
    }




    public static int suma (int a, int b, int c ){
        return a + b +c;
        }
    static class  Coche {
        public int puertas=0;
        public void AgregarPuerta() {
            puertas++;
        }
        Run 'Main ': Launching main class...
    }

}