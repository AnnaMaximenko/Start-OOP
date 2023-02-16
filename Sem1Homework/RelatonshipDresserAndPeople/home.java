package Sem1Homework.RelatonshipDresserAndPeople;

import java.time.LocalDate;
import java.util.Random;

public class home {
    public static void main(String[] args) {
        People mihail = new People("Михаил", LocalDate.of(1990, 12, 6), "Мужчина", 36, 9, "No", "Наждачник");

        Wardrobe titus = new Wardrobe("Titus", "Hoff", "Белый", 180, 400, "Yes", 10);

        openCloset(mihail, titus);

    }

    public static void openCloset(People person, Wardrobe item) {
        Random random = new Random();
        int min = 1;
        int max = 2;
        int diff = max - min;

        String nameOwner = person.getName();
        // String nameItem = item.getDesignation();

        person.comeUp(nameOwner);
        int i = random.nextInt(diff + 1) + min;

        switch (i) {
            case 1:
                if (person.getPower() > item.getMoment()) {
                    System.out.println(nameOwner + ": *Открыл*");
                } else {
                    System.out.println(nameOwner + ": *Не хватает сил открыть*");
                }
                break;
            case 2:
                if (person.getKey().equals(item.getCastle())) {
                    System.out.println(nameOwner + ": *Открыл*");
                } else {
                    System.out.println(nameOwner + ": *Нет ключа*");
                }
                break;
        }

    }
}

class People {
    private String name;
    private LocalDate dateOfBirth;
    private String gender;
    private Integer temperature;
    private Integer power;
    private String key;
    private String profession;

    public People(String name, LocalDate dateOfBirth, String gender, Integer temperature, Integer power, String key,
            String profession) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.temperature = temperature;
        this.power = power;
        this.key = key;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
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

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String toString() {
        return "People [name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", power="
                + power
                + ", key=" + key + "]";
    }

    public void comeUp(String name) {
        System.out.println(name + ": *Подхожу к шкафу*");
    }

}

class Wardrobe {
    private String designation;// обозначение-название
    private String manufacturer;
    private String color;
    private int weight;
    private int height;
    private String castle;// замок
    private int moment;// усилие, которое нужно приложить для открытия двери

    public Wardrobe(String designation, String manufacturer, String color, int weight, int height, String castle,
            int moment) {
        this.designation = designation;
        this.manufacturer = manufacturer;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.castle = castle;
        this.moment = moment;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCastle() {
        return castle;
    }

    public void setCastle(String castle) {
        this.castle = castle;
    }

    public int getMoment() {
        return moment;
    }

    public void setMoment(int moment) {
        this.moment = moment;
    }

    public String toString() {
        return "Wardrobe [manufacturer=" + manufacturer + ", color=" + color + ", weight=" + weight + ", height="
                + height
                + ", castle=" + castle + "]";
    }

}
