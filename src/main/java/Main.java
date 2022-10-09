public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        // Демонстрация суммы
        System.out.println(intsCalc.sum(30, 6));
        // Демонстрация умножения
        System.out.println(intsCalc.mult(6, 6));
        // Демонстрация возведения в степень
        System.out.println(intsCalc.pow(2, 10));
    }
}