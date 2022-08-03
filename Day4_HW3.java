package com.company;

public class Day4_HW3 {
    public static void main(String[] args) {
        //HW#1
        int[] numarray={1,8,2,7,5};
        try{
            System.out.println(getSmallest(numarray));
        }catch(Exception E){
            System.out.println("The list doesn't accept negative numbers");
        }
        //HW#2
        try {
            Customer customer1 = new Customer(738563, "Laila Hart", 'f');
            System.out.println(customer1.getGender());
            System.out.println(customer1.getID());
            Customer customer2 = new Customer(848523, "Suhail AlOtaibi", 'm');
            System.out.println(customer2.getName());
            System.out.println(customer2.toString());
            Customer customer3 = new Customer(848523, "Suhail AlOtaibi", 'k');
        }catch(Exception e){
            System.out.println(e);
        }



    }
    public static int getSmallest(int[] arr) throws Exception{
    int smallest= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                throw new Exception();
            }else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
}
