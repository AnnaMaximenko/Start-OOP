package Sem5Homework;

import java.util.Scanner;
import java.util.logging.*;

import Sem5Homework.Controller.PresenterComplex;
import Sem5Homework.Controller.PresenterRation;
import Sem5Homework.Model.ModelKomplex.DivModelComplex;
import Sem5Homework.Model.ModelKomplex.MultModelComplex;
import Sem5Homework.Model.ModelKomplex.SubModelComplex;
import Sem5Homework.Model.ModelKomplex.SumModelComplex;
import Sem5Homework.Model.ModelRational.DivModelRational;
import Sem5Homework.Model.ModelRational.MultModelRational;
import Sem5Homework.Model.ModelRational.SubModelRational;
import Sem5Homework.Model.ModelRational.SumModelRational;
import Sem5Homework.View.Menu;
import Sem5Homework.View.ViewComplex;
import Sem5Homework.View.ViewRational;

public class Presenter {

    PresenterRation presenterRation;
    Menu menu;
    Scanner scanner;

    public Presenter(PresenterRation presenterRation,
            Menu menu,
            Scanner scanner) {
        this.presenterRation = presenterRation;
        this.menu = menu;
        this.scanner = scanner;
    }

    public void start() {
        switch (menu.selectCalc()) {
            case 1:
                startRation();
                break;
            case 2:
                startComplex();
                break;
            default:
                System.out.println("Неверный ввод");
                break;

        }
    }

    public void startRation() {
        Logger logger = Logger.getGlobal();
        switch (menu.selectFunction()) {
            case 1:
                System.out.println("Какие числа будем суммировать?");
                PresenterRation p1 = new PresenterRation(new SumModelRational(), new ViewRational());
                p1.buttonClick();
                logger.info("Вычисление прошло успешно");
                break;
            case 2:
                System.out.println("Какие числа будем вычитать?");
                PresenterRation p2 = new PresenterRation(new SubModelRational(), new ViewRational());
                p2.buttonClick();
                break;
            case 3:
                System.out.println("Какие числа будем умножать?");
                PresenterRation p3 = new PresenterRation(new MultModelRational(), new ViewRational());
                p3.buttonClick();
                break;
            case 4:
                System.out.println("Какие числа будем делить?");
                PresenterRation p4 = new PresenterRation(new DivModelRational(), new ViewRational());
                p4.buttonClick();
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }

    }

    public void startComplex() {
        switch (menu.selectFunction()) {
            case 1:
                System.out.println("Какие числа будем суммировать?");
                PresenterComplex p1 = new PresenterComplex(new SumModelComplex(), new ViewComplex());
                p1.buttonClick();
                break;
            case 2:
                System.out.println("Какие числа будем вычитать?");
                PresenterComplex p2 = new PresenterComplex(new SubModelComplex(), new ViewComplex());
                p2.buttonClick();
                break;
            case 3:
                System.out.println("Какие числа будем умножать?");
                PresenterComplex p3 = new PresenterComplex(new MultModelComplex(), new ViewComplex());
                p3.buttonClick();
                break;
            case 4:
                System.out.println("Какие числа будем делить?");
                PresenterComplex p4 = new PresenterComplex(new DivModelComplex(), new ViewComplex());
                p4.buttonClick();
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }

    }

}
