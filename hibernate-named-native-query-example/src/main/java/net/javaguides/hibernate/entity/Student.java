package net.javaguides.hibernate.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "student")

@NamedNativeQuery(name = "GET_STUDENTS_COUNT", query = "select count(1) from student")

@NamedNativeQueries({@NamedNativeQuery(name = "GET_STUDENT_BY_ID", query = "select * from student where id=:id"), @NamedNativeQuery(name = "GET_ALL_STUDENTS", query = "select * from student", resultClass = Student.class)})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public Student() {

    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }

}
