import java.io.File;
import static java.lang.System.out;
import java.utill.Scanner;

public class DeleteFileExamplee {
	
    public static void main(String[] args) {
        // Nama berkas yang ingin dihapus
        String fileName = "yuyutub.txt";
		Scanner keyboard = new Scanner(System.in);
		char reply
		
        // Membuat objek File dengan nama berkas
        File file = new File(fileName);

        // Periksa apakah berkas ada sebelum dihapus
        if (reply == 'y') {
			out.println("Okay");
			fileName.delete();
			out.println("The evidence has been deleted");
            // Hapus berkas
           
            } else {
                System.out.println("Gagal menghapus berkas " + fileName);
			)
			
			keyboard.close();
			
	}
}