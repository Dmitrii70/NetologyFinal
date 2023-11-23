package OOPBasics.Chapter5;

public class Memory <T> {
protected T value;
    public void save(T value) {
        this.value = value;
    }
    public T getLast() {
        return value;
    }
}
