package sample;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");

        try {
            // ここに例外が発生する可能性のあるコードを書きます
            System.out.println("割り算開始");
            int a = divide(10, 0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            // ArithmeticExceptionが発生した場合の処理を書きます
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } finally {
            // 例外の有無に関わらず、実行されるコードを書きます（オプション）
            System.out.println("割り算終了");
        }

        System.out.println("処理終了");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // 0での除算を試みた場合、ArithmeticExceptionを投げます
            throw new ArithmeticException("ゼロ除算エラーです");
        }
        return a / b;
    }
}
