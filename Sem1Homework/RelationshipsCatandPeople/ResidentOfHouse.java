package Sem1Homework.RelationshipsCatandPeople;

import java.sql.Date;
import java.util.Random;

public class ResidentOfHouse {
    public static void main(String[] args) {

        Person nikolay = new Person();
        nikolay.setName("Николай");
        nikolay.setGender("Мужской");
        nikolay.setProfession("Водитель");

        Cat barsik = new Cat();
        barsik.setName("Барсик");
        barsik.setBreed("Сфинкс");
        barsik.setGender("Мужской");

        feedTheCat(nikolay, barsik);

    }

    public static void feedTheCat(Person nikolay, Cat barsik) {
        Random random = new Random();
        int min = 1;
        int max = 3;
        int diff = max - min;

        String nameOwner = nikolay.getName();
        String nameCat = barsik.getName();

        barsik.sleep();
        nikolay.callTheCat(nameOwner);
        int i = random.nextInt(diff + 1) + min;

        switch (i) {
            case 1:
                barsik.walking();
                barsik.voice(nameCat);
                barsik.voice(nameCat);
                nikolay.giveFood(nameOwner);
                barsik.purr(nameCat);
                barsik.eat();
                barsik.happy();
                nikolay.happy();
                break;
            case 2:
                barsik.sleep();
                nikolay.catnotHungry(nameOwner);
                break;
            case 3:
                barsik.walking();
                barsik.voice(nameCat);
                barsik.voice(nameCat);
                nikolay.giveFood(nameOwner);
                barsik.purr(nameCat);
                barsik.shiff(nameCat);
                barsik.escape();
                nikolay.giveFood(nameOwner);
                nikolay.sadness();
                barsik.sadness();
                break;

        }

    }

}

/**
 * InnerResidentOfHouse1
 */
class Resident {
    private String name;
    private Date dateOfBirth;
    private String gender;
    private Integer temperature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    void eat() {
        System.out.println(name + ": Ем");
    }

    void sleep() {
        System.out.println(name + ": Сплю");
    }

    void rest() {
        System.out.println("Отдыхаю");
    }

    void sit() {
        System.out.println("Сижу");
    }

    void expect() {
        System.out.println("Жду");
    }

    void walking() {
        System.out.println(name + ": Иду");
    }

    public void happy() {
        System.out.println(name + ": *Счастлив*");
    }

    public void sadness() {
        System.out.println(name + ": *Печаль*");
    }

    void escape() {
        System.out.println(name + ": Убегаю");
    }

}

/**
 * InnerResidentOfHouse1
 */
class Person extends Resident {
    private String profession;
    private Integer height;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void callTheCat(String name) {
        System.out.println(name + ": Кис кис");
    }

    public void giveFood(String name) {
        System.out.println(name + ": Насыпаю корм");
    }

    public void catnotHungry(String name) {
        System.out.println(name + ": *Думаю, что кот не голодный*");
    }

    public void foodNotTasty(String name) {
        System.out.println(name + ": Купил не вкусный корм");
    }

}

class Cat extends Resident {
    private Integer bodyLenght;
    private String breed;

    public Integer getBodyLenght() {
        return bodyLenght;
    }

    public void setBodyLenght(Integer bodyLenght) {
        this.bodyLenght = bodyLenght;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void voice(String name) {
        System.out.println(name + ": Мяу");
    }

    void purr(String name) {
        System.out.println(name + ": *Мурчание*");
    }

    void shiff(String name) {
        System.out.println(name + ": *Нюхает*");
    }
}
