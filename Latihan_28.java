package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Formating Kata
 *          Ganti Kata
 */
import java.util.Scanner;

public class Latihan_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti kata : ");
        String kataAsli = scanner.nextLine();

        System.out.print("Menjadi kata : ");
        String kataBaru = scanner.nextLine();

        // Mengganti semua kata asli dengan kata baru
        String kalimatBaru = kalimat.replaceAll(kataAsli, kataBaru);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
}
