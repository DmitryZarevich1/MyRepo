import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner abc = new Scanner(System.in);
      System.out.println("Введите вашу фамилию: ");
      String n1 = abc.next();
      System.out.println("Введите ваше имя: ");
      String n2 = abc.next();
      System.out.println("Введите ваше отчество: ");
      String n3 = abc.next();
      System.out.println("Welcome to Java, "+n2+"!!!");
      abc.close();
    }}