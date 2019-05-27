package ucr.ac.ecci.ci1322.proyectoprueba1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "School")
public class School {
    @Id
    @Column(name = "name", nullable = false, length = 150)
    private String name;
    @OneToMany(mappedBy="School")
    private List<Teacher> teachers;
    @OneToMany(mappedBy="Student")
    private List<Student> students;
    @ManyToOne
    @JoinColumn(name="courseId", nullable=false)
    private List<Course> courses;

    public School() {
        name = "";
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
