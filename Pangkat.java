package com.jobsheet5;
public class Pangkat {
    public int pangkat, nilai;
    public int PangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }
    public int PangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        }else {
            if (n % 2 == 1) {
                return (PangkatDC(a,n / 2) * PangkatDC(a,n / 2) * a);
            }else {
                return (PangkatDC(a,n / 2) * PangkatDC(a,n / 2));
            }
        }
    }
}