package ucr.ac.ecci.ci1322.proyectoprueba1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @Column(name = "courseId", nullable = false, length = 150)
    private String courseID;
    @Column(name = "courseName", nullable = false, length = 200)
    private String courseName;
    @ManyToOne()
    @JoinColumn(name="teacherId", nullable=false)
    private Teacher teacher;

    private List<Student> students;

    public Course() {
        courseID = "";
        courseName = "";
        teacher = null;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
