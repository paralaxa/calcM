package sk.stopangin.calc;

public class StatefulOneShotCalc {
    private double x, y;
    private static Double result;

    public StatefulOneShotCalc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        setResult(x + y);
    }

    public void substract() {
        setResult(x - y);
    }

    public void divide() {
        setResult(x / y);
    }

    public void multiplicate() {
        setResult(x * y);
    }

    private void setResult(Double result) {
        if (StatefulOneShotCalc.result == null) {
            StatefulOneShotCalc.result = result;
        }
    }

    public double getResult() {
        return result;
    }

    public void clearResult() {
        StatefulOneShotCalc.result = null;
    }
}
