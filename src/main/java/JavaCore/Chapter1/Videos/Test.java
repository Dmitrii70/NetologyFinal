package JavaCore.Chapter1.Videos;

public class Test {
    private OnDoneListener <String> callback;
    public Test(OnDoneListener <String> callback) {
        this.callback = callback;
    }

    public void execute() {
        // Какая-либо длительная операция
        callback.onDone("Complete");
    }
}
