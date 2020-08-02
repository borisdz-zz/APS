package Vezbi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Range {

    static long digitSum(long x) {
        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    static long proveri(long N, long A, long B) {
        if (B - A < 10) {
            for (long i = A; i <= B&&i * i < N; i++) {
                if (i * i + digitSum(i) + 200 * i == N) {
                    return i;
                }
            }
            return -1;
        }
        long od = (B - A) / 2 + A;
        if (od * od + digitSum(od) + 200 * od > N) {
            return proveri(N, A, od);
        } else {
            return proveri(N, od, B);
        }


        // if(x < B) return x;

    }


    public static void main(String[] args) throws Exception {
        long i, j, k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long res = proveri(N, A, B);
        System.out.println(res);

        br.close();

    }

}
