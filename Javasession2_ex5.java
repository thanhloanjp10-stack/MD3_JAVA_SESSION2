import java.util.Scanner;

public class Javasession2_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 thang tu 1-12:");
        int thang = scanner.nextInt();
        if ( thang ==1 || thang ==3 || thang ==5 || thang ==7 || thang ==8 || thang ==10 || thang ==12){
            System.out.printf("Thang co 31 ngay");
        } else if ( thang ==4 || thang ==6 || thang ==9 || thang ==11) {
            System.out.printf("Thang co 30 ngay");
        } else if ( thang ==2) {
            System.out.printf("Thang co 28 hoac 29 ngay");
        } else {
            System.out.printf("Thang ban nhap khong hop le");
        }

    }

    }

