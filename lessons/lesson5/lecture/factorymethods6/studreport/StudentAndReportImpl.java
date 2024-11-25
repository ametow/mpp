package lesson5.lecture.factorymethods6.studreport;

import java.util.Calendar;

//Immutable relative to its package studreport
final class StudentAndReportImpl implements StudentAndReport {
	private Student student;
	private GradeReport report;
	StudentAndReportImpl(Student s, GradeReport g) {
		Calendar.getInstance();
		student = s;
		report = g;
	}
	public Student getStudent() {
		return student;
	}
	public GradeReport getReport() {
		return report;
	}
}
