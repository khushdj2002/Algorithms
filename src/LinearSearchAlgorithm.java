import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res=search(arr,target);
        if (res!=-1){
            System.out.println("We found the nuimber it is present in "+res);
        }
        else {
            System.out.println("The number you are searching for is not present in the array");
        }
    }
    static int search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
}
