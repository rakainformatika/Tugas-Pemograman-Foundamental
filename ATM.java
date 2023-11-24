import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ATM {
    public static void main(String[] args) {
        
        int pinAtm = 1234;
      
        int jumlahKesempatan = 3;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("Selamat datang di ATM");
        System.out.println("======================");
        
    
        while (jumlahKesempatan > 0) {
            System.out.print("Masukkan PIN Anda: ");
            int pinPengguna = scanner.nextInt();
            
            if (pinPengguna == pinAtm) {
                System.out.println("PIN yang Anda masukkan benar. Akses diberikan.");
                break;
            } else {
                jumlahKesempatan--;
                System.out.println("PIN yang Anda masuRkkan salah. Sisa kesempatan: " + jumlahKesempatan);
                
                if (jumlahKesempatan == 0) {
                    System.out.println("Anda telah mencoba 3 kali. Akses ditolak.");
                }
            }
        }
		
        scanner.close();
    }
}
