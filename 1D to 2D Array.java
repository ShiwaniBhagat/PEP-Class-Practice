package TwoDArray;
import java.util.*;
public class OneD_Array_to_2D_Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int c=sc.nextInt();
        int TwoD[][]=new int[r][c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                TwoD[i][j]=arr[k];
                System.out.print(TwoD[i][j]+" ");
                k++;
            }
            System.out.println();
        }
    }
}
