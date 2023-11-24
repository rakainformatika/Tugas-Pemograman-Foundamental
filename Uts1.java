import java.util.Scanner;

public class Uts1 {
    public static void main(String[] args) {
        String[] data = new String[6];
        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke-" + i + ":");
            data[i] = scan.nextLine();
        }

        for (int i = 0; i < data.length; i++) {
            int value = Integer.parseInt(data[i]);
            System.out.println(value + " = " + (value % 2 == 0 ? "genap" : "ganjil"));
            total += value;
        }

        System.out.println("Total penjumlahan = " + total);

        System.out.println("---------------------------");


        for (String b : data) {
            System.out.println(b + " hasil data");
        }
    }
}
