package Sem2Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PeopleOne extends Control {

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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public String getProfession() {
        return profession;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public String getEducation() {
        return education;
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

    @Override
    public String toString() {
        return "People: Имя=" + name + ", фамилия=" + surname + ", отчество=" + patronymic + ", пол="
                + gender;
    }

}
