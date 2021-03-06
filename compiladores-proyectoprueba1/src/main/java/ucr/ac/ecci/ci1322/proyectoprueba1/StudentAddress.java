package ucr.ac.ecci.ci1322.proyectoprueba1;

import javax.persistence.*;

@Entity
@Table(name = "StudentAddress")
public class StudentAddress {
    @Id
    @Column(name = "addressId", nullable = false, length = 100)
    private String studentID;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "country", nullable = false, length = 100)
    private String country;
    @Column(name = "city", nullable = true, length = 150)
    private String city;
    @OneToOne(mappedBy = "Student")
    private Student owner;

    public StudentAddress() {
        studentID = "";
        address = "";
        country = "";
        city = "";
        owner = null;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student getOwner() { return owner; }

    public void setOwner(Student owner) { this.owner = owner; }
}
