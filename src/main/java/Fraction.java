/**
 * Created by c0249298 on 05/03/2017.
 */
public class Fraction {

    private final int integerValue;

    public Fraction(int value) {
        integerValue = value;
    }

    public Fraction plus(Fraction fraction) {
        if (fraction.integerValue != 0){
            return new Fraction(this.integerValue + fraction.integerValue);
        }
        else return this;
    }

    public int intValue() {
        return integerValue;
    }
}
