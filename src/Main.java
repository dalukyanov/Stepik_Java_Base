import java.math.BigInteger;

public class Main {

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger fact = BigInteger.valueOf(1);

        for (long i = 2; i <= value; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
    }
}

