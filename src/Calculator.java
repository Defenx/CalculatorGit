public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double divide (int a, int b) {
        try {
            return a / b;
        } catch (Exceprion e) {
            System.out.println(e);
        }
    }
}
