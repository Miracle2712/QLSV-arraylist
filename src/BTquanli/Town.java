package BTquanli;

import java.util.ArrayList;
import java.util.List;

public class Town implements Manage<Family>{
    private List<Family> familyList = new ArrayList<>();

    public Town() {
    }

    @Override
    public void add(Family family) {
        familyList.add(family);
    }

    @Override
    public void edit(int id, Family family) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void display() {
        for (int i = 0; i < familyList.size(); i++) {
            familyList.get(i).display();
        }
    }

    @Override
    public int findIndexById(int o) {
        return 0;
    }


}
