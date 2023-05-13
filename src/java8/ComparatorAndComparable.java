package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20)
        );

    // Sort by age (using natural ordering)
        Collections.sort(persons);
        persons.forEach(person -> System.out.println(person.getAge() + " " + person.getName()));

        System.out.println();

    // Sort by name (using custom comparator)
        Collections.sort(persons, new PersonNameComparator());
        persons.forEach(person -> System.out.println(person.getAge() + " " + person.getName()));
    }
}


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare persons by their age
        return Integer.compare(this.age, other.age);
    }
}

class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        // Compare persons by their name
        return p1.getName().compareTo(p2.getName());
    }
}