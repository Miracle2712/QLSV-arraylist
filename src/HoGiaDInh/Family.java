package HoGiaDInh;

import java.util.ArrayList;
import java.util.List;

public class Family extends Person {
    private String address;
    private static int number=0;
    static List<Person> personList = new ArrayList<>();

    public Family() {
    }

    public Family(String name, int age, String job, int id, String address, int number, List<Person> personList) {
        super(name, age, job, id);
        this.address = address;
        this.number = number;
        this.personList = personList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void add(Person person){
        personList.add(person);
        number++;
    }
    public static void display(){
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }
    public static int findById(int id){
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    public void Edit(int id, Person person){
        int indexOfId=findById(id);
        if(indexOfId==-1){
            System.out.println("ko có thành viên này");
        }
        else{
            System.out.println(personList.set(indexOfId,person));
        }
    }
    public void delete (int id){
        personList.remove(findById(id));
        number--;
    }
}