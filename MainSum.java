package com.jobsheet5;
import java.util.*;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sum> companies = new ArrayList<>();

        // Input untuk setiap perusahaan
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();
        for (int i = 0; i < numCompanies; i++) {
            System.out.print("\nPerusahaan ke-" + (i + 1) + ": ");
            System.out.print("Masukkan jumlah bulan: ");
            int numMonths = sc.nextInt();
            Sum company = new Sum(numMonths);

            // Input keuntungan bulanan untuk perusahaan saat ini
            for (int j = 0; j < numMonths; j++) {
                System.out.print("Masukkan keuntungan Bulan ke-" + (j + 1) + " (dalam juta): ");
                company.keuntungan[j] = sc.nextDouble();
            }

            // Tambahkan objek Sum perusahaan ke dalam ArrayList
            companies.add(company);
        }

        // Output total keuntungan untuk setiap perusahaan
        System.out.println("\n============================================================");
        for (int i = 0; i < numCompanies; i++) {
            Sum company = companies.get(i);
            double totalBF = company.totalBF(company.keuntungan);
            double totalDC = company.totalDC(company.keuntungan, 0, company.elemen - 1);
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Total Keuntungan (Brute Force): " + String.format("%.2f", totalBF) + " juta");
            System.out.println("Total Keuntungan (Divide and Conquer): " + String.format("%.2f", totalDC) + " juta");
            System.out.println("============================================================");
        }
    }
}