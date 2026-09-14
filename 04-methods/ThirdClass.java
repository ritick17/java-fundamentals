public class ThirdClass {
    int a;
    int b;

    ThirdClass(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void sum() {
        int add = a + b;

        System.out.println("Sum = " + add);
    }

    @Override
    public String toString() {
        return "ThirdClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
