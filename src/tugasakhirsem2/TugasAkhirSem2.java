/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirsem2;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TugasAkhirSem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, id, namaBarang;
        int jumlahBarang, qty, i;
        double hargaBarang, totalHarga, totalBelanja, diskon, totalYangHarusDibayar;
        
        System.out.println("   Selamat datang di Minimarket UNINDRA   ");
        System.out.println("-------------------------------------------");
        input.nextLine();
        System.out.println("Isi Data");
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan ID  : ");
        id = input.nextLine();
        System.out.println("-------------------------------------------");

        // Input jumlah barang yang akan dibeli
        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
        jumlahBarang = input.nextInt();

        // Inisialisasi variabel total belanja
        totalBelanja = 0;

        // Loop untuk menginput data setiap barang dan menghitung total belanja
        for (i = 1; i <= jumlahBarang; i++) {
            System.out.println("Input data untuk Barang ke-" + i);

            // Input nama barang
            System.out.print("Nama barang        : ");
            namaBarang = input.next();

            // Input harga barang
            System.out.print("Harga barang (Rp)  : ");
            hargaBarang = input.nextDouble();

            // Input jumlah barang (qty)
            System.out.print("Jumlah barang (qty): ");
            qty = input.nextInt();

            // Menghitung total harga untuk barang tersebut
            totalHarga = hargaBarang * qty;

            // Menambahkan total harga barang ke total belanja
            totalBelanja += totalHarga;

            // Menampilkan data barang yang dibeli
            System.out.println("Barang : " + namaBarang);
            System.out.println("Qty    : " + qty);
            System.out.println("Total  : Rp " + totalHarga);
        }

        // Inisialisasi variabel diskon
        diskon = 0;

        // Cek apakah total belanja lebih dari atau sama dengan 100000
        if (totalBelanja >= 100000) {
            // Menghitung diskon 10%
            diskon = 0.1 * totalBelanja;
            System.out.println("Anda mendapatkan diskon 10%!");
        }

        // Menghitung total yang harus dibayar setelah diskon
        totalYangHarusDibayar = totalBelanja - diskon;

        // Menampilkan total belanja, diskon, dan total yang harus dibayar
        System.out.println("--------------------------------------------");
        System.out.println("Data Pembeli");
        System.out.println("Nama : " +nama);
        System.out.println("ID   : " +id);
        System.out.println("--------------------------------------------");
        System.out.println("===============Nota Pembelian===============");
        System.out.println("Total Belanja            : Rp " + totalBelanja);
        System.out.println("Diskon                   : Rp " + diskon);
        System.out.println("Total yang harus dibayar : Rp " + totalYangHarusDibayar);

        // Menutup scanner
        input.close();
    }
    
}
