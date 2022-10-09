import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Codeup_45 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        br.close();

        bw.write((a+b) + "\n");
        bw.write((a-b)+"\n");
        bw.write((a*b)+"\n");
        bw.write((a/b)+"\n");
        bw.write((a%b)+"\n");
        bw.write(String.format("%.2f", (double)a/b));
        bw.flush();
        bw.close();
    }
}
