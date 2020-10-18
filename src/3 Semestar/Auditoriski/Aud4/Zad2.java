public class Zad2 {
    int a[][] = new int[100][100];
    int best[][] = new int[100][100];

    void maksimalen_zbir(int m, int n) {
        int i, j;
        // inicijalizacija na trivijalni reshenija
        best[0][0] = a[0][0];

        for (i = 1; i < m; i++) {
            best[i][0] = best[i - 1][0] + a[i][0]; //prva kolona
        }
        for (i = 1; i < n; i++) {
            best[0][i] = best[0][i - 1] + a[0][i]; //prva redica
        }

        for (i = 1; i < m; i++)
            for (j = 1; j < n; j++)
                best[i][j] = Math.max(best[i - 1][j], best[i][j - 1]) + a[i][j];
    }
}
