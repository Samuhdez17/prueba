import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Cantidad;
        int Contador = 0;
        int Numeros_sumar;
        int Resultado = 0;

        System.out.println("Cuántos números quieres sumar");
        Cantidad = teclado.nextInt();

        do {
            System.out.println("Que numero quieres sumar");
            Numeros_sumar = teclado.nextInt();
            Contador++;
            Resultado = Resultado + Numeros_sumar;
        } while (Contador < Cantidad);{
            System.out.println("Tu resultado es " + Resultado);
        }

        System.out.println("Ahora un truco de magia....");
    }
}