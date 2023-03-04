package Sem5Homework;

import java.util.Scanner;

import Sem5Homework.Controller.PresenterRation;

import Sem5Homework.View.Menu;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Presenter p = new Presenter(new PresenterRation(), new Menu(scanner), scanner);

        p.start();
    }

}
