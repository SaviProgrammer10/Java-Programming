import java.util.*;

public class RemovePrime {

    // Remove all prime numbers from the ArrayList
    public static void solution(ArrayList<Integer> al) {

        // Loop in reverse order
        for(int i = al.size() - 1; i >= 0; i--) {

            if(isPrime(al.get(i))) {
                al.remove(i);
            }
        }
    }

    // Check whether a number is prime
    public static boolean isPrime(int n) {

        if(n <= 1) {
            return false;
        }

        for(int c = 2; c * c <= n; c++) {

            if(n % c == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter " + n + " integers:");

        for(int i = 0; i < n; i++) {
            al.add(scan.nextInt());
        }

        solution(al);

        System.out.println("Modified list (without primes): " + al);
    }
}