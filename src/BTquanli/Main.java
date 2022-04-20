package BTquanli;

public class Main {
    public static void main(String[] args) {
        Family family = new Family("Hải Phòng");
        family.add(new Person(1,"son",26));
        family.add(new Person(2,"hoàng",25));
        family.add(new Person(3,"nam",29));
        family.display();
        family.delete(3);
        System.out.println("Sau khi xóa");
        family.display();
        System.out.println("------------------------");

        Family family2 = new Family("Hà Nội");
        family2.add(new Person(1,"hà",21));
        family2.add(new Person(2,"hồng",24));
        family2.add(new Person(3,"hoa",25));
        family2.display();
        System.out.println("------------------------");

        family2.displayTheYoungest();
        System.out.println("------------------------");
        System.out.println("List Family in Town");
        Town town = new Town();
        town.add(family2);
        town.add(family);
        town.display();
    }
}
