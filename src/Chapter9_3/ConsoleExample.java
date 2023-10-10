package Chapter9_3;

/*
 * このコードは、Consoleを使用してユーザーからの入力を読み取り、その入力を同じコンソールに返す動作をします。
 */



import java.io.Console;
import java.io.PrintWriter;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        PrintWriter pw = console.writer();
        String str = console.readLine();

        if (str != null) {
            pw.append(str);
        }

        pw.flush();
    }
}
