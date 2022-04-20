package BTquanli;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Family implements Manage<Person> {
    private List<Person> personlist = new ArrayList<>();
    private String address;
    private int amountOfNumber;

    public Family(String address) {
        this.address = address;

    }

    public Family() {
    }

    public Family(List<Person> personlist, String address, int amountOfNumber) {
        this.personlist = personlist;
        this.address = address;
        this.amountOfNumber = amountOfNumber;
    }

    public List<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(List<Person> personlist) {
        this.personlist = personlist;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountOfNumber() {
        return amountOfNumber;
    }

    public void setAmountOfNumber(int amountOfNumber) {
        this.amountOfNumber = amountOfNumber;
    }


    @Override
    public void add(Person person) {
        personlist.add(person);
        this.amountOfNumber++;

    }

    @Override
    public void edit(int id, Person person) {
        if (findIndexById(id) != -1) {
            personlist.set(findIndexById(id), person);
        } else {
            System.out.println("Không có trong danh sách");
        }
    }

    @Override
    public void delete(int id) {
        if (findIndexById(id) != -1) {
            personlist.remove(findIndexById(id));
            this.amountOfNumber--;
        } else {
            System.out.println("Không có trong danh sách");
        }
    }

    @Override
    public void display() {
        System.out.println("Địa chỉ: " + address + ", số thành viên: " + amountOfNumber);
        for (int i = 0; i < personlist.size(); i++) {
            System.out.println(personlist.get(i));
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < personlist.size(); i++) {
            if (personlist.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void findIndexByName(String name){
        for (int i = 0; i < personlist.size(); i++) {
            if (personlist.get(i).getName().equals(name)) {
                System.out.println(personlist.get(i));
            }
        }
    }

    public void displayTheYoungest(){
        int minAge = 100 ;
        for (Person person : personlist) {
            if (minAge > person.getAge()) {
                minAge = person.getAge();
            }
        }
        for (Person person : personlist) {
            if (minAge == person.getAge()) {
                System.out.println(person);
            }
        }
    }
}
