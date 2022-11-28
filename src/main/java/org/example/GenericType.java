package org.example;

public class GenericType <T>{
    private T t;


    public T get() {
        return this.t;
    }
public void set(T t1){
        this.t=t;
}
    public static void main(String[] args) {
    GenericType<String>type=new GenericType<>();
    type.set("Pankaj");
    GenericType type1=new GenericType();
    type1.set("Pankaj");
    type1.set(10);

    }
}
