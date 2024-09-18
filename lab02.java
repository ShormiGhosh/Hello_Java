import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner((System.in));
        int sz = obj.nextInt(); // input array size
        int[] arr = new int[sz];
        for (int i = 0; i < sz; i++) {
            arr[i] = obj.nextInt(); // input array element
        }
        int num = obj.nextInt(), guni = 0;
        for (int i = 0; i < sz; i++) {
            if (arr[i] == num)
                guni++; // if user given number matches with array element then increase the count
        }
        System.out.println(guni); // printing the frequency of that number
        obj.close();
    }
}
