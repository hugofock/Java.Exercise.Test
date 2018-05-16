package test;

import org.junit.Test;
import test.model.Student;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.assertj.core.util.Lists.newArrayList;

public class StudentInformationTest {
    @Test
    public void orderingReport() throws Exception {
        assertThat(StudentInformation.OrderingReport(
                newArrayList(
                        new Student(33, "Tina", 3.68),
                        new Student(85, "Louis", 3.85),
                        new Student(56, "Samil", 3.75),
                        new Student(19, "Samar", 3.75),
                        new Student(22, "Lorry", 3.76)
                )))
                .containsExactlyElementsOf(
                        newArrayList("Louis", "Lorry", "Samar", "Samil", "Tina")
                );
    }

}