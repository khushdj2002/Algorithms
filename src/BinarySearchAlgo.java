import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);       // This should be removed as we go to binary only if it is sorted.
        int target = sc.nextInt();
        int res= searchBinaryAl(arr,target,0,arr.length);
        if(res==-1){
            System.out.println("The num,ber you are searching is not present");
        }
        else {
            System.out.println("The element you are searching is present in "+(res+1));
        }
    }
    static int  searchBinaryAl(int[] arr,int target,int a,int b){
        if (a<=b) {
            int mid = (a + b) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                return searchBinaryAl(arr, target, mid + 1, b);
            }
            return searchBinaryAl(arr,target,a,mid-1);
        }
        else {
            return -1;
        }
    }
}
