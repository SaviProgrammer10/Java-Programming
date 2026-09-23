import java.util.ArrayList;
import java.util.Scanner;

public class swapfirstlast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Before swapping: " + list);

        // Swap first and last element
        int temp = list.get(0);

        list.set(0, list.get(n - 1));
        list.set(n - 1, temp);

        System.out.println("After swapping: " + list);
    }
}
