# Sistem Pemesanan Trip Wisata

Aplikasi berbasis konsol Java sederhana untuk memesan paket perjalanan wisata. Pengguna dapat memilih destinasi, jumlah orang, serta metode pembayaran yang diinginkan.

## Fitur

- Menampilkan daftar trip wisata yang tersedia
- Memilih trip dan jumlah orang yang ikut
- Memilih metode pembayaran (Transfer Bank, Kartu Kredit, E-Wallet)
- Simulasi proses pembayaran
- Desain modular dengan menggunakan interface

## Struktur Program

Aplikasi ini terdiri dari beberapa antarmuka (interface) dan kelas:

- `ITravelService`: Mengatur proses pemesanan trip
- `IPaymentService`: Mengatur proses pembayaran
- `ITripManager`: Mengatur daftar trip yang tersedia
- `ICustomerInteraction`: Mengatur interaksi dengan pelanggan
- `INotificationService`: (Placeholder, belum diimplementasikan)
- `Trip`: Menyimpan informasi tentang paket perjalanan
- `TravelService`: Implementasi dari `ITravelService`, membutuhkan layanan pembayaran
- `PaymentService`: Implementasi dari `IPaymentService`
- `TripManager`: Implementasi dari `ITripManager`
- `CustomerInteraction`: Mengatur alur pemesanan dan input dari pengguna
- `TravelBookingSystem`: Kelas utama untuk menjalankan aplikasi

=== Selamat Datang di Sistem Pemesanan Trip ===

Daftar Trip yang Tersedia:
1. Japan - 7 Hari - $1500.0
2. France - 10 Hari - $2500.0
3. Bali - 5 Hari - $800.0

Pilih trip (1-3): 1
Masukkan jumlah orang: 2

Metode Pembayaran:
1. Transfer Bank
2. Kartu Kredit
3. E-Wallet
Pilih metode pembayaran (1-3): 2

Memesan trip ke Japan untuk 2 orang, selama 7 hari dengan total $3000.0
Memproses pembayaran sebesar $3000.0 menggunakan Kartu Kredit...
Trip berhasil dipesan!


