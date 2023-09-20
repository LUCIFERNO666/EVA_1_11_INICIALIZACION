
/**
 *
 * @author isaac
 */
public class EVA_1_11_INICIALIZACION {
     public static void main(String[] args) {
        System.out.println("Hola mundo");
        int valor = 0; // inicializar la variable valor con 0
        System.out.println(valor);

        // Declaramos e inicializamos 3 variables de tipo double
        double salario = 0, iva = 0.16, subtotal = 10000;

        final int CALIFA_PASAR = 70; // Declaración de una constante con valor 70
        final String ESCUELA = "Instituto Tecnológico de Chihuahua II"; // Declaración de una constante de cadena

        System.out.println(ESCUELA); // Imprimir el valor de la constante ESCUELA
        System.out.println("La calificación mínima para pasar es");
        System.out.println(CALIFA_PASAR);

        // Error: No puedes asignar un valor a una constante después de su inicialización
        // CALIFA_PASAR = 100;
        // CALIFA_PASAR = 20;

        /*
        IGNORA
        VARIAS LÍNEAS DE TEXTO
        SI VAN A TIRAR MUCHO ROLLO
        */
        int x; // Esto ya es ignorado

        byte valores = 120; // Declaramos una variable byte con valor 120
        // Error: El valor 128 está fuera del rango de un byte (-128 a 127)
        // valores = 128;

        int miValor = Integer.MAX_VALUE; // Declaramos una variable con el valor máximo para un int
        System.out.println(miValor + 1); // Esto causará un desbordamiento y mostrará el valor mínimo de un int
    }
}






    
    
    
    
    

