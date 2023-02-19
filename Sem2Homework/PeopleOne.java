package Sem2Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PeopleOne {
    public static void main(String[] args) {
        RepositoryPeople peoples = new RepositoryPeople();

        peoples.Create(new PeopleOne(1, "Елена", "Котикова", "Кириловна", "Женщина", null, null, null, null, null));
        peoples.Create(new PeopleOne(2, "Николай", "Котиков", "Петрович", "Мужчина",
                null, null, null, null, null));
        peoples.Create(new PeopleOne(3, "Василий", "Персиков", "Петрович", "Мужчина", null, null, null, null, null));
        peoples.Create(new PeopleOne(4, "Мария", "Персикова", "Николаевна", "Женщина", null, null, null, null, null));

        RepositoryMerRelation married = new RepositoryMerRelation();

        married.Create(new MarriageRelat(1, 2, 0, 0));
        married.Create(new MarriageRelat(2, 1, 0, 0));
        married.Create(new MarriageRelat(3, 4, 0, 0));
        married.Create(new MarriageRelat(4, 3, 0, 0));

        Repo repo = new Repo(peoples, married);

        // var res = repo.readPeopleList();
        // System.out.println(res);

        // Communication.Partner(repo, 1);
        // Communication.Partner(repo, 2);

        // System.out.println(married.Read(1));
        System.out.println(repo.Read(3));
        // System.out.println(repo.ReadPartner(2));
        System.out.println("Партнер: " + repo.Read(repo.ReadPartner(3)));

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

    // public static void Partner(Repo repo, int id) {
    // var res = repo.readMer();
    // System.out.println(res);

    // }

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
