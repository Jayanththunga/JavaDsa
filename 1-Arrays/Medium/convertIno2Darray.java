import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/

public class convertIno2Darray {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();

        for (int i : nums) {
            if (lst.size() == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                lst.add(list);
            } else {
                boolean added = false;
                for (int j = 0; j < lst.size(); j++) {
                    if (!lst.get(j).contains(i)) {
                        lst.get(j).add(i);
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    lst.add(list);
                }
            }
        }

        return lst;
    }
}
