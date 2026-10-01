import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int not = scanner.nextInt();

        if (not >= 85) {
            System.out.println("Notunuz A");
        } else if (not >= 75) {
            System.out.println("Notunuz B");
        } else if (not >= 70) {
            System.out.println("Notunuz C");
        } else if (not >= 50) {
            System.out.println("Notunuz D");
        } else {
            System.out.println("Notunuz F");
        }
    }
}