import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                System.out.print(Character.toLowerCase(arr[i]));
            } else {
                System.out.print(Character.toUpperCase(arr[i]));
            }
        }
        
    }
}