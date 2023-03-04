package Sem5Homework.Model.ModelKomplex;

public class SubModelComplex extends CalcModelComplex {

    public SubModelComplex() {

    }

    // do_it
    @Override
    public Complex result() {
        double real1 = x.getReal();
        double image1 = x.getImage();

        double real2 = y.getReal();
        double image2 = y.getImage();

        double newReal = real1 - real2;
        double newImage = image1 - image2;

        Complex result = new Complex(newReal, newImage);

        return result;
    }

    @Override
    public void setX(Complex x) {
        super.x = x;

    }

    @Override
    public void setY(Complex y) {
        super.y = y;

    }

}
