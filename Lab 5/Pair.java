public class Pair<T1, T2> {
    
    private T1 key;
    private T2 value;

    private Pair(T1 key , T2 value) {
        this.key = key;
        this.value = value;
    }

    public static <T1 ,T2> Pair<T1, T2> of (T1 key, T2 value) {
        return new Pair<T1, T2>(key, value);
    }
}
