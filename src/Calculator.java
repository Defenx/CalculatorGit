public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    public double devide(int a, int b) {
        if (b == 0) {
            System.out.println("ФУ");
            throw new RuntimeException();
        }
        return a / b;
    }

    public int subtract (int a, int b) {
        return a - b;
    }
}
