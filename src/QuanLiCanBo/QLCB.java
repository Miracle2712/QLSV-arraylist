package QuanLiCanBo;

import java.util.ArrayList;
import java.util.List;

public class QLCB implements QuanLy<CanBo>{
    List<CanBo> canBoList = new ArrayList<>();

    public QLCB() {
    }

    public QLCB(List<CanBo> canBoList) {
        this.canBoList = canBoList;
    }

    public List<CanBo> getCanBoList() {
        return canBoList;
    }

    public void setCanBoList(List<CanBo> canBoList) {
        this.canBoList = canBoList;
    }

    @Override
    public void add(CanBo canBo) {
        canBoList.add(canBo);
    }

    @Override
    public void display() {
        for (int i = 0; i < canBoList.size(); i++) {
            System.out.println(canBoList.get(i));
        }
    }

    @Override
    public void edit(String name, CanBo canBo) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public int findIndexByName(String name) {
        for (int i = 0; i < canBoList.size(); i++) {
            if (canBoList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }



    public void exit(){
        System.exit(0);
    }
}
