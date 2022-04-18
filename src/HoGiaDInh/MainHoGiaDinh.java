package HoGiaDInh;

public class MainHoGiaDinh {
    public static void main(String[] args) {
        Family family = new Family();
        Family.add(new Person("Son" , 26 , "phiên dịch" , 1227));
        Family.add(new Person("Hoàng" , 22 , "giáo viên" , 1229));
        Family.add(new Person("Thịnh" , 30 , "sales" , 1228));
        Family.display();
        System.out.println("-------------------");
        System.out.println("t muon tim");
        Family.findById(1227);
        System.out.println( Family.findById(1227));

    }
}
