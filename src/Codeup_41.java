import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = br.readLine().charAt(0);
        System.out.println((char) (a+1));
    }
}
