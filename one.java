import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ps[][] = range(arr, n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ps[i][j]+" ");
            }
            System.out.println();
        }
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2= sc.nextInt();
        int c2 = sc.nextInt();
        int ans = query(ps,r1,c1,r2,c2);
        System.out.print(ans);
    }
    public static int[][] range(int arr[][],int n){
        int num[][] = new int[n][n];
        num[0][0] = arr[0][0];
        for(int i = 1;i<n;i++){
            num[0][i]= num[0][i-1]+arr[0][i]; 
        }
        for(int j=1;j<n;j++){
            num[j][0]=num[j-1][0]+ arr[j][0];
        }
        for(int i= 1;i<n;i++){
            for(int j=1;j<n;j++){
                num[i][j]= num[i-1][j] + num[i][j-1] + arr[i][j] - num[i-1][j-1];
            }
        }
        return num;
    }
    public static int query(int num[][],int r1,int c1,int r2,int c2){
        int sum = num[r2][c2];
        if(r1 > 0){
            sum-= num[r1-1][c2];

        }
        if(c1 > 0){
            sum-= num[r2][c1-1];
        }
        if(r1 > 0 && c1 > 0){
            sum+= num[r1-1][c1-1];
        }
        return sum;
    }
}