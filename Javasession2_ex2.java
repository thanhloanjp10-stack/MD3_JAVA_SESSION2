import java.util.Scanner;
public class Javasession2_ex2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 so tu 1-7");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("So 1 la chu nhat");
                break;
            case 2:
                System.out.println("So 2 la thu hai");
                break;
            case 3:
                System.out.println("So 3 la thu ba");
                break;
            case 4:
                System.out.println("So 1 la thu 4");
                break;
            case 5:
                System.out.println("So 5 la thu nam");
                break;
            case 6:
                System.out.println("So 6 la thu sau");
                break;
            case 7:
                System.out.println("So 7 la thu bay");
                break;
            default:
                System.out.println("so ban nhap khong hop le");
                break;

        }
    }
}
