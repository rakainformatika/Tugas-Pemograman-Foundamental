import java.util.Scanner;

public class total_Belanja {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Jumlah barang belanja");

        int[] belanjaHarga = {2500, 3000, 4000, 5000, 6000};
        int[] belanjaJumlah = new int[belanjaHarga.length];

        int data2;
        int harga = 0;
        int total = 0;
        int totalItem = 0;

        for (int i = 0; i < belanjaHarga.length; i++) {
            System.out.print("Jumlah Belanja item-" + i + " Rp " + (belanjaHarga[i]) + ": ");
            data2 = input.nextInt();
            belanjaJumlah[i] = data2;
        }

        System.out.println("Daftar Belanja dan Harga: ");
        for (int i = 0; i < belanjaHarga.length; i++) {
            harga = belanjaHarga[i] * belanjaJumlah[i];
            System.out.println("Harga Barang ke-" + i + ", " + belanjaJumlah[i] + " items: " + harga);
            total += harga;
        }

        for (int i = 0; i < belanjaHarga.length; i++) {
            totalItem += belanjaJumlah[i];
        }

        System.out.println("Total ITEM BELANJA: " + totalItem);
        System.out.println("TOTAL BELANJA: " + total);
    }
}
