package Chapter9_PT_3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedIOExample {
    public static void main(String[] args) {
        // データの書き込み
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Java\\data.txt"))) {
            bw.write("おはよう");
            bw.newLine();
            bw.write("こんにちは");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // データの読み込み
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Java\\data.txt"))) {
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

