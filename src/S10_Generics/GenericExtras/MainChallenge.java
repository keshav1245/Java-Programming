package S10_Generics. GenericExtras;

import S10_Generics.GenericExtras.model.LPAStudent;
import S10_Generics.GenericExtras.model.LPAStudentComparator;
import S10_Generics.GenericExtras.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class MainChallenge {

    public static void main(String[] args) {
        QueryList<LPAStudent> queryList = new QueryList<>();

        for(int i = 0 ; i< 25;i++){
            queryList.add(new LPAStudent());
        }

        System.out.println("ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matchs");

        var matches = queryList
                .getMatches("PercentComplete", "50")
                .getMatches("course", "Python");
        matches.sort(new LPAStudentComparator());
        printList(matches);
    }

    public static void printList(List<?> students){

        for(var s : students){
            System.out.println(s);
        }
    }
}
