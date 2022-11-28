package org.example;

public class GenericMathod2 {
    public static <T>void printGenericArray(T[]items){
        for (T item:items){
            System.out.print(item+"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[]int_Array={1,2,3,4,5,6,7,8,9};
        Character[] characters={'P','a','n','k','a','j'};
        System.out.println( "Integer Array contents:");
        printGenericArray(int_Array);
        System.out.println("Character Array contents");
        printGenericArray(characters);
    }
}
