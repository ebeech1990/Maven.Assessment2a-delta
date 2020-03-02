package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

    private Long id = Long.MIN_VALUE;
    private String name = "";
    private Address address = new Address();

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{id=-"+id+", name='"+name+"', address="+getAddress()+"}";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }

        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;

        if(!this.id.equals(((Person) o).id)){
            return false;
        }
        if(!this.name.equals(((Person) o).name)){
            return false;
        }
        if(!this.address.equals(((Person) o).address)){
            return false;
        }
        return p.toString().equals(o.toString());
       // return (Boolean)null;
    }
}