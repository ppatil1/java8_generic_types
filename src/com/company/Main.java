package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi Java8");
        List<Person> personList = new ArrayList<>(

        );

        personList.add(new Person("prabhu","pp@mm.com",10));
        personList.add(new Person("raghu","rr@mm.com",7));
        personList.add(new Person("xchan","xx@mm.com",11));

        Person[] rosterAsArray = personList.toArray(new Person[personList.size()]);
        Arrays.sort(rosterAsArray,Person::compareByAge);
        System.out.println(rosterAsArray);

        /* Person p;

        for (Iterator i=personList.iterator(); i.hasNext();){
            p = (Person)i.next();
            if(!p.getName().equals("prabhu")){
                p.print();
                System.out.println(p.getEmail());
            }
        }*/

        //printPersonsWithPredicate(personList,person -> !person.getName().equals("prabhu"));
        /*processElements(personList,
                person -> !person.getName().equals("prabhu"),
                person1 -> person1.getEmail(),
                email -> System.out.println(email)); */
    }

    private static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester){
            for (Person p:roster){
                if (tester.test(p)){
                    p.print();
                }
            }

    }

    private static <X,Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X,Y> mapper,
            Consumer<Y> block){
            for (X p:source) {
                if (tester.test(p)) {
                    Y data = mapper.apply(p);
                    block.accept(data);
                }
            }
    }
}
