import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf(256)));
    }

    private static BigInteger factorial(BigInteger value) {
        if (value.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return value.multiply(factorial(value.subtract(BigInteger.ONE)));
        }
    }
}