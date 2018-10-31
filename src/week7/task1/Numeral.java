package week7.task1;

public class Numeral extends Expression{
    int value;

    public Numeral(){

    }

    public Numeral(int _value){
        this.value = _value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getValue()+"";
    }

    @Override
    public int evaluate() {
        return getValue();
    }
}
