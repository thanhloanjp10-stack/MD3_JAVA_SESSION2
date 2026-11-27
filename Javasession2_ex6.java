import java.util.Scanner;
public class Javasession2_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so vao:");
        int n = scanner.nextInt();
        if (n <0 ) {
            n = n * -1;
        }
        int tong = 0;
        while (n > 0) {
            tong = tong + n % 10; // lay so cuoi cong thang vao tong
            n = n / 10;           // xoa so cuoi di
        }
            System.out.println(tong);
        }
    }

