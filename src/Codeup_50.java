import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Codeup_50 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        br.close();

        if (a==b) {
            bw.write("1");
        }
        else {
            bw.write("0");
        }
        bw.flush();
        bw.close(); //f
    }
}
