# DoctorAppointmentUI 🩺

[![Kotlin Version](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg?logo=kotlin)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.5.0-green.svg?logo=android)](https://developer.android.com/jetpack/compose)
[![Platform](https://img.shields.io/badge/Platform-Android-lightgrey.svg?logo=android)](https://www.android.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

**DoctorAppointmentUI** is an Android application project for booking doctor appointments. This project focuses on implementing a modern user interface (UI/UX) using **Jetpack Compose** (Android's modern toolkit for building native UI) through a Figma design slicing process.

This project is highly suitable as a learning reference for implementing layouting, custom components, and navigation in Jetpack Compose.

---

## 📺 Video Tutorial & Slicing
This project was built based on a step-by-step tutorial. You can watch the full process of slicing the Figma design into Android Jetpack Compose via the following link:
🎥 **[Watch the Video Tutorial on YouTube](https://youtu.be/iDRnepwPowU)**

---

## ✨ Features & Main Screens
The application includes several essential screen components commonly found in healthcare apps:
* **Splash / Welcome Screen:** An aesthetic onboarding screen complete with illustrations and a call-to-action button.
* **Home Screen:** Displays doctor categories, a search bar, upcoming appointment schedules, and top doctor recommendations.
* **Doctor Detail Screen:** Comprehensive information about the doctor, including reviews, specialties, and a booking navigation button.
* **Custom Priority/Status Tag:** Implementation of small, responsive custom components (such as expertise or availability tags).

---

## 🛠️ Tech Stack & Libraries Used
* **[Kotlin](https://kotlinlang.org/)** - The primary programming language used.
* **[Jetpack Compose](https://developer.android.com/jetpack/compose)** - Google's modern toolkit for building native Android UI declaratively.
* **Material Design 3 (M3)** - Google's latest UI design guidelines for a dynamic and modern look.
* **Jetpack Navigation Compose** - Library for handling screen routing with type-safe arguments.
* **Accompanist / Coil** - (If applicable) For asynchronous image loading from URLs or assets.

---

## 🚀 Getting Started

To run this project on your local machine, follow the steps below:

### Prerequisites
* The latest version of **Android Studio** (Android Studio Flamingo or newer is recommended for full Compose support).
* **JDK 17** or higher.
* A physical Android device or Emulator running API Level 26 (Android 8.0) or higher.

### Installation Steps
1.  **Clone This Repository**
```bash
    git clone [https://github.com/HariAgus/DoctorAppointmentUI.git](https://github.com/HariAgus/DoctorAppointmentUI.git)
    ```
2.  **Open in Android Studio**
    * Open Android Studio and select **Open**.
    * Navigate to the cloned `DoctorAppointmentUI` project folder and click **OK**.
3.  **Sync Gradle**
    * Wait for Android Studio to complete the *Gradle Sync* process and download all necessary dependencies.
4.  **Run the Application**
    * Connect your Android device or start your emulator.
    * Click the **Run** button (green triangle icon 🎯) in the top toolbar of Android Studio.

---

## 📁 Main Directory Structure
```text
app/src/main/java/com/.../doctorappointmentui/
│
├── data/          # Dummy data model classes / mock data
├── ui/            # Visual components of the application
│   ├── theme/     # Color, Typography, and Theme settings (Theme.kt)
│   ├── components/# Reusable components (Custom Buttons, Cards, SearchBar, etc.)
│   └── screen/    # Main screens (HomeScreen, DetailScreen, SplashScreen)
└── MainActivity.kt# Main entry point of the app & Navigation setup
