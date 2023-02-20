package Sem2Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleOne extends Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие:\n1-Распечатать список всех людей\n2-Поиск связей человека по ID");
        System.out.println();

        int number = scanner.nextInt();

        RepositoryPeople peoples = new RepositoryPeople();

        peoples.Create(new PeopleOne(1, "Елена", "Котикова", "Кириловна", "Женщина", null, null, null, null, null));
        peoples.Create(new PeopleOne(2, "Николай", "Котиков", "Петрович", "Мужчина",
                null, null, null, null, null));
        peoples.Create(new PeopleOne(3, "Василий", "Персиков", "Петрович", "Мужчина", null, null, null, null, null));
        peoples.Create(new PeopleOne(4, "Мария", "Персикова", "Николаевна", "Женщина", null, null, null, null, null));
        peoples.Create(
                new PeopleOne(5, "Екатерина", "Персикова", "Николаевна", "Женщина", null, null, null, null, null));
        peoples.Create(new PeopleOne(6, "Михаил", "Персиков", "Николаевич", "Мужчина", null, null, null, null, null));
        peoples.Create(new PeopleOne(7, "Мария", "Таврикова", "Криловна", "Женщина", null, null, null, null, null));
        peoples.Create(new PeopleOne(8, "Дмитрий", "Тавриков", "Евгеньевич", "Мужчина", null, null, null, null, null));

        RepositoryMerRelation married = new RepositoryMerRelation();

        married.Create(new MarriageRelat(1, 2, 0, 0));
        married.Create(new MarriageRelat(2, 1, 0, 0));
        married.Create(new MarriageRelat(3, 4, 0, 0));
        married.Create(new MarriageRelat(4, 3, 0, 0));

        RepositoryBloodRelation bloodRel = new RepositoryBloodRelation();

        bloodRel.Create(new BloodRelat(1, 3, 4, 0, 0, null));
        bloodRel.Create(new BloodRelat(2, 7, 8, 0, 0, null));

        RepositoryChild children = new RepositoryChild();

        children.Create(new ChildRelations(5, 2, 1, 4, 3, null));
        children.Create(new ChildRelations(6, 2, 1, 4, 3, null));

        Repo repo = new Repo(peoples, married, bloodRel, children);

        Start.Control(number, repo);

    }

    private int id;
    private String name;
    private String surname;
    private String patronymic;// отчество
    private String gender;
    private LocalDate dateOfBirth;// LocalDate.of(2017, Month.NOVEMBER, 30)
    private LocalDate dateOfDeath;// LocalDate.of(2017, Month.NOVEMBER, 30)
    private String profession;
    private String placeOfResidence;
    private String education;// образование
    private List<BloodRelat> relations = new ArrayList<>();
    private List<MarriageRelat> merriRelations = new ArrayList<>();

    public void addmarriageRelations(MarriageRelat merriRelation) {
        this.merriRelations.add(merriRelation);
    }

    public void printmarriageRelations() {
        for (MarriageRelat marriageRelations : merriRelations) {
            System.out.println(marriageRelations);
        }
    }

    public List<MarriageRelat> readmeriageRelations() {
        List<MarriageRelat> people = new ArrayList<>();

        for (int i = 0; i < merriRelations.size(); i++) {
            people.add(merriRelations.get(i));
        }
        return people;

    }

    public void addbloodRelations(BloodRelat relation) {
        this.relations.add(relation);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public PeopleOne(int id,
            String name,
            String surname,
            String patronymic,
            String gender,
            LocalDate dateOfBirth,
            LocalDate dateOfDeath,
            String profession,
            String placeOfResidence,
            String education) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.profession = profession;
        this.placeOfResidence = placeOfResidence;
        this.education = education;
    }

    // @Override
    // public String toString() {
    // return "People: Имя=" + name + ", фамилия=" + surname + ", отчество=" +
    // patronymic + ", пол="
    // + gender
    // + ", отношения по браку: " + merriRelations + "";
    // }

    @Override
    public String toString() {
        return "People: Имя=" + name + ", фамилия=" + surname + ", отчество=" + patronymic + ", пол="
                + gender;
    }
}
