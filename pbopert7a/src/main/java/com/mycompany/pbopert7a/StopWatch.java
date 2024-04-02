/*
nama   : Azkal Azkiya
nim    : 2201752 


*/
package com.mycompany.pbopert7a;
import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    // Konstruktor tanpa argumen
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Metode start untuk mereset startTime ke waktu saat ini
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Metode stop untuk menyetel endTime ke waktu saat ini
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Metode untuk mengembalikan waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return endTime - startTime;
    }

    // Metode untuk mengukur waktu eksekusi pengurutan 100.000 angka menggunakan selection sort
    public static void measureSelectionSort() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000); // Isi array dengan angka acak
        }

        StopWatch stopwatch = new StopWatch();
        selectionSort(arr);
        stopwatch.stop();
        System.out.println("Waktu eksekusi pengurutan 10.000 angka: " + stopwatch.getElapsedTime() + " milidetik");
    }

    // Metode selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Program utama
    public static void main(String[] args) {
        measureSelectionSort();
    }
}
