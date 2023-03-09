package Sem6;

import java.util.Scanner;
import java.util.logging.*;

import Sem6.Controller.PresenterRation;
import Sem6.View.Menu;

public class PresenterStart {

    PresenterRation presenterRation;
    Menu menu;
    Scanner scanner;
    PresenterStartRation startRation;
    PresenterStartComplex startComplex;

    public PresenterStart(PresenterRation presenterRation,
            Menu menu,
            Scanner scanner,
            PresenterStartRation startRation,
            PresenterStartComplex startComplex) {
        this.presenterRation = presenterRation;
        this.menu = menu;
        this.scanner = scanner;
        this.startRation = startRation;
        this.startComplex = startComplex;
    }

    public void start() {
        Logger logger = Logger.getGlobal();
        switch (menu.selectCalc()) {
            case 1:
                logger.info("Выбраны рациональные числа");
                startRation.startRation();
                break;
            case 2:
                logger.info("Выбраны комплексные числа");
                startComplex.startComplex();
                break;
            default:
                logger.info("Ошибка");
                System.out.println("Неверный ввод");
                break;

        }
    }

}
