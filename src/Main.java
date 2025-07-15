import java.util.Scanner;
    public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = "Tanvi";
        System.out.println("Hello world" + name);
        System.out.print("Enter a number : ");
        int a= scanner.nextInt();
        System.out.print("Enter a second Number : ");
        int b= scanner.nextInt();

        System.out.println(" Addition " + (a+b));

        scanner.close();




    }
}