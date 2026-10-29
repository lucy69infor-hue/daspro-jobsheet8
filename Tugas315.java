import java.util.Scanner;
public class Tugas315{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int toko, pelanggan, barang, total = 0,totalseluruh = 0,tokoterbanyak = 0;

        System.out.print("Masukkan jumlah toko : ");
        toko = sc.nextInt();
        if (toko <= 0) {
            System.out.println("Jumlah toko tidak boleh kosong ataupun negatif. Ualngi Input!");
        } else {
            for (int i = 1; i <= toko; i++) {
            System.out.println("Masukkan Jumlah pelanggan untuk toko ke " + i +  ": ");
            pelanggan = sc.nextInt();
                for (int j = 1; j <= pelanggan; j++){
                    System.out.println("Toko " + i + " - Pelanggan : " + j + ", Barang belanjaan :");
                    barang = sc.nextInt();
                    total += barang;
                    System.out.println("total barang : " + total);
                    totalseluruh += barang;
                     
                    if (tokoterbanyak < total ){
                    tokoterbanyak = i;
                
                }   
                    
                }
            
                total = 0;
            }
            System.out.println("Total keseluruhan barang dari tiap toko:" + totalseluruh);
            System.out.println("Toko dengan barang Terbanyak : " + tokoterbanyak );
        }
        sc.close();
    }
    
}