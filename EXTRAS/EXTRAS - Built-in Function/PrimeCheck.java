import java.util.*;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) isPrime = false;
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
