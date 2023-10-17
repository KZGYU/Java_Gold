package Chapter1_4;

public class Test {
    enum Vals {
        X {
            int method() {
                return 0;  // デフォルトの実装（または適切な値を返す実装）が必要です。
            }
        },
        Y {
            int method() {
                return 20;
            }
        },
        Z {
            int method() {
                return 0;  // デフォルトの実装（または適切な値を返す実装）が必要です。
            }
        };

        abstract int method(); 
    }

    public static void main(String[] args) {
        System.out.print(Vals.Y + " ");
        System.out.print(Vals.Y.method());
    }
}
