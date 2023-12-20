package lab20.number123;

import java.io.Serializable;

class Animal implements Serializable {

    private String name;
    private int age;

    Animal(String n, int a){
        name=n;
        age=a;
    }
    String getName() {return name;}
    int getAge(){ return age;}
}
