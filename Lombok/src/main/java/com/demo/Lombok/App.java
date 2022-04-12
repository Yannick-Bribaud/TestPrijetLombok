package com.demo.Lombok;

public class App 
{
    public static void main( String[] args )
    {
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        
        
        //using builder class of Lombok 
        Dog dog3 =  Dog.aDog().setColor("kat").setAge(1).execute();
        
        
        
        // @Accessors chain=true  et fluent= true (without set)
        dog.age(10).name("White").price(12.675);
        dog2.age(10).name("White").price(12.675);
        
//	without @Accessors chain=false fluent = false        
//        dog.setName("milou");
//        dog.setAge(10);
//        dog.setColor("White");
//        dog.setPrice(12.675);
        
        
        if(dog2.equals(dog)){
        	System.out.println("dogs are equals");
        }else {
        	System.out.println("dogs are not equals");
        }
        
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
