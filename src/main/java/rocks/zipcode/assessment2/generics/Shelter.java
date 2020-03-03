package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Dog;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable<T>{


   private ArrayList<T> sheltered;

    public Shelter() {
        sheltered = new ArrayList<>();
    }
    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return sheltered.size();
    }

    public void add(Object object) {
        sheltered.add((T) object);
    }

    public Boolean contains(Object object) {
        return sheltered.contains(object);
    }

    public void remove(Object object) {
        sheltered.remove(object);
    }

    public Object get(Integer index) {
        return sheltered.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return sheltered.indexOf(ageable);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}