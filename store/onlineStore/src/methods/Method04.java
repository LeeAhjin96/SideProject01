package methods;

public class Method04 {
    public static int sum(int x, int y) {
        return (x * y);
    }

    public static int sum(int x, int y, int z) {
        return (x * y * z);
    }

    public static double sum(double x, int y) {
        return (x + y);
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 10));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(100.5, 10));
    }
}