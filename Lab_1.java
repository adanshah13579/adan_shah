/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

/**
 *
 * @author fa20-bse-036
 */
abstract class animal {

    abstract void move();
    abstract void eat();
    
    void lable(){
    
        System.out.println("animals date");
    }
}
class bird extends animal{

void move(){

    System.out.println("moves by flying:");
}
void eat(){

    System.out.println("eat food:");
}
} 
class  fish  extends animal {
void  move()  {
System.out.println("Moves by swimming.");
}
void  eat()  {
System.out.println("Eats seafood.");
}
}

class testbird{
    public static void main(String[] args) {
        // TODO code application logic here
     
    animal mybird = new bird();
    mybird.lable();
    mybird.move();
    mybird.eat();
    
    animal myfish = new fish();
    myfish.move();
    myfish.eat();
        
    }
}

