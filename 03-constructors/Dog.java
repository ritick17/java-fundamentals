public class Dog {
    String name;
    String breed;
    int age;
//    Dog(){}
    Dog(String name,String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
