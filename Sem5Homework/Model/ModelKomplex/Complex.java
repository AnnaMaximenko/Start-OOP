package Sem5Homework.Model.ModelKomplex;

public class Complex {

    /**
     * real - реальная часть
     * image - мнимая часть
     */

    double real;
    double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public StringBuilder print() {
        StringBuilder res = new StringBuilder();
        if (image > 0) {
            res.append(real + " + " + image + "i");
        } else if (image < 0) {
            res.append(real + "" + image + "i");
        } else {
            res.append(real);
        }
        return res;

    }

}
