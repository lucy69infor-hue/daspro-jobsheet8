import java.util.Scanner;
public class Tugas215 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai N : ");
        int n = sc.nextInt();
       

        for (int i = 1; i <= n; i++){     
            for (int j = 1; j <= n; j++){
                int hasil = j * i;
                System.out.printf("%4d", hasil);
            }
        System.out.println();
        }
        sc.close();
    }

}