package test;
import java.util.*;

public class UniqueNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        System.out.print("Unique (non-duplicate) numbers: ");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) System.out.print(entry.getKey() + " ");
        }
        sc.close();
    }
}


