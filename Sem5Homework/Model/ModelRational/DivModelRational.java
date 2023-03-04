package Sem5Homework.Model.ModelRational;

public class DivModelRational extends CalcModelRational {

    public DivModelRational() {

    }

    // do_it
    @Override
    public double result() {
        return x / y;
    }

    @Override
    public void setX(double value) {
        super.x = value;

    }

    @Override
    public void setY(double value) {
        super.y = value;

    }

}
