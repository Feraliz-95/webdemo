package pro.sky.course.webdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Reader {

    @Id
    @GeneratedValue
    private long id;

    private int personaNumber;
    private String firstName;
    private String secondName;
    private String middleName;


    @OneToMany(mappedBy = "reader")
    private Collection<Book> books;

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", personaNumber=" + personaNumber +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return id == reader.id && personaNumber == reader.personaNumber && Objects.equals(firstName, reader.firstName) && Objects.equals(secondName, reader.secondName) && Objects.equals(middleName, reader.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personaNumber, firstName, secondName, middleName);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPersonaNumber() {
        return personaNumber;
    }

    public void setPersonaNumber(int personaNumber) {
        this.personaNumber = personaNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
