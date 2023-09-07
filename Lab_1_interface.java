/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_interface;

/**
 *
 * @author fa20-bse-036
 */
interface animal{
            
public void eat();
public void sound();

        }
interface bird{
            
int numberofwings=2;
String type="wildanimal";
public void fly();

        }
class eagle implements animal,bird{
    
    public  void  eat()  {
System.out.println("Eats reptiles ");
}
public  void  sound()  {
System.out.println("Has a high-pitched whistling sound.");
}
public  void  fly()  {
System.out.println("Flies up to 10,000 feet.");




}
}
class testeagle{
    public static void main(String[] args) {
        // TODO code application logic here
    eagle e =new eagle();

e.eat();
e.fly();
e.sound();

System.out.println("no_of_wings:"+bird.numberofwings);
System.out.println("bird_type:"+bird.type);    
    }
    
}
