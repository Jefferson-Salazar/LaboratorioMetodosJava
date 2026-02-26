package app;

//Importamos la clase Scanner para poder leer datos del usuario
import java.util.Scanner;

//Clase principal del proyecto
public class Metodos {

 // Creamos un objeto Scanner global para usarlo en todos los métodos
 static Scanner entrada = new Scanner(System.in);

//==================================================
//MÉTODO PRINCIPAL (MENÚ GENERAL)
//==================================================
 
 public static void main(String[] args) {

     // Variable que almacenará la opción seleccionada por el usuario
     int opcion = 0;

     // Ciclo do-while para que el menú se repita hasta que el usuario decida salir
     do {

         // Llamamos al método que muestra el menú
         mostrarMenu();

         try {
             // Pedimos al usuario que seleccione una opción
             System.out.print("Seleccione una opción: ");
             opcion = entrada.nextInt();
          // ------------------ MENÚ DE OPCIONES ------------------
             // Estructura switch para ejecutar el método correspondiente
             switch (opcion) {

                 case 1:
                     	calculadora();
                     	break;

                 case 2:
                	    validarContrasena();
                	    break;

                 case 3:
                	    numeroPrimo();
                	    break;

                 case 4:
                	    sumaNumerosPares();
                	    break;

                 case 5:
                	    conversionTemperatura();
                	    break;

                 case 6:
                	    contarVocales();
                	    break;

                 case 7:
             	    	factorial();
             	    	break;

                 case 8:
                	    juegoAdivinanza();
                	    break;

                 case 9:
                	    pasoPorReferencia();
                	    break;

                 case 10:
                	    tablaMultiplicar();
                	    break;

                 case 11:
                     System.out.println("Saliendo del programa...");
                     break;

                 default:
                     System.out.println("Opción no válida.");
             }

         } catch (Exception e) {
             // Mensaje si el usuario ingresa algo que no sea número
             System.out.println("Error: Debe ingresar un número.");
             entrada.nextLine(); // Limpiamos el buffer
         }

     } while (opcion != 11); // El programa se repite hasta que el usuario elija 11

 }

