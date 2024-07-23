package lesson3;

import java.util.HashSet;

public class App {
public static void main(String []args){
HashSet<Animal> animals= new HashSet<Animal>();

Animal animal1= new Animal("Dog", 12);
Animal animal2 = new Animal("Cat", 8);
Animal animal3 = new Animal("Bird", 3);
Animal animal4 = new Animal("Dog", 12);
Animal animal5 = new Animal("Kangaroo", 24);

animals.add(animal1);
animals.add(animal2);
animals.add(animal3);
animals.add(animal4);
animals.add(animal5);


int dogCount=0;
for(Animal value:animals ){
    if(value.equals(animal1))
      dogCount++;
    System.out.println(dogCount + " dogs are at the age of 12 ");
    System.out.println(value);
}
}
}
