import test.Pen;

public class Student {
    public static void main(String[] args) {
      char ch = 'A'; //65 // ascii value
        int x = ch; // automatic type casting
        System.out.println(x);
        String str = "XYZ";
        System.out.println(str.length());
       Pen p = new Pen(); // object creation
       p.write("Hello World");
    }
}
