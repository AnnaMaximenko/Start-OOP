package Sem2Homework;

import java.util.ArrayList;
import java.util.List;

public class RepositoryPeople extends Repository {
    ArrayList<PeopleOne> peoples = new ArrayList<>();

    public ArrayList<PeopleOne> getDb() {
        return peoples;
    }

    void Create(PeopleOne current) {
        peoples.add(current);
    }

    public PeopleOne Read(int id) {
        return peoples.get(id);
    }

    public static void Print(List<PeopleOne> peoples) {
        for (PeopleOne one : peoples) {
            System.out.println(one);
        }
    }

    PeopleOne Read(String fl) {
        for (PeopleOne people : peoples) {
            if (people.getName().equals(fl))
                return people;
        }
        return null;
    }

}
