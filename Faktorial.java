package com.jobsheet5;
public class Faktorial {
    public int nilai;
    public int faktorialBF(int n) {
        int faktor = 1;
        //int j = 1;
        //while (j <= n) {
        //    faktor *= j;
        //    j++;
        //}
        for (int i = 1; i <= n; i++) {
            faktor *= i;
        }
        return faktor;
    }
    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        }else {
            int faktor = n * faktorialDC(n - 1);
            return faktor;
        }
    }
}
