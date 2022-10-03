import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç km yol gitmek istersiniz : ");
        double yol,perKM=2.20;
        int start = 10;
        yol = scanner.nextDouble();
        double tutar = (yol*perKM)+start;
        tutar = (tutar<20) ? 20 : tutar;
        System.out.println("Ödeyeceğiniz tutar : " + tutar + " TL");

    }
}