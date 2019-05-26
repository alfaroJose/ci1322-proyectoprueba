package ucr.ac.ecci.ci1322.proyectoprueba1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @Column(name = "teacherID", nullable = false, length = 150)
    private String teacherID;
    private School school;
    private String teacherType;
    @Column(name = "salary")
    private double salary;
    @Column(name = "gender", nullable = false, length = 50)
    private String gender;
    private List<Course> courses;

    public Teacher() {
        teacherID = "";
        school = null;
        teacherType = "";
        salary = 0;
        gender = "";
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(String teacherType) {
        this.teacherType = teacherType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
