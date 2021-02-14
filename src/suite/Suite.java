package suite;

public class Suite<T,D> {
    public T entries;
    public D expected;
    public Suite (T entries, D expected){
        this.entries = entries;
        this.expected = expected;
    }
}

