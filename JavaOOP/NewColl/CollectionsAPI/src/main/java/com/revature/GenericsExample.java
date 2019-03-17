package com.revature;

class TestGenerics<T, U>{

    T t;
    U u;

    public TestGenerics(T t, U u){

        this.t = t;
        this.u = u;
    }

    public void ReadValues(){
        System.out.println(t + " " + u);
    }

    String compare(T t1, T t2){
        boolean result =  t1.equals(t2);

        if(result)
            return "The objects are equal";
        else
            return "Not equal!";
    }
}

class MainClass{
    public static void main(String[] args) {
        TestGenerics<Integer,String> myGenericObj = new TestGenerics(123, "Hello Generics");
        myGenericObj.ReadValues();

        System.out.println(TestGenerics.compare("1", "4"));
    }
}