 // Método que muestra el menú principal
 public static void mostrarMenu() {

     System.out.println("\n===== MENÚ PRINCIPAL =====");
     System.out.println("1. Calculadora básica");
     System.out.println("2. Validación de contraseña");
     System.out.println("3. Número primo");
     System.out.println("4. Suma de números pares");
     System.out.println("5. Conversión de temperatura");
     System.out.println("6. Contador de vocales");
     System.out.println("7. Factorial");
     System.out.println("8. Juego de adivinanza");
     System.out.println("9. Intercambiar valores");
     System.out.println("10. Tabla de multiplicar");
     System.out.println("11. Salir");
 }
 
//==================================================
//EJERCICIO 1 - CALCULADORA BÁSICA
//==================================================
 
//Método que suma dos números
public static double suma(double a, double b) {
 return a + b;
}

//Método que resta dos números
public static double resta(double a, double b) {
 return a - b;
}

//Método que multiplica dos números
public static double multiplicacion(double a, double b) {
 return a * b;
}

//Método que divide dos números
public static double division(double a, double b) {
 if (b == 0) {
     System.out.println("Error: No se puede dividir entre cero.");
     return 0;
 }
 return a / b;
}

//Método principal de la calculadora
public static void calculadora() {

try {
    System.out.print("Ingrese el primer número: ");
    double num1 = entrada.nextDouble();

    System.out.print("Ingrese el segundo número: ");
    double num2 = entrada.nextDouble();

    System.out.println("Seleccione una operación:");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");

    System.out.print("Opción: ");
    int opcion = entrada.nextInt();

    switch (opcion) {

        case 1:
            System.out.println("Resultado: " + suma(num1, num2));
            break;

        case 2:
            System.out.println("Resultado: " + resta(num1, num2));
            break;

        case 3:
            System.out.println("Resultado: " + multiplicacion(num1, num2));
            break;

        case 4:
            System.out.println("Resultado: " + division(num1, num2));
            break;

        default:
            System.out.println("Opción inválida.");
    }

} catch (Exception e) {
    System.out.println("Error: Debe ingresar valores numéricos.");
    entrada.nextLine(); // limpiar buffer
}
}

//==================================================
//EJERCICIO 2 - VALIDACIÓN DE CONTRASEÑA
//==================================================

//Método que valida una contraseña usando do-while
public static void validarContrasena() {

String clave;

do {
    System.out.print("Ingrese la contraseña: ");
    clave = entrada.next();

    if (!clave.equals("1234")) {
        System.out.println("Contraseña incorrecta. Intente de nuevo.");
    }

} while (!clave.equals("1234"));

System.out.println("Acceso concedido.");
}

//==================================================
//EJERCICIO 3 - NÚMEROS PRIMOS
//==================================================

//Método que verifica si un número es primo
public static void numeroPrimo() {

  try {
      // Pedimos al usuario que ingrese un número
      System.out.print("Ingrese un número: ");
      int numero = entrada.nextInt();

      // Variable para verificar si es primo
      boolean esPrimo = true;

      // Los números menores o iguales a 1 no son primos
      if (numero <= 1) {
          esPrimo = false;
      } else {
          // Recorremos desde 2 hasta numero - 1
          for (int i = 2; i < numero; i++) {
              if (numero % i == 0) {
                  esPrimo = false;
                  break;
              }
          }
      }

      // Mostramos el resultado
      if (esPrimo) {
          System.out.println("El número " + numero + " es primo.");
      } else {
          System.out.println("El número " + numero + " no es primo.");
      }

  } catch (Exception e) {
      System.out.println("Error: Debe ingresar un número válido.");
      entrada.nextLine(); // Limpia el buffer
  }
}

//==================================================
//EJERCICIO 4 - SUMA DE NÚMEROS PARES
//==================================================

// Método que suma los números pares ingresados por el usuario
// El programa termina cuando el usuario ingresa 0
public static void sumaNumerosPares() {

  int numero = -1; // Inicializamos en -1 para entrar al ciclo
  int suma = 0;

  try {

      // Ciclo while que se ejecuta hasta que el usuario ingrese 0
      while (numero != 0) {

          System.out.print("Ingrese un número (0 para terminar): ");
          numero = entrada.nextInt();

          // Verificamos si el número es par
          if (numero % 2 == 0 && numero != 0) {
              suma += numero;
          }
      }

      System.out.println("La suma de los números pares ingresados es: " + suma);

  } catch (Exception e) {
      System.out.println("Error: Debe ingresar un número válido.");
      entrada.nextLine(); // Limpia el buffer
  }
}

//==================================================
//EJERCICIO 5 - CONVERSIÓN DE TEMPERATURA
//==================================================

//Método que convierte Celsius a Fahrenheit
public static double celsiusAFahrenheit(double c) {
 return (c * 9 / 5) + 32;
}

//Método que convierte Fahrenheit a Celsius
public static double fahrenheitACelsius(double f) {
 return (f - 32) * 5 / 9;
}

//Método principal para convertir temperaturas
public static void conversionTemperatura() {

 try {
     System.out.println("Seleccione una opción:");
     System.out.println("1. Celsius a Fahrenheit");
     System.out.println("2. Fahrenheit a Celsius");

     System.out.print("Opción: ");
     int opcion = entrada.nextInt();

     System.out.print("Ingrese la temperatura: ");
     double temp = entrada.nextDouble();

     if (opcion == 1) {
         System.out.println("Resultado: " + celsiusAFahrenheit(temp));
     } 
     else if (opcion == 2) {
         System.out.println("Resultado: " + fahrenheitACelsius(temp));
     } 
     else {
         System.out.println("Opción inválida.");
     }

 } catch (Exception e) {
     System.out.println("Error: Debe ingresar un valor numérico.");
     entrada.nextLine(); // limpiar buffer
 }
}

//==================================================
//EJERCICIO 6 - CONTADOR DE VOCALES
//==================================================
 
