package Sem6.Model.ModelRational;

public class SubModelRational extends CalcModelRational {

    public SubModelRational() {

    }

    // do_it
    @Override
    public double result() {
        return x - y;
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
