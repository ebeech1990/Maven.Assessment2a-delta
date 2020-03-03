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

    private Long id;
    private String name;
    private Address address;

    public Person(Long id, String name, Address address) {
        if(id != null && name != null && address != null) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

    }

    public Person() {
        this(Long.MIN_VALUE, "", new Address());
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
        return "Person{id="+id+", name='"+name+"', address="+getAddress()+"}";
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

        if(!this.toString().equals(o.toString())){
            return false;
        }

        return true;
       // return (Boolean)null;
    }


}