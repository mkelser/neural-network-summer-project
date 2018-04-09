public class Trainer {
    float[] inputs;
    int answer;
    float yline;

    public Trainer(float x, float y, int a) {
        inputs = new {x, y, 1};
        answer = a;
        yline = f(x);
    }

    float f(float x) {
        return 2*x+1;
    }
}
