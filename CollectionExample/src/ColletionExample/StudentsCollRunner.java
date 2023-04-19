package ColletionExample;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AcendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(2, "Amarnath Sah"), new Student(5, "Rahul Kumar Sah"),
				new Student(1, "Akash Kumar Sah"));

		List<Student> studentAl = new ArrayList<>(students);

		// System.out.println(students);

		Collections.sort(studentAl);

		System.out.println(studentAl);

		Collections.sort(studentAl, new AcendingStudentComparator());

		studentAl.sort(new AcendingStudentComparator());

		System.out.println("AccendingStudentComparator" + studentAl);
	}

}
