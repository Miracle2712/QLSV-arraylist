package qlsv;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ManagerStudent {
    ArrayList<Student> students;

    public ManagerStudent() {
        this.students = new ArrayList<>();
    }

    public void add(Student student){
        students.add(student);
    }

    public void display(){
        for (int i = 0 ; i < students.size() ; i++){
            System.out.println(students.get(i));
        }
        System.out.println("----------------------");
    }

        public int findByName(String name){
            for (int i = 0 ; i < students.size() ; i++){
                if(students.get(i).getName().equals(name));
                return i;

            }
            return -1;
        }


        public void edit(String name , Student student){
        int indeOfStudent = findByName(name);
            System.out.println("tôi muốn sửa");
        if(indeOfStudent == -1){
            System.out.println("không có ");
        } else{
            students.set(indeOfStudent , student);
        }
    }

    public void delete(String name){
        int indeOfStudent = findByName(name);
        if(indeOfStudent == -1){
            System.out.println("không có ");
        } else{
            students.remove(indeOfStudent);
        }
    }

    public void sortByAge(){
       Collections.sort(this.students);

    }
}

