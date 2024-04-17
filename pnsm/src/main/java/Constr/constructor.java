package Constr;

public class constructor {
    String name;
    String Location;
    String Address;
    String Email;
    long number;
    constructor(){
        System.out.println("Default constructor ");
    }
    constructor(String name,String Location, String Address, long number, String Email){

        this.name = name;this.Location = Location;this.Address = Address;this.number = number;this.Email = Email;}
    constructor(constructor Copy ){

        this.name = Copy.name;
        this.Location = Copy.Location;
        this.Address  = Copy.Address;
        this.number = Copy.number;
        this.Email = Copy.Email;

    }
    public static void main(String[] args) {

        constructor obj = new constructor();
        constructor obj1 = new constructor("Subash", "Salem","Thammampatti", 1234567890, "pmsubash14@gmail.com");
        System.out.println("My name is "+obj1.name+"\nI am from "+obj1.Location+"\nAnd My address is "+obj1.Address+"\nThis is my mobile number "+obj1.number+ " \nAnd Also you can mail me on this id "+obj1.Email);

        constructor obj2 = new constructor(obj1);

        System.out.println("My name is "+obj2.name+"\nI am from "+obj2.Location+"\nAnd My address is "+obj2.Address+"\nThis is my mobile number "+obj2.number+ " \nAnd Also you can mail me on this id "+obj2.Email);
        
    }
}