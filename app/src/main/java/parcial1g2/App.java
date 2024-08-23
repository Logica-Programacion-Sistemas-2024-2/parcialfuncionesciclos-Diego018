
package parcial1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);

        // Datos de entrada

        String decada = "";
        int avaluoVehiculo = 0;
        int cantidadDeVehiculos = 0;

        // Datos de salida

        double valorTotal = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("cuantos vehiculos desea calcular?: ");
            cantidadDeVehiculos = entradaDatos.nextInt();
            entradaDatos.nextLine();

            System.out.println("Ingrese la decada del modelo del vehiculo: (90, 00, 10, 20)");
            decada = entradaDatos.nextLine();

            System.out.print("Ingrese el avaluo del vehiculo: ");
            avaluoVehiculo = entradaDatos.nextInt();
            entradaDatos.nextLine();

            if (cantidadDeVehiculos < 0) {
                System.out.println("Error");
            }

            valorTotal = calcularTotalImpuestos(decada, avaluoVehiculo);

            System.out.println("La decada del modelo es: " + decada);
            System.out.println("El avaluo del vehiculo es: " + avaluoVehiculo);
            System.out.println("El total a pagar es: " + valorTotal);

        }

    }

    /*
     * Implemente una funcion llamada calcularTotalImpuestos que cumpla con las
     * siguientes caracteristicas
     * Recibe:
     * - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20,
     * Otra)
     * - Un entero que representa avaluo del vehiculo
     * Retorna:
     * - Un entero representando el valor total a pagar de los impuestos
     * Controlar errores retornando -1
     */
    // ------------------------------------------------------------------

    public static int calcularTotalImpuestos(String decada, int avaluoVehiculo) {
        try {

            double tasaRodamiento = 0;
            double tasaSeguro = 0;

            switch (decada) {
                case "90":
                    tasaRodamiento = 0.0409;
                    tasaSeguro = 0.00816;
                    break;

                case "00":
                    tasaRodamiento = 0.0434;
                    tasaSeguro = 0.00798;
                    break;

                case "10":
                    tasaRodamiento = 0.0493;
                    tasaSeguro = 0.00712;
                    break;

                case "20":
                    tasaRodamiento = 0.0568;
                    tasaSeguro = 0.00699;
                    break;

                default:
                    System.out.println("Error");
                    break;

            }

            return (int) ((double) avaluoVehiculo * tasaRodamiento) + (int) (avaluoVehiculo * tasaSeguro);

        } catch (Exception e) {

            return -1;

        }

    }

    // ------------------------------------------------------------------

}
