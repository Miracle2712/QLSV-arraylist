package QLS;

import java.util.ArrayList;
import java.util.List;

public class QLTL implements GaneralManage<TaiLieu>{

    private List<TaiLieu> taiLieus = new ArrayList<>();

    public QLTL() {
        taiLieus.add(new Sach("KD",120));
        taiLieus.add(new TapChi("KN",80));
        taiLieus.add(new Sach("TL",110));
        taiLieus.add(new TapChi("HN",80));
        taiLieus.add(new TapChi("HCM",111));
    }

    @Override
    public void add(TaiLieu taiLieu) {

    }

    @Override
    public void edit(int id, TaiLieu taiLieu) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findIndexByName(String name) {
        return 0;
    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public void printAll() {
        for (TaiLieu t :
             taiLieus ) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        QLTL qltl = new QLTL();
        qltl.printAll();
    }

}
