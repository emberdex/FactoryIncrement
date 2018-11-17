package host.quic;

public class Main {

    public static void main(String[] args) {
        Number myNumber = NumberFactory.getNumber(42);

        for(Number n = NumberFactory.getNumber(0); (Integer) n.getValue() < 10; n = n.increment()) {
            myNumber = myNumber.increment();
        }

        System.out.println(myNumber);
    }
}
