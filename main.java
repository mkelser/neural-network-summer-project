public class main {
    public static void main(String[] args) {
        Perceptron p = new Perceptron(3);
        float[] point = {50, -12, 1};
        System.out.print(p.calculateSum(point));
    }
}
