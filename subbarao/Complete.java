Single Inheritance :

class Animal{  
void eat()
{
System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark()
{
System.out.println("barking...");}  
}  
class Inheritance
{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}
}


Multilevel Inheritance :

class Animal
{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal
{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog
{  
void weep(){System.out.println("weeping...");}  
}  
class Inheritance2
{  
public static void main(String args[])
{  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}
}



Hierarchical Inheritance :

class Animal{  
void eat()
{
System.out.println("eating...");
}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");
}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");
}  
}  
class Inheritance3{  
public static void main(String args[])
{  
Cat c=new Cat();  
c.meow();  
c.eat();   
}
} 