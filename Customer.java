package com.company;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) throws Exception{
        this.ID = ID;
        this.name = name;
        if (gender!='f'&&gender!='m'){
            throw new Exception(name+"'s gender can only be either 'm' or 'f'");
        }
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
    return name+"("+ID+")";}
}
