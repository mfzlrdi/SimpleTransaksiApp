# 🛒 SimpleTransaksiApp Sistem Transaksi Barang

> Aplikasi desktop manajemen barang & transaksi penjualan berbasis Java GUI dibangun untuk menyelesaikan studi kasus pencatatan barang, transaksi, dan perhitungan total belanja secara otomatis.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)]()

---

## 📌 Tentang Project

**SimpleTransaksiApp** adalah aplikasi desktop berbasis Java Swing (NetBeans) yang dibangun untuk mengelola data barang dan mencatat transaksi penjualan secara real-time, terkoneksi langsung ke database **MySQL**. Project ini dibuat sebagai tugas akhir semester, dengan fokus pada penerapan konsep CRUD, koneksi database, dan validasi input pada aplikasi desktop.

## ✨ Fitur Utama

- **Kelola Data Barang** tambah, ubah, dan hapus data barang (ID, nama, harga, stok)
- **Transaksi Penjualan** input data pembeli, pilih barang, qty, hingga hitung total belanja
- **Hitung Otomatis** kalkulasi total belanja berdasarkan harga barang & jumlah (qty)
- **Validasi Stok** pengecekan otomatis agar qty pembelian tidak melebihi stok tersedia
- **Format Angka Rupiah** tampilan harga & total dengan pemisah ribuan format Indonesia (mis. `11.475.000`)
- **Koneksi Database MySQL** penyimpanan data terstruktur & real-time
- **Riwayat Transaksi** daftar transaksi tersimpan dapat dilihat langsung dalam tabel

## 🛠️ Tech Stack

| Teknologi | Fungsi |
|---|---|
| Java (Swing) | Bahasa & GUI framework utama |
| NetBeans IDE | Tools development |
| MySQL | Database |
| MySQL Connector/J | Driver koneksi Java ke MySQL |

## 📂 Struktur Project

```
TugasAkhirSem2/
├── assets/
│   └── mysql-connector-java-8.0.26.jar   # Driver koneksi database
├── build/                                # Hasil compile (auto-generated)
├── Database/
│   └── tugasakhirsem2.sql                # Script database
├── dist/                                 # Hasil build (auto-generated)
├── nbproject/                            # Konfigurasi NetBeans
├── src/
│   └── tugasakhirsem2/
│       ├── barang2.java / barang2.form    # Form kelola data barang
│       ├── transaksi.java / transaksi.form # Form transaksi penjualan
│       ├── menu.java / menu.form          # Menu utama aplikasi
│       ├── koneksi.java                  # Koneksi ke database
│       └── TugasAkhirSem2.java            # Main class
├── build.xml
├── manifest.mf
└── README.md
```

## 🚀 Cara Menjalankan

### 1. Persiapan Database
- Buka **phpMyAdmin** atau MySQL client favorit kamu
- Import file `Database/tugasakhirsem2.sql`
- Sesuaikan koneksi (host, username, password) di `koneksi.java`

### 2. Buka Project
```bash
# Clone repo
git clone https://github.com/username/TugasAkhirSem2.git
```
- Buka folder project menggunakan **NetBeans IDE**
- Pastikan library `mysql-connector-java-8.0.26.jar` di folder `assets/` sudah ter-include sebagai dependency project

### 3. Jalankan Aplikasi
- Klik **Run Project** (▶) di NetBeans, atau tekan `F6`
- Aplikasi akan terbuka melalui menu utama, lanjut ke form Barang atau Transaksi

## 🗃️ Database

Struktur database tersedia di `Database/tugasakhirsem2.sql`, terdiri dari tabel `barang` (data barang & stok) dan `transaksi` (riwayat transaksi penjualan). Tinggal import langsung ke MySQL.

## 🌱 Status Pengembangan

Project ini masih terus disempurnakan beberapa pengembangan ke depan yang direncanakan: laporan penjualan periodik, cetak struk transaksi, dan validasi input yang lebih ketat.

## 🤝 Kontribusi

Saran dan masukan terbuka lebar! Silakan buka **Issue** atau **Pull Request** kalau ada ide pengembangan. 😄

---

<p align="center">Made with ☕ TugasAkhirSem2</p>