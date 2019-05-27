package ucr.ac.ecci.ci1322.proyectoprueba1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "studentId", nullable = false, length = 100)
    private String studentID;
    @Column(name = "studentName", nullable = false, length = 150)
    private String studentName;
    @OneToOne()
    @JoinColumn(name="addressId")
    private StudentAddress studentAddress;
    @Column(name = "age")
    private int age;
    @Column(name = "gender", nullable = false, length = 50)
    private String gender;
    @ManyToOne
    @JoinColumn(name="name", nullable=false)
    private School school;
    @ManyToMany()
    @JoinTable(
            name = "course_student",
            joinColumns = { @JoinColumn(name = "studentId") },
            inverseJoinColumns = { @JoinColumn(name = "courseId") }
    )
    private List<Course> courses;

    public Student() {
        studentID = "";
        studentName = "";
        studentAddress = null;
        age = 0;
        gender = "";
        school = null;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}