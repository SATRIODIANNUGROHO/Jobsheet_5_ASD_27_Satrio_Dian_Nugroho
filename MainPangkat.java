package com.jobsheet5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n========================( MENU )========================\n");
            System.out.println("1. Brute Force\n \n2. Divide and Conquer\n \n3. Keluar");
            System.out.println("\n========================================================");
            System.out.print("\nMasukkan Opsi Pilihan : ");
            int pilihan = sc.nextInt();
            if (pilihan == 1) {
                System.out.println("\n====================( BRUTE FORCE )=====================\n");
                System.out.print("Masukkan jumlah elemen yang ingin dihitung\t : ");
                int elemen = sc.nextInt();
                Pangkat[] png = new Pangkat[elemen];
                for (int i = 0; i < elemen; i++) {
                    png[i] = new Pangkat();
                    System.out.print("\nMasukkan nilai yang ingin dipangkatkan ke-" + (i + 1) + "\t : ");
                    png[i].nilai = sc.nextInt();
                    System.out.print("\nMasukkan nilai pemangkat ke-" + (i + 1) + "\t\t\t : ");
                    png[i].pangkat = sc.nextInt();
                }
                System.out.println("\n========================================================");
                System.out.println("\nHasil pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("\nNilai " + (png[i].nilai) + " pangkat " 
                    + (png[i].pangkat) + " adalah\t : " + (png[i].PangkatBF(png[i].nilai, png[i].pangkat)));
                }
                System.out.println("\n========================================================");
            }else if (pilihan == 2) {
                System.out.println("\n=================( DIVIDE AND CONQUER )=================\n");
                System.out.print("Masukkan jumlah elemen yang ingin dihitung\t : ");
                int elemen = sc.nextInt();
                Pangkat[] png = new Pangkat[elemen];
                for (int i = 0; i < elemen; i++) {
                    png[i] = new Pangkat();
                    System.out.print("\nMasukkan nilai yang ingin dipangkatkan ke-" + (i + 1) + "\t : ");
                    png[i].nilai = sc.nextInt();
                    System.out.print("\nMasukkan nilai pemangkat ke-" + (i + 1) + "\t\t\t : ");
                    png[i].pangkat = sc.nextInt();
                }
                System.out.println("\n========================================================");
                System.out.println("\nHasil pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("\nNilai " + (png[i].nilai) + " pangkat " 
                    + (png[i].pangkat) + " adalah\t : " + (png[i].PangkatDC(png[i].nilai, png[i].pangkat)));
                }
                System.out.println("\n========================================================");
            }else if (pilihan == 3) {
                System.exit(pilihan);
            }else {
                System.out.println("\nOpsi Pilihan Tidak Tersedia");
            }
        }
    }
}