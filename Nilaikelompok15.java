import java.util.Scanner;
public class Nilaikelompok15{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kelompok :");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan Jumlah Penilai :");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0 ){
            System.out.print("Jumlah Kelompok dan Penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok){
                System.out.print("Kelompok " + nomorKelompok);
                double totalNilai = 0;
                for (int j = 1; j <= jumlahPenilai;j++){
                    int nilai;
                    do{
                        System.out.print("nilai dari penilai" + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.print(" Nilai harus 0 - 100. Ulangi Input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                    double rataNilai = totalNilai / jumlahPenilai;
                System.out.print("Kelompok " + nomorKelompok + ": nilai rata-rata = " +  rataNilai);
                if (rataTertinggi < rataNilai ){
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                } else {
                    System.out.println("==============================");
                    System.out.println("Kelompok terbaik : " + kelompokTerbaik);
                    System.out.println("Rata-rata tertinggi : " + rataTertinggi);
                }  
                }
                
                nomorKelompok++;
            }
        }
        sc.close();
    }
}