import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    boolean continuar = true;
    System.out.println("Elija la figura que desea calcular: ");
    System.out.println("1- Tríangulo: ");
    System.out.println("2- Cuadrado ");
    System.out.println("3 - Círculo");

      String tipoFigura = sc.nextLine();

      if (tipoFigura.equals("1")) {
        System.out.println("Inserta los valores para base: ");
        double base = sc.nextDouble();
        System.out.println("Inserta los valores para altura: ");
        double altura = sc.nextDouble();

        // Crear objeto triangulo
        Triangulo tr = new Triangulo(base, altura);
        System.out.println("El area del tríangulo es: " + tr.calcularArea());

      } else if (tipoFigura.equals("2")) {
        System.out.println("Inserta los valores para el lado A: ");
        double ladoA = sc.nextDouble();
        System.out.println("Inserta los valores para el lado B: ");
        double ladoB = sc.nextDouble();
        Cuadrado cuadrado = new Cuadrado(ladoA, ladoB);
        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());

      } else if (tipoFigura.equals("3")) {
        System.out.println("Inserta los valores para el radio del circulo: ");
        double radio = sc.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("El area del círculo es: " + circulo.calcularArea());

      } else {
        System.out.println("El valor ingresado no es una opción valída");
      }
  }
}
