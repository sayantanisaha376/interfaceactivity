package com.example;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdultUsers implements libraryuser {

    private String name;
    private int age;
    private String bookType;

    @Override
    public void registerAccount() {
        if(age >12){
            System.out.println("Hiiii"+ " "+this.name+" "+"You have successfully registered under a Adult Account");
        }
        else{

            System.out.println("Sorry,"+" "+this.name+" "+" Age must be greater than 12 to register as an Adult");
        }



    }

    @Override
    public void requestBook() {
        if(bookType=="fiction"){
            System.out.println("The Book of booktype"+" "+this.bookType.toUpperCase()+" "+"is Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }


    }
}