 // Método que cuenta las vocales de una cadena ingresada por el usuario
 public static void contarVocales() {

     try {
         entrada.nextLine(); // Limpiamos el buffer

         System.out.print("Ingrese una palabra o frase: ");
         String texto = entrada.nextLine();

         int contador = 0;

         // Convertimos el texto a minúsculas para facilitar la comparación
         texto = texto.toLowerCase();

         // Recorremos cada carácter del texto
         for (int i = 0; i < texto.length(); i++) {

             char letra = texto.charAt(i);

             if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                 contador++;
             }
         }

         System.out.println("La cantidad de vocales es: " + contador);

     } catch (Exception e) {
         System.out.println("Ocurrió un error.");
     }
 }
 
//==================================================
//EJERCICIO 7 - CÁLCULO DE FACTORIAL
//==================================================
 
 // Método que calcula el factorial de un número
 public static void factorial() {

     try {
         System.out.print("Ingrese un número entero positivo: ");
         int numero = entrada.nextInt();

         if (numero < 0) {
             System.out.println("No existe factorial para números negativos.");
             return;
         }

         long resultado = 1;

         // Ciclo para calcular el factorial
         for (int i = 1; i <= numero; i++) {
             resultado *= i;
         }

         System.out.println("El factorial de " + numero + " es: " + resultado);

     } catch (Exception e) {
         System.out.println("Error: Debe ingresar un número válido.");
         entrada.nextLine();
     }
 }
 
//==================================================
//EJERCICIO 8 - JUEGO DE ADIVINANZA
//==================================================
 
//Método del juego de adivinanza
public static void juegoAdivinanza() {

  int numeroSecreto = (int)(Math.random() * 100) + 1;
  int intento;

  System.out.println("Adivina el número entre 1 y 100");

  do {
      System.out.print("Ingresa tu número: ");
      intento = entrada.nextInt();

      if (intento < numeroSecreto) {
          System.out.println("El número es mayor.");
      } 
      else if (intento > numeroSecreto) {
          System.out.println("El número es menor.");
      } 
      else {
          System.out.println("¡Correcto! Adivinaste el número.");
      }

  } while (intento != numeroSecreto);
}

//==================================================
//EJERCICIO 9 - PASO POR REFERENCIA
//==================================================

//Método que intercambia los valores
public static void intercambiar(Numeros num) {
 int temp = num.a;
 num.a = num.b;
 num.b = temp;
}

//Método que demuestra el paso por referencia
public static void pasoPorReferencia() {

 System.out.print("Ingrese el primer número: ");
 int x = entrada.nextInt();

 System.out.print("Ingrese el segundo número: ");
 int y = entrada.nextInt();

 Numeros numeros = new Numeros(x, y);

 System.out.println("Antes del intercambio:");
 System.out.println("A = " + numeros.a);
 System.out.println("B = " + numeros.b);

 intercambiar(numeros);

 System.out.println("Después del intercambio:");
 System.out.println("A = " + numeros.a);
 System.out.println("B = " + numeros.b);
}
 
//==================================================
//EJERCICIO 10 - TABLA DE MULTIPLICAR
//==================================================

//Método que muestra la tabla de multiplicar de un número ingresado por el usuario
public static void tablaMultiplicar() {

   try {
       // Pedimos al usuario que ingrese un número
       System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
       int numero = entrada.nextInt();

       System.out.println("Tabla de multiplicar del " + numero + ":");

       // Ciclo for que genera la tabla del 1 al 10
       for (int i = 1; i <= 10; i++) {
           System.out.println(numero + " x " + i + " = " + (numero * i));
       }

   } catch (Exception e) {
       // Validación por si el usuario ingresa algo incorrecto
       System.out.println("Error: Debe ingresar un número válido.");
       entrada.nextLine(); // Limpiamos el buffer
   }
}

}

//==================================================
//CLASE AUXILIAR PARA SIMULAR PASO POR REFERENCIA
//==================================================

//Clase que contiene dos números
class Numeros {
 int a;
 int b;

 Numeros(int a, int b) {
     this.a = a;
     this.b = b;
 }
}