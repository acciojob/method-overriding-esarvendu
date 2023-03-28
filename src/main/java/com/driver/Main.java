package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B(); // create object of class B and assign it to type A

        System.out.println(a.meth()); // call meth from object of class A

        B b = new B();

        System.out.println(b.meth()); // call overridden meth from object of class B
    }
}
  
