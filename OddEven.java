import java.util.Scanner;

class Test {
    private int n;
    private int i;
    private int p = 1;

    public Test() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = scanner.nextInt();
        scanner.close();
    }

    public void check() {
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}

public class OddEven {
    public static void main(String[] args) {
        Test test = new Test();
        test.check();
    }
}
