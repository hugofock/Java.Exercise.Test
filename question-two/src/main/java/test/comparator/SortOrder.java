package test.comparator;

import test.model.Student;

import java.util.Comparator;

public class SortOrder implements Comparator<Student> {
    @Override
    public int compare(final Student o1, final Student o2) {

        int returnVal = -(Double.compare(o1.getGpa(), o2.getGpa()));
        if (returnVal == 0) {
            returnVal = (o1.getFirstName().compareTo(o2.getFirstName()));
            if (returnVal == 0) {
                returnVal = (o1.getId() - o2.getId());
            }
        }
        return returnVal;
    }
}
