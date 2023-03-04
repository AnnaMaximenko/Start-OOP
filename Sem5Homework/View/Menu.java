package Sem5Homework.View;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public int selectFunction() {
        System.out.print("""
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. сложение
                2. вычитание
                3. умножение
                4. деление
                --------------------------------------
                        """);
        return scanner.nextInt();
    }

    public int selectCalc() {
        System.out.print("""
                --------------------------------------
                Выберите тип чисел:
                --------------------------------------
                1. рациональные
                2. комплексные
                --------------------------------------
                        """);
        return scanner.nextInt();
    }

}
