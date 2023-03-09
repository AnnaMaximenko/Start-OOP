package Sem6.Controller;

import Sem6.Model.ModelRational.ModelRatonal;
import Sem6.View.ViewRational;

public class PresenterRation {
    ViewRational view;
    ModelRatonal model;

    public PresenterRation(ModelRatonal m, ViewRational v) {
        model = m;
        view = v;
    }

    public PresenterRation() {

    }

    public void buttonClick() {
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);

        double result = model.result();
        view.print(result, "Result: ");
    }

}
