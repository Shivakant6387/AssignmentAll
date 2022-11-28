package org.example;

public class GenericClass {
    private Object t;
    public Object get(){
        return t;
    }
    public  void set(Object t){
        this.t=t;
    }

    public static void main(String[] args) {
    GenericClass type =new GenericClass();
    type.set("Pankaj");
    String str = (String) type.get();
    }
}
