package Sem6.Model.ModelKomplex;

public class ComplexPrint {

    Complex complex;

    public ComplexPrint(Complex complex) {
        this.complex = complex;
    }

    public StringBuilder print() {
        StringBuilder res = new StringBuilder();
        if (complex.getImage() > 0) {
            res.append(complex.getReal() + " + " + complex.getImage() + "i");
        } else if (complex.getImage() < 0) {
            res.append(complex.getReal() + "" + complex.getImage() + "i");
        } else {
            res.append(complex.getReal());
        }
        return res;

    }

}
