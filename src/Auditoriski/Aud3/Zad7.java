package Auditoriski.Aud3;

/*
 * TEKST:
 * Пронајдете ги двата најмали елементи во дадена низа со помош на техниката "раздели и владеј".
 * */

class DvaNajmali {
    int a, b;

    DvaNajmali() {
    }

    DvaNajmali(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class DivideAndConquer {
    int INF = 1000000;

    DvaNajmali pronajdi(int a[], int l, int r) {
        if (l == r) {
            DvaNajmali dn = new DvaNajmali(a[l], INF);
            return dn;
        }

        int mid = (l + r) / 2;

        DvaNajmali r1 = pronajdi(a, l, mid);
        DvaNajmali r2 = pronajdi(a, mid + 1, r);

        DvaNajmali r3 = new DvaNajmali();

        if (r1.a < r2.a) {
            r3.a = r1.a;
            if (r1.b < r2.a) {
                r3.b = r1.b;
            } else {
                r2.b = r2.a;
            }
        } else {
            r3.a = r2.a;
            if (r1.a < r2.b) {
                r3.b = r1.a;
            } else {
                r3.b = r2.b;
            }
        }
        return r3;
    }
}

public class Zad7 {
}
