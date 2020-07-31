package Auditoriski.Aud3;

/*
* TEKST:
* Студент се спрема да оди на патување. Дозволено му е да носи еден куфер со максимална тежина од 20 кг.
* Студентот се двоуми помеѓу облека, книги и друштвени игри. Откако ги измерил и оценил овие работи, студентот ја
* добил следната табела:
*
    Објект                          Вредност        Тежина
1   Облека                          200             10
2   Книги                           150             20
3   Монопол,карти…                  5               0.5
4   CD player, MP3 player…          80              5
*/

class Greedy {
    void sortiraj(int p[], int t[], int n) {
        int i, j, tmpP, tmpT;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if ((p[i] / (float) t[i]) < (p[j] / (float) t[j])) {
                    tmpP = p[i];
                    tmpT = t[i];
                    p[i] = p[j];
                    t[i] = t[j];
                    p[j] = tmpP;
                    t[j] = tmpT;
                }
            }
        }
    }

    //p i t gi sodrzzat profilot i tezinata na objektite
    //C e kapacitet na paketot, x e vektor na resenieto
    float grFractKnp(int p[], int t[], float C, int n, float x[]) {
        sortiraj(p, t, n);
        //objektite se pordedeni taka da bide zadovolen p[i]/t[i] += p[i+1]t[i+1]

        int i;
        float profit = 0;

        for (i = 0; i < n; i++) {
            x[i] = 0;
        }

        for (i = 0; i < n; i++) {
            if (C > t[i]) {     //objektot go stavame celosno
                x[i] = 1;
                C -= t[i];
                profit += p[i];
            } else {          //objektot go stavame delumno
                x[i] = (C / (float) t[i]);
                profit += x[i] * (float) t[i];
                C = 0;
                break;
            }
        }

        return profit;
    }
}

public class Zad5 {
}
