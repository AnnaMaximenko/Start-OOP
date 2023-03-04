package Sem5Homework.Model.ModelKomplex;

public class DivModelComplex extends CalcModelComplex {

    public DivModelComplex() {

    }

    // do_it
    @Override
    public Complex result() {
        double real1 = x.getReal();
        double image1 = x.getImage();

        double real2 = y.getReal();
        double image2 = y.getImage();

        double newReal = (real1 * real2 + image1 * image2) / (real2 * real2 + image2 * image2);
        double newImage = (image1 * real2 + real1 * image2) / (real2 * real2 + image2 * image2);

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
