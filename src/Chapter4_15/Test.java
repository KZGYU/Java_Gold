package Chapter4_15;

import java.util.Comparator;
import java.util.TreeSet;

public class Test implements Comparable<Test>, Comparator<Test> {
    private String msg;
    private int number;

    public Test(String msg, int number) {
        this.msg = msg;
        this.number = number;
    }

    public int compareTo(Test t) {
        return this.msg.compareTo(t.msg);
    }

    public int compare(Test t1, Test t2) {
        return t1.number - t2.number;
    }

    
    public String toString() {
        return this.msg;
    }

    public static void main(String[] args) {
        var t1 = new Test("apple", 30);
        var t2 = new Test("banana", 10);
        
        var set1 = new TreeSet<Test>();
        set1.add(t1);
        set1.add(t2);
        System.out.println(set1);

        var set2 = new TreeSet<Test>(t1);
        set2.add(t1);
        set2.add(t2);
        System.out.println(set2);
    }
}
