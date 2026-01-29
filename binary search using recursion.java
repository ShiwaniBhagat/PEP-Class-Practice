
package Recursion;
import java.util.*;
public class binary_search {
    public static boolean rec(int arr[],int target,int low,int high){
        if(low>high) return false;
        int mid=low+(high-low)/2;
        if(arr[mid]==target) return true;
        else if(arr[mid]>target) return rec(arr,target,low,mid-1);
        else return rec(arr,target,mid+1,high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(rec(arr,target,0,arr.length-1));
        
    }
}
