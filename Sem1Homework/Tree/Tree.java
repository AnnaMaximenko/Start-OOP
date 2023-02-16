package Sem1Homework.Tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tree {
    public static void main(String[] args) {

    }

}

class People {
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;// отчество
    private String gender;
    private LocalDate dateOfBirth;// LocalDate.of(2017, Month.NOVEMBER, 30)
    private LocalDate dateOfDeath;// LocalDate.of(2017, Month.NOVEMBER, 30)
    private String profession;
    private String placeOfResidence;
    private String education;// образование
    private List<bloodRelations> relations = new ArrayList<>();
    private List<marriageRelations> merriRelations = new ArrayList<>();

    public void addmarriageRelations(marriageRelations merriRelation) {
        this.merriRelations.add(merriRelation);
    }

    public void printmarriageRelations() {
        for (marriageRelations marriageRelations : merriRelations) {
            System.out.println(marriageRelations);
        }
    }

    public List<marriageRelations> readmeriageRelations() {
        List<marriageRelations> people = new ArrayList<>();

        for (int i = 0; i < merriRelations.size(); i++) {
            people.add(merriRelations.get(i));
        }
        return people;

    }

    public void addbloodRelations(bloodRelations relation) {
        this.relations.add(relation);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public People(Integer id, String name, String surname, String patronymic, String gender, LocalDate dateOfBirth,
            LocalDate dateOfDeath, String profession, String placeOfResidence, String education) {
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
                + gender
                + ", отношения по браку: " + merriRelations + "";
    }

}
