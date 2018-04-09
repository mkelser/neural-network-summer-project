import java.util.Random;

public class Perceptron {
    private float[] weights;

    public Perceptron(int a) {
        Random gen = new Random();
        weights = new float[a];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = gen.nextInt(3) - 1; //random weight from (-1,1) for each input
        }
    }

    public float calculateSum(float[] inputs) {
        float sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        return activate(sum);
    }

    public int activate(float sum) {
        if (sum < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public void train(float[] inputs, int desired) {
        float c = (float) 0.01;
        int guess = (int) calculateSum(inputs);

        float error = desired - guess;

        for (int i = 0; i < weights.length; i++) {
            weights[i] += c * error * inputs[i];
        }


    }
}

