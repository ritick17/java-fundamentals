public class Friends {
    String name;
    int age;
    String profession;
    public void friends(){
        String message="These Friends are my best friends because we know each other since our diploma college and one of then are my school friend";
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
