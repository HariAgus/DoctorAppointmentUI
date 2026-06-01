# DoctorAppointmentUI 🩺

[![Kotlin Version](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg?logo=kotlin)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.5.0-green.svg?logo=android)](https://developer.android.com/jetpack/compose)
[![Platform](https://img.shields.io/badge/Platform-Android-lightgrey.svg?logo=android)](https://www.android.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

**DoctorAppointmentUI** adalah proyek aplikasi Android untuk pemesanan/janji temu dokter (*Doctor's Appointment*). Proyek ini berfokus pada implementasi antarmuka pengguna (UI/UX) modern menggunakan **Jetpack Compose** (Android modern toolkit untuk membuat native UI) melalui proses *slicing* dari desain Figma.

Proyek ini sangat cocok dijadikan sebagai referensi belajar untuk mengimplementasikan tata letak (*layouting*), komponen kustom, serta navigasi di Jetpack Compose.

---

## 📺 Video Tutorial & Slicing
Proyek ini dibuat berdasarkan tutorial langkah demi langkah. Anda dapat melihat proses *slicing* Figma ke Android Jetpack Compose melalui tautan berikut:
🎥 **[Tonton Video Tutorial di YouTube](https://youtu.be/iDRnepwPowU)**

---

## ✨ Fitur & Layar Utama
Aplikasi ini mencakup beberapa komponen layar penting yang umumnya ada di aplikasi kesehatan:
* **Splash / Welcome Screen:** Layar pembuka yang estetik dengan ilustrasi dan tombol ajakan bertindak (*call-to-action*).
* **Home Screen:** Menampilkan daftar kategori dokter, kolom pencarian, jadwal janji temu terdekat, serta rekomendasi dokter terbaik.
* **Doctor Detail Screen:** Informasi lengkap mengenai dokter, ulasan, spesialisasi, beserta tombol navigasi pemesanan.
* **Custom Priority/Status Tag:** Implementasi komponen kecil kustom yang responsif (seperti tag keahlian atau ketersediaan).

---

## 🛠️ Teknologi & Library yang Digunakan
* **[Kotlin](https://kotlinlang.org/)** - Bahasa pemrograman utama yang digunakan.
* **[Jetpack Compose](https://developer.android.com/jetpack/compose)** - Toolkit modern buatan Google untuk membangun UI Android secara deklaratif.
* **Material Design 3 (M3)** - Komponen panduan desain UI terbaru dari Google untuk tampilan yang dinamis dan modern.
* **Jetpack Navigation Compose** - Library untuk menangani perpindahan antar-layar (*screen routing*) dengan tipe data yang aman.
* **Accompanist / Coil** - (Jika ada) Untuk pemuatan gambar secara asinkron dari URL atau aset.

---

## 🚀 Cara Menjalankan Proyek (Getting Started)

Untuk menjalankan proyek ini di komputer lokal Anda, ikuti langkah-langkah di bawah ini:

### Prasyarat
* **Android Studio** versi terbaru (disarankan Android Studio Flamingo atau yang lebih baru untuk dukungan penuh Compose).
* **JDK 17** atau yang lebih tinggi.
* Perangkat Android fisik atau Emulator dengan API Level 26 (Android 8.0) atau di atasnya.

### Langkah Instalasi
1.  **Clone Repositori Ini**
    ```bash
    git clone [https://github.com/HariAgus/DoctorAppointmentUI.git](https://github.com/HariAgus/DoctorAppointmentUI.git)
    ```
2.  **Buka di Android Studio**
    * Buka Android Studio, pilih **Open**.
    * Arahkan ke folder hasil klon proyek `DoctorAppointmentUI` dan klik **OK**.
3.  **Sinkronisasi Gradle**
    * Tunggu hingga Android Studio menyelesaikan proses *Gradle Sync* dan mengunduh semua dependensi yang diperlukan.
4.  **Jalankan Aplikasi**
    * Hubungkan perangkat Android Anda atau aktifkan emulator.
    * Klik tombol **Run** (ikon segitiga hijau 🎯) di bilah alat atas Android Studio.

---

## 📁 Struktur Direktori Utama
```text
app/src/main/java/com/.../doctorappointmentui/
│
├── data/          # Kelas model data dummy / mock data
├── ui/            # Komponen visual aplikasi
│   ├── theme/     # Pengaturan Warna (Color), Tipografi (Type), dan Tema (Theme.kt)
│   ├── components/# Komponen reusable (Button kustom, Card, SearchBar, dll)
│   └── screen/    # Layar utama (HomeScreen, DetailScreen, SplashScreen)
└── MainActivity.kt# Titik masuk utama aplikasi & Setup Navigasi
