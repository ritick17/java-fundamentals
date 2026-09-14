public class Student {
    String name;
    int rollno;
    Student(){}
    Student(int rollno){
        this.rollno=rollno;
    }
    public void walk(){
        System.out.println("i can walk");
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
