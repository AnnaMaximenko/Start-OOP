package Sem2Homework;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository {

}

class RepositoryPeople extends Repository {
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

class RepositoryMerRelation extends Repository {

    ArrayList<MarriageRelat> relation = new ArrayList<>();

    public ArrayList<MarriageRelat> getRelation() {
        return relation;
    }

    void Create(MarriageRelat current) {
        relation.add(current);
    }

    // MarriageRelat ReadMar(int id) {
    // return relation.get(id);
    // }

    ArrayList<MarriageRelat> Read(int id) {
        ArrayList<MarriageRelat> t = new ArrayList<>();

        for (MarriageRelat relat : relation) {
            if (relat.whoseRelations == id) {
                t.add(relat);
            }
        }
        return t;
    }

}

class Repo {
    RepositoryPeople repPeopl;
    RepositoryMerRelation repMerRelat;
    ArrayList<PeopleOne> peoples;

    public Repo(RepositoryPeople repPeopl, RepositoryMerRelation repMerRelat) {
        this.repPeopl = repPeopl;
        this.repMerRelat = repMerRelat;
    }

    StringBuilder readPeopleList() {
        StringBuilder readPeopl = new StringBuilder();

        for (PeopleOne item : repPeopl.getDb()) {
            readPeopl.append(
                    String.format("%s %s %s\n", item.getName(), item.getSurname(), repMerRelat.Read(item.getId())));
        }

        return readPeopl;
    }

    // StringBuilder Read(int id) {
    // StringBuilder readPeopl = new StringBuilder();

    // for (PeopleOne item : repPeopl.getDb()) {
    // if (id == item.getId()) {
    // readPeopl.append(
    // String.format("%s %s %s", item.getName(), item.getSurname(),
    // repMerRelat.Read(item.getId())));
    // }
    // }
    // return readPeopl;
    // }

    StringBuilder Read(int id) {
        StringBuilder readPeopl = new StringBuilder();

        for (PeopleOne item : repPeopl.getDb()) {
            if (id == item.getId()) {
                readPeopl.append(
                        String.format("%s %s", item.getName(), item.getSurname()));
            }
        }
        return readPeopl;
    }

    int ReadPartner(int id) {
        StringBuilder readPeopl = new StringBuilder();

        for (MarriageRelat item : repMerRelat.getRelation()) {
            if (id == item.getWhoseRelations()) {
                readPeopl.append(
                        String.format("%s", item.getPartnerId()));
            }
        }
        return Integer.parseInt(readPeopl.toString());
    }

}