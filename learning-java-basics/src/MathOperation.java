public class MathOperation {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        int c = 100;

        c = c + 10;
        c += 10;
        c -= 10;
        c *= 10;
        c /= 10;
        c %= 10;

        // Unary Operator
        int d = 100;
        d++;
        d--;
        --d;
        ++d;
        int e = -100;
        int f = +(-10 * 10);
        boolean g = !true;

    }
}
