package GFG;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int arr[]){
        int n=arr.length;
        int largest =-1,secondL=-1;
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                secondL=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondL){
                secondL=arr[i];
            }

        }
        return secondL;
    }
}
