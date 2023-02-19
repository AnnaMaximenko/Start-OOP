package Sem2Homework;

import java.time.LocalDate;
import java.util.ArrayList;

public class Communication extends PeopleOne {
    public Communication(int id,
            String name,
            String surname,
            String patronymic,
            String gender,
            LocalDate dateOfBirth,
            LocalDate dateOfDeath,
            String profession,
            String placeOfResidence,
            String education) {
        super(id, name, surname, patronymic, gender, dateOfBirth, dateOfDeath, profession, placeOfResidence, education);

    }

    public static void main(String[] args) {

    }

    public static void Partner(Repo repo, int id) {
        // StringBuilder readPeopl = new StringBuilder();
        // var Id = repo.readID(id);

        // if (Id != null) {
        // readPeopl.append(String.format("%s \n", .getPartnerId()));

        // }

        // if (id.contains(Id.lastIndexOf(i))) {
        // // var res = repo.readMer();
        // // System.out.println(res);
        // System.out.println("Есть партнер");

        // } else {
        // System.out.println("Нет партнера");

        // }

        // }
        // var res = repo.readID(id);
        // System.out.println(String.format("%s \n", res));

    }

}
