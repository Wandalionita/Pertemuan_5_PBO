package tugas_pertemuan_5;

import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Masukkan total pembelian Rp.: ");
        double totalPembelian = scanner.nextDouble();

        // Variabel untuk menyimpan potongan dan jumlah yang harus dibayarkan
        double potongan;
        double jumlahYangHarusDibayarkan;

        // Menghitung potongan berdasarkan total pembelian
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05; // 5% potongan
        } else {
            potongan = totalPembelian * 0.20; // 20% potongan
        }

        // Menghitung jumlah yang harus dibayarkan
        jumlahYangHarusDibayarkan = totalPembelian - potongan;

        // Menampilkan hasil
        System.out.println("Total pembelian Rp. = " + totalPembelian);
        System.out.println("Besarnya potongan Rp. = " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + jumlahYangHarusDibayarkan);

        // Menutup scanner
        scanner.close();
    }
}

