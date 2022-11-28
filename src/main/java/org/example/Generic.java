package org.example;
class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return this.obj;
    }
}
public class Generic {
    public static void main(String[] args) {
    Test<Integer>iobj=new Test<>(20);
    }
}
