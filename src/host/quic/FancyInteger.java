package host.quic;

public class FancyInteger extends Number<Integer> {

    private Integer _theNumber;

    public FancyInteger(Integer theNumber) {
        _theNumber = theNumber;
    }

    @Override
    public FancyInteger increment() {
        return new FancyInteger(_theNumber + 1);
    }

    @Override
    public FancyInteger decrement() {
        return new FancyInteger(_theNumber - 1);
    }

    @Override
    public String getTypeName() {
        return "Integer";
    }

    @Override
    public Integer getValue() {
        return _theNumber;
    }

    public String toString() {
        return String.valueOf(_theNumber);
    }
}
