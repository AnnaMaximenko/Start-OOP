package Sem6;

import java.util.Scanner;
import java.util.logging.*;

import Sem6.Controller.PresenterRation;
import Sem6.Model.ModelRational.DivModelRational;
import Sem6.Model.ModelRational.MultModelRational;
import Sem6.Model.ModelRational.SubModelRational;
import Sem6.Model.ModelRational.SumModelRational;
import Sem6.View.Menu;
import Sem6.View.ViewRational;

public class PresenterStartRation {

    PresenterRation presenterRation;
    Menu menu;
    Scanner scanner;

    public PresenterStartRation(Menu menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
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
                logger.info("Вычисление прошло успешно");

                break;
            case 3:
                System.out.println("Какие числа будем умножать?");
                PresenterRation p3 = new PresenterRation(new MultModelRational(), new ViewRational());
                p3.buttonClick();
                logger.info("Вычисление прошло успешно");

                break;
            case 4:
                System.out.println("Какие числа будем делить?");
                PresenterRation p4 = new PresenterRation(new DivModelRational(), new ViewRational());
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
