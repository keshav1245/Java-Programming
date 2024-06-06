package S10_Generics.GenericExtras.model;

import java.util.Comparator;

public class LPAStudentComparator implements Comparator<LPAStudent> {
    @Override
    public int compare(LPAStudent lpaStudent, LPAStudent t1) {
        return (int) (lpaStudent.getPercentComplete() - t1.getPercentComplete());
    }
}
