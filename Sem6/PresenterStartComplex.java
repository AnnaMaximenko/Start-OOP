package Sem6;

import java.util.logging.*;
import java.util.Scanner;

import Sem6.Controller.PresenterComplex;
import Sem6.Model.ModelKomplex.DivModelComplex;
import Sem6.Model.ModelKomplex.MultModelComplex;
import Sem6.Model.ModelKomplex.SubModelComplex;
import Sem6.Model.ModelKomplex.SumModelComplex;
import Sem6.View.Menu;
import Sem6.View.ViewComplex;

public class PresenterStartComplex {

    PresenterComplex presenterComplex;
    Menu menu;
    Scanner scanner;

    public PresenterStartComplex(Menu menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
    }

    public void startComplex() {
        Logger logger = Logger.getGlobal();
        switch (menu.selectFunction()) {
            case 1:
                System.out.println("Какие числа будем суммировать?");
                PresenterComplex p1 = new PresenterComplex(new SumModelComplex(), new ViewComplex());
                p1.buttonClick();
                logger.info("Вычисление прошло успешно");
                break;
            case 2:
                System.out.println("Какие числа будем вычитать?");
                PresenterComplex p2 = new PresenterComplex(new SubModelComplex(), new ViewComplex());
                p2.buttonClick();
                logger.info("Вычисление прошло успешно");
                break;
            case 3:
                System.out.println("Какие числа будем умножать?");
                PresenterComplex p3 = new PresenterComplex(new MultModelComplex(), new ViewComplex());
                p3.buttonClick();
                logger.info("Вычисление прошло успешно");
                break;
            case 4:
                System.out.println("Какие числа будем делить?");
                PresenterComplex p4 = new PresenterComplex(new DivModelComplex(), new ViewComplex());
                p4.buttonClick();
                logger.info("Вычисление прошло успешно");
                break;
            default:
                System.out.println("Неверный ввод");
                logger.info("Ошибка");
                break;
        }

    }

}
