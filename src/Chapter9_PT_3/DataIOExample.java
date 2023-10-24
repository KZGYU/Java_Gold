package Chapter9_PT_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOExample {
    public static void main(String[] args) {
        // 
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Java\\data.txt"))) {
            dos.writeInt(100);
            dos.writeUTF("tanaka");
            dos.writeUTF("田中");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // データの読み込み
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Java\\data.txt"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
