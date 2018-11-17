package host.quic;

public class NumberFactory {

    public static Number getNumber(Object value) {

        if(value instanceof Integer) {
            return new FancyInteger((Integer) value);
        }

        return null;
    }
}
