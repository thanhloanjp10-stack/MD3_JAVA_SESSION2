import java.util.Scanner;

public class Javasession2_ex1 {
    public static void main(String[] args) {
//        Sử dụng toán tử % để kiểm tra số chẵn (nếu n % 2 == 0) và số lẻ (nếu n % 2 != 0).
//Sử dụng câu lệnh điều khiển if-else để phân loại kết quả.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 so nguyen");
        int n = scanner.nextInt();
        if ( n % 2 ==0){
            System.out.printf("So ban nhap la so chan");
        } else {
            System.out.printf("So ban nhap la so le");
        }

    }
}
