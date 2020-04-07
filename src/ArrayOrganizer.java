import java.util.ArrayList;
import java.util.Collections;
//CS319
public class ArrayOrganizer {
    ArrayList<Integer> concatAndSort(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3){
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        result.addAll(list3)

        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}
