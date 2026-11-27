
import java.util.Scanner;
public class Javasession2_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        do {
            System.out.print("Vui long nhap tuoi cua ban:");
            age = scanner.nextInt();
            if ( age<= 0) {
                System.out.println("Vui long nhap vao 1 so nguyen lon hon 0");
            }
        } while (age <= 0);
        System.out.printf("Tuoi cua ban la:%d!",age);
    }
}
