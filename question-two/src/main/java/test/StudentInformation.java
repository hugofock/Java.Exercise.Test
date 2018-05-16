package test;

import test.comparator.SortOrder;
import test.model.Student;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class StudentInformation {
    private StudentInformation() {
    }

    public static List<String> OrderingReport(final List<Student> students) {
        Collections.sort(students, new SortOrder());
        students.forEach(System.out::println);
        return students.stream().map(Student::getFirstName).collect(toList());
    }
}
