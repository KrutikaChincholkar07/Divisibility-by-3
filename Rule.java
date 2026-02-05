import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (sum % 3 == 0)
            System.out.println(num + " is divisible by 3");
        else
            System.out.println(num + " is not divisible by 3");
    }
}
