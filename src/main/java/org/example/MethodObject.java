package org.example;
class  Object{
    private String name;
    private int age;
    Object(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println(name+","+age);
    }
}
public class MethodObject {
    public static void main(String[] args) {
        Object str=new Object("pramod",30);
        str.display();
    }
}
