import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bus {
    public static void main(String[] args) throws IOException {
        int i, j, k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        br.close();

        int cena = 100;
        int max = N * cena;
        if (M > 0)
            max += (M - 1) * cena;
        int min = N * cena;
        if (M >= N)
            min += (M - N) * cena;

        System.out.println(min);
        System.out.println(max);
    }
}
