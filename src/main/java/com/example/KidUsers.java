package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor



public  class KidUsers implements libraryuser {
    private String name;
    private int age;
    private String bookType;

    @Override
    public void registerAccount() {
        if(age <12){
            System.out.println("Hiiii"+ " "+this.name+" "+"You have successfully registered under a Kids Account");
        }
        else{

            System.out.println("Sorry,"+" "+this.name+" "+" Age must be less than 12 to register as a kid");
        }

    }


    @Override
    public void requestBook() {
        if(bookType=="kids"){
            System.out.println("The Book of booktype"+" "+this.bookType.toUpperCase()+" "+"is Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }

    }


}
