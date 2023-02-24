package Sem2Homework;

import java.util.ArrayList;
import java.util.List;

public class PeopleOne extends Control {

    private int id;
    private String name;
    private String surname;
    private String patronymic;// отчество
    private String gender;
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

    public PeopleOne(int id,
            String name,
            String surname,
            String patronymic,
            String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People: Имя=" + name + ", фамилия=" + surname + ", отчество=" + patronymic + ", пол="
                + gender;
    }

    public class Builder {
        // Обязательные параметры
        private final int id;
        private final String name;
        private final String surname;
        private final String patronymic;// отчество
        // Дополнительные параметры - инициализируются значениями по умолчанию
        private String gender;
        private List<BloodRelat> relations = new ArrayList<>();
        private List<MarriageRelat> merriRelations = new ArrayList<>();

        public Builder(int id, String name, String surname, String patronymic) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;

        }

        public Builder gender(String sex) {
            gender = sex;
            return this;
        }

        public Builder relations(List<BloodRelat> rel) {
            relations = rel;
            return this;
        }
    }

    public PeopleOne(Builder builder) {
        id = builder.id;
        name = builder.name;
        surname = builder.surname;
        patronymic = builder.patronymic;
        gender = builder.gender;
        relations = builder.relations;
        merriRelations = builder.merriRelations;

    }
}
