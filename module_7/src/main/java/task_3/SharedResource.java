package task_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gleb_Yants on 09.07.2016.
 */

public class SharedResource {
    private List<Integer> list;

    public SharedResource() {
        list = new ArrayList<Integer>();
    }

    public void setElement(Integer element) {
        list.add(element);
    }

    public Integer getELement() {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

}
