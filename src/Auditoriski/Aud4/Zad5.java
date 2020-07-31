package Auditoriski.Aud4;

public class Zad5 {
    static int max(int x, int y) {
        if (x > y)
            return x;
        return y;
    }

    int DPKnapsack(int t[], int p[], int C) {
        int i, j;
        int n = t.length;
        int D[][] = new int[n + 1][C + 1];

        for (j = 0; j <= C; j++) {
            D[0][j] = 0;
        }
        for (i = 1; i <= n; i++) {
            D[i][0] = 0;
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= C; j++)
                if (t[i - 1] <= j)
                    D[i][j] = max(p[i - 1] + D[i - 1][j - t[i - 1]], D[i - 1][j]);
                else
                    D[i][j] = D[i - 1][j];
        }
        return D[n][C];
    }
}
