package GFG;

public class RotateDelements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 2;
        RotateArr(arr,d);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    static void reverseArray(int[] arr,int st, int end){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    static void RotateArr(int[] arr,int d){
        int n = arr.length;
        d =d %n;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }
}
