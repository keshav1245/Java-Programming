package S10_Generics.GenericExtras.util;

import S10_Generics.GenericExtras.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student & QueryItem> extends ArrayList<T> {


//    private List<T> items;

    public QueryList(){}

    public QueryList(List<T> items) {
//        this.items = items;
        super(items);
    }

    public QueryList<T> getMatches(String field, String value){
        QueryList<T>  matches = new QueryList<>();

        for(var item : this){
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        }
        return matches;
    }

    //When tried to make static, it is not possible as generic classes are instance known
    //but not known at class level. So, the way to proceed is using it as a generic method
    public static <T extends QueryItem> List<T> getMatches(List<T> items, String field, String value){
        List<T>  matches = new ArrayList<>();

        for(var item : items){
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        }
        return matches;
    }


}
