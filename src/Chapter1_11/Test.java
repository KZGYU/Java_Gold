package Chapter1_11;

public class Test {
    int num = 10;

    class Foo {
        // インナークラス内のフィールドをstaticにすることはできません。この部分を修正する必要があります。
        // static int num = 50; 
        int num = 50;  

        void show() {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Test obj = new Test();
        Test.Foo foo = obj.new Foo();
        foo.show();
    }
}

