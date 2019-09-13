public class HelloWorld{
    public static void main(String[] args){
        Student I = new Student();
        I.name="Aleksey";
        I.age=18;
        I.course=2;
        I.isAlive=true;
        System.out.println(I);
    }
}
class Student {
    //public Strudent(String n, int a, int c){
      //  name=n; age=a; c=course;
    //}
    public String name;
    public int age;
    public int course;
    public boolean isAlive;

    public String toString(){
        return this.name+" Age: "+this.age+" Course: "+ this.course+" Condition: "+ this.isAlive;
    }
        }