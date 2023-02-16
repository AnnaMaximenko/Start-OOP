// package Sem1Homework.Tree;

// import java.util.ArrayList;

// public class Repo {

// }

// class PeopleRepository {

// ArrayList<People> db = new ArrayList<>();

// /// TODO
// public static ArrayList<People> getDb() {
// return db;// ???!!!!
// }

// void create(People current) {
// db.add(current);
// }

// People read(int id) {
// return db.get(id);
// }

// People read(String fl) {
// for (People people : db) {
// if (people.getSurname().equals(fl))
// return people;
// }
// return null;
// }
// }

// class MarriageRelationsRep {
// ArrayList<marriageRelations> db = new ArrayList<>();

// public ArrayList<marriageRelations> getDb() {
// return db;
// }

// void create(marriageRelations current) {
// db.add(current);
// }

// ArrayList<marriageRelations> read(int id) {
// ArrayList<marriageRelations> t = new ArrayList<>();

// for (marriageRelations relations : db) {
// if (relations.getWhoseRelations() == id) {
// t.add(relations);
// }
// }
// return t;
// }

// }

// class BloodRelationsRep {

// void create(bloodRelations current) {

// }

// bloodRelations read() {
// // TODO Auto-generated method stub
// return null;
// }
// }

// class Repos {
// PeopleRepository pr;
// MarriageRelationsRep ar;

// public Repos(PeopleRepository pr, MarriageRelationsRep ar) {
// this.pr = pr;
// this.ar = ar;
// }

// StringBuilder readCommonList() {
// StringBuilder sb = new StringBuilder();

// for (People item : pr.getDb()) {
// sb.append(String.format("%s %s %s\n", item.getName(), item.getSurname(),
// ar.read(item.getId())));
// }

// return sb;
// }

// }
