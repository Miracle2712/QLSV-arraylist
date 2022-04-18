package qlsv;


public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        managerStudent.add(new Student(111,"Cường đô la",29));
        managerStudent.add(new Student(123,"Miracle",23));
        managerStudent.add(new Student(112,"Sơn",30));
        managerStudent.add(new Student(125,"troi",12));
        managerStudent.display();
        System.out.println("t muon tim");
        managerStudent.findByName("Miracle");
        System.out.println( managerStudent.findByName("Miracle"));
        System.out.println("-------------------");
//        managerStudent.display();
//        managerStudent.edit("Cường đô la",new Student(22,"Son",26));
//        managerStudent.display();
        System.out.println("-------------------");
//        System.out.println("tôi muốn xóa");
//        managerStudent.delete("Miracle");
//        managerStudent.display();
        managerStudent.sortByAge();
        managerStudent.display();
    }
}
