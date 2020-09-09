import java.util.Scanner;
public class SwapMoney {
    public static void main(String[] args) {
        int rate = 23000;
        int inputUSD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiền đô");
        inputUSD = scanner.nextInt();
        int result = inputUSD * rate;
        System.out.println("Tiền việt là :" + result + "VND");
    }
}
