import java.util.Scanner;
public class Javasession2_ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap canh a:");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap canh b:");
        int b = scanner.nextInt();
        System.out.println("Moi ban nhap canh c:");
        int c = scanner.nextInt();
        // kiem tra dieu kien tao thanh tam giac hop le
        if (a > 0 && b > 0 && c > 0 && a+b > c && a+c > b && b+c > a) {
            // kiem tra 3 canh duong va tong 2 canh bat ky lon hon canh thu 3
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b && b == c && a == c) {
                System.out.println("Tam giac can");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Ba canh khong tao thanh tam giac.");

            }
        }
    }


