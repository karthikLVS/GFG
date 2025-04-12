package GFG;
import java.util.*;
public class pushzerostolast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushzerostoend(arr);
        // Print the modified array
        System.out.println(Arrays.toString(arr));

    }
    static void pushzerostoend(int[] arr){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[cnt];
                arr[cnt] = temp;
                cnt++;
            }
        }
    }
}
