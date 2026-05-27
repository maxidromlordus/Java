import java.util.Scanner;

import static ru.netology.service.CustomService.Calculate;

public class Home1Chapter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int m = scanner.nextInt();
        int result = Calculate(price, m);
        System.out.println(result);
    }

}
