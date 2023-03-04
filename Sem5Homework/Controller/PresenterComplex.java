package Sem5Homework.Controller;

import Sem5Homework.Model.ModelKomplex.Complex;
import Sem5Homework.Model.ModelKomplex.ModelComplex;
import Sem5Homework.View.ViewComplex;

public class PresenterComplex {
    ViewComplex view;
    ModelComplex model;

    public PresenterComplex(ModelComplex m, ViewComplex v) {
        model = m;
        view = v;
    }

    public PresenterComplex() {

    }

    public void buttonClick() {
        String real1 = view.getValue("Введите реальную часть первого числа: ");
        String image1 = view.getValue("Введите мнимую часть первого числа: ");

        String real2 = view.getValue("Введите реальную часть второго числа: ");
        String image2 = view.getValue("Введите мнимую часть второго числа: ");

        double dat1_1 = Double.parseDouble(real1); // преобразовать вещественную часть строки в double
        double dat1_2 = Double.parseDouble(image1.substring(0, image1.length() - 1)); // преобразовать мнимую часть
                                                                                      // строкового типа с удаленным «i»
                                                                                      // в двойной тип
        double dat2_1 = Double.parseDouble(real2); // преобразовать вещественную часть строки в double
        double dat2_2 = Double.parseDouble(image2.substring(0, image2.length() - 1)); // Преобразовать мнимую часть
                                                                                      // строки с удаленным «i» в double

        Complex number1 = new Complex(dat1_1, dat1_2);
        Complex number2 = new Complex(dat2_1, dat2_2);

        model.setX(number1);
        model.setY(number2);

        Complex result = model.result();

        StringBuilder res = result.print();

        view.print(res, "Result: ");
    }

}
