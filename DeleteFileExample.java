import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        // Tentukan path ke berkas yang ingin dihapus
        String filePath = "cookedBooks"; // Gantilah dengan path berkas yang ingin Anda hapus
        
        // Buat objek File dengan path berkas
        File file = new File(filePath);
        
        // Periksa apakah berkas ada sebelum dihapus
        if (file.exists()) {
            // Hapus berkas
            if (file.delete()) {
                System.out.println("Berkas berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus berkas.");
            }
        } else {
            System.out.println("Berkas tidak ditemukan.");
        }
    }
}
