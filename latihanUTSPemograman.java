import java.util.Scanner;

public class latihanUTSPemograman {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Data = ");
        int jumlahData = input.nextInt();
        System.out.println("Inputkan Data Berikut:");

        int[] dataArray = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + i + " : ");
            dataArray[i] = input.nextInt();
        }

        System.out.println("Menampilkan Data");
        double jumlah = 0;

        for (int i = 0; i < dataArray.length; i++) {
            int data = dataArray[i];
            jumlah = jumlah + data;

            if (data % 2 == 0) {
                System.out.println(data + "-> Genap");
            } else {
                System.out.println(data + "-> Ganjil");
            }
        }

        System.out.println("TOTAL PENJUMLAHAN: " + jumlah);
        double ratarata = jumlah / jumlahData;
        System.out.println("RATA-RATA: " + ratarata);
    }
}
