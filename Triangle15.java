import java.util.Scanner;
public class Triangle15 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n :");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print("*");
            j++;
            }
            System.out.println();
            i++;   
        }
        int k = n;
        while (k > 0){
            int m = 1;
            while (m <= k){
                System.out.print("*");
                m++;
            }
            System.out.println();
            k--;
        }
        
    sc.close();
    }
}