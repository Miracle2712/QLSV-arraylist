package QuanLiCanBo;

public class Test {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        qlcb.add(new CanBo("son",26,"nam","HP"));
        qlcb.add(new CanBo("nam",27,"nam","Hn"));
        qlcb.add(new CanBo("hai",28,"nữ","TP"));
        qlcb.add(new CanBo("hoang",29,"nam","ND"));
        qlcb.display();
        System.out.println("------------------------");
        System.out.println("Vị trí cần tìm");
        qlcb.findIndexByName("nam");
        System.out.println(qlcb.findIndexByName("nam"));
        qlcb.exit();
    }
}
