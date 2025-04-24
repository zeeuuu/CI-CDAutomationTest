# Automation CI/CD untuk API dan Web UI

## Tujuan Pengujian

Repositori ini menggunakan **GitHub Actions** untuk mengotomatisasi proses integrasi dan pengujian pada proyek API dan Web UI. Setiap perubahan yang dikirimkan ke branch `main` akan secara otomatis menjalankan pipeline untuk memastikan semua fitur tetap berjalan dengan baik.

## Cara Kerja Workflow (Github Actions)

1. Workflow akan berjalan otomatis setiap kali ada commit atau pull request yang masuk ke branch `main`.
2. Tahapan yang dilakukan secara otomatis oleh workflow:
   - Mengambil kode terbaru dari repositori. 
   - Menginstal seluruh dependensi yang dibutuhkan. 
   - Menjalankan proses build menggunakan Gradle.
   - Menjalankan proses pengujian.
   - Mengunggah hasil pengujian sebagai artefak ke halaman Github Actions.

Berikut workflow ketika sukses dijalankan:

![Workflow Success] (Build Success.PNG)

## Menjalankan Pengujian Secara Manual

1. Pastikan Java dan Gradle sudah terinstal.
2. Clone repositori:
   ```bash
   git clone https://github.com/zeeuuu/CI-CDAutomationTest.git
   cd CI-CDAutomationTest
   ```
3. Instalasi Depedensi:
   ```bash
   ./gradleW build
   ```
4. Jalankan Pengujian:
    ```bash
   ./gradlew clean test
   ```

## Hasil Pengujian

- Saat menggunakan GitHub Actions, hasil pengujian sebagai artefak setelah pipeline selesai dijalankan dapat diunduh dari halaman GitHub Actions.
- Jika pengujian dijalankan secara manual, laporan pengujian dapat ditemukan di direktori `reports/cucumber.html`