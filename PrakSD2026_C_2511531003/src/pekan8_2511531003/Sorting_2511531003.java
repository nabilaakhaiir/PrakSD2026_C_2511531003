package pekan8_2511531003;

import java.util.Scanner;

public class Sorting_2511531003 {
    Lagu_2511531003[] dataLagu_1003 = new Lagu_2511531003[20];
    int jumlah = 0;

    Scanner input = new Scanner(System.in);
    public void inputData_1003() {
        System.out.print("Masukkan jumlah lagu (minimal 7, maksimal 20): ");
        jumlah = input.nextInt();
        input.nextLine();

        if (jumlah < 7 || jumlah > 20) {
            System.out.println("Jumlah lagu harus antara 7 sampai 20!");
            return;
        }

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nData Lagu ke-" + (i + 1));

            System.out.print("Judul    : ");
            String judul = input.nextLine();

            System.out.print("Penyanyi : ");
            String penyanyi = input.nextLine();

            System.out.print("Durasi (detik) : ");
            int durasi = input.nextInt();
            input.nextLine();

            dataLagu_1003[i] =
                    new Lagu_2511531003(judul, penyanyi, durasi);
        }
    }

    public void tampilData_1003() {

        for (int i = 0; i < jumlah; i++) {

            System.out.println((i + 1) + ". "
                    + dataLagu_1003[i].judul_1003
                    + " - "
                    + dataLagu_1003[i].durasi_1003
                    + " detik");
        }
    }

    public void quickSort_1003(int low, int high) {

        if (low < high) {

            int pivotIndex = partition(low, high);

            quickSort_1003(low, pivotIndex - 1);
            quickSort_1003(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = dataLagu_1003[high].durasi_1003;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (dataLagu_1003[j].durasi_1003 < pivot) {
                i++;

                Lagu_2511531003 temp = dataLagu_1003[i];
                dataLagu_1003[i] = dataLagu_1003[j];
                dataLagu_1003[j] = temp;
            }
        }
        Lagu_2511531003 temp = dataLagu_1003[i + 1];
        dataLagu_1003[i + 1] = dataLagu_1003[high];
        dataLagu_1003[high] = temp;
        
        return i + 1;
    }

    public static void main(String[] args) {
        Sorting_2511531003 playlist =
                new Sorting_2511531003();

        playlist.inputData_1003();
        if (playlist.jumlah < 7 || playlist.jumlah > 20) {
            return;
        }
        
        System.out.println();
        System.out.println("=== Sorting Playlist NIM: 2511531003 ===");
        System.out.print("\nPilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilih = playlist.input.nextInt();

        System.out.println("\nData Sebelum Sorting:\n");
        playlist.tampilData_1003();
        switch (pilih) {
        
            case 1:
                System.out.println("\nShell Sort belum diimplementasikan.");
                break;
            
            case 2:
                playlist.quickSort_1003(0, playlist.jumlah - 1);
                System.out.println("\nData Setelah Quick Sort (Durasi Asc):\n");
                playlist.tampilData_1003();
                break;
                
             case 3:
                System.out.println("\nMerge Sort belum diimplementasikan.");
                break;

            default:
                System.out.println("\nPilihan tidak valid.");
        }
    }
}