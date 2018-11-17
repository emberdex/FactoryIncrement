package host.quic;

public abstract class Number<T> {

    private T _theNumber;

    public abstract Number increment();

    public abstract Number decrement();

    public abstract String getTypeName();

    public abstract T getValue();
}
