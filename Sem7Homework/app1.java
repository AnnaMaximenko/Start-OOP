package Sem7Homework;

public class app1 {
    public static void main(String[] args) {
        new Innerapp(null).write();
    }
}

interface IInterface {

    void print();
}

class Innerapp implements IInterface {
    String v;// Интерфейс не может быть параметром объекта

    public Innerapp(String v) {
        this.v = v;
    }

    void write() {
        print();
    }

    @Override
    public void print() {
        System.out.println("Программа работает," + "значение параметра на входе: " + v);
    }
}
