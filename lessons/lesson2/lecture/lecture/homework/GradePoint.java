package lesson2.lecture.lecture.homework;

public class GradePoint {
    String grade;
    Student student;

    private GradePoint(String grade, Student student) {
        this.grade = grade;
        this.student = student;
        this.student.setGrade(this);
    }

    public static GradePoint createGradePoint(String grade, Student student) {
        return new GradePoint(grade, student);
    }
}
