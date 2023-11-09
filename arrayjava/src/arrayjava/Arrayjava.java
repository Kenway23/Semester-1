/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjava;

public class Arrayjava {
    public Arrayjava(String name , int age){}
    public static void main(String[] args) {
        
        Person person1 = new Person("Zumbul",30);
        Person person2 = new Person("Alabawi",25);
        
        System.out.println("Person 1 : "+person1.name() + " Age : "+person1.age());
        System.out.println("Person 1 : "+person2.name() + " Age : "+person2.age());
        
        //Perbandingan antara dua objek Record
        if(person1.equals(person2)){
            System.out.println("Person 1 and Person 2 are the same");
        }else{
            System.out.println("Person 1 and Person 2 are Different");
        }
    }
    
}
