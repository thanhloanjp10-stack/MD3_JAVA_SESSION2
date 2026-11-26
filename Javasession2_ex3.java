import java.util.Scanner;
public class Javasession2_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap 1 so nguyen duong N");
        int n = scanner.nextInt();
//        Kiem tra tinh hop le cua N
        if ( n<=0 ) {
            System.out.println("So nhap vao khong hop le");
        } else {
            int sum = 0;
//        Su dung vong lap for
            for(int i = 1; i <= n ; i++) {
                sum += i;
            }
//        Hien thi ket qua
            System.out.printf("Tong cac so tu 1 den %d la: %d",n,sum);
        }

    }
}
