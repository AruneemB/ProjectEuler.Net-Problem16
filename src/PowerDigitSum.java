import java.math.BigInteger;

public class PowerDigitSum
{
    public static int powerDigitSum(int base, int power)
    {
        BigInteger bigInteger = BigInteger.valueOf(base).pow(power);
        String stringInteger = bigInteger.toString();

        int sum = 0;
        for(char character : stringInteger.toCharArray()) sum += Character.getNumericValue(character);

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(powerDigitSum(2, 1000));
    }
}
