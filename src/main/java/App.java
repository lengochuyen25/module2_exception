import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh dau tien cua tam giac: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh thu 2 cua tam giac: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap canh thu 3 cua tam giac: ");
        double c = scanner.nextDouble();
        try {
            Triangle.checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());


        }

    }

}

