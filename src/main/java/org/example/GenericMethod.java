package org.example;

public class GenericMethod {
    public static <T>boolean isEqual(GenericType<T>g1,GenericType<T>g2){
        return g1.get().equals(g2.get());
    }
    public static void main(String[] args) {
    GenericType<String>g1=new GenericType<>();
    g1.set("Pankaj");
    GenericType<String>g2=new GenericType<>();
    g2.set("Pankaj");
    boolean isEqual=GenericMethod.<String>isEqual(g1,g2);
    }
}
