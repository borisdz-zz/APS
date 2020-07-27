package Auditoriski.Aud4;

public class Zad1 {

    int binomial_coefficient(int n, int m){
        int i,j;
        int bc[][]=new int[n+1][n+1];

        for(i=0;i<=n;i++){
            bc[i][0]=1;
        }

        for(j=1;j<=n;j++){
            bc[j][j+1]=1;
        }

        for(i=1;i<=n;i++){
            for(j=0;j<=i;j++){
                bc[i][j]=bc[i-1][j-1]+bc[i-1][j];
            }
        }

        return bc[n][m];
    }



}
