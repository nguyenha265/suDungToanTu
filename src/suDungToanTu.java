import java.util.Scanner;

public class suDungToanTu {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width : ");
        width = scanner.nextFloat();
        System.out.println("Enter heigth : ");
        heigth = scanner.nextFloat();
        float arena = width * heigth;
        System.out.println("arena = " + arena);

    }
}
