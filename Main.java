import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a medida de um lado do quadrado?");
    double lado = sc.nextDouble();
    double area = lado*lado;
    System.out.println("A area do quadrado é");
System.out.println(area);
    double perimetro = lado*4;
    System.out.println("e o perimetro é");
    System.out.println(perimetro);
    
  }
}