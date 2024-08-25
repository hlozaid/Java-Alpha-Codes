public class OOPS{
    public static void main(String args[]){
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(4);
        // System.out.println(p1.getTip());

        Student s1 = new Student();
        // System.out.println(s1.name);

        // Student s2 = new Student("Zaid");
        // Student s3 = new Student(456);
        s1.name = " Zaid";
        s1.roll = 13549;
        s1.password = "sjkgkjfsd";
        s1.marks[0] = 99;
        s1.marks[1] = 98;
        s1.marks[2] = 88;

        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){  //non - parameterized
        marks = new int[3];
        System.out.println("Contructor is called...");
    }

    Student(String name){     //parameterized
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;

    }

    //shallow copy constructor 
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;

    // }
  
    //deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<marks.length; i++){
             this.marks[i] = s1.marks[i]; 
        }
    }

}

 
// class Pen{
//     //prop. + func.   
//     private String color;
//     private int tip;

//     String getColor(){
//         return this.color;
//     }

//     int getTip(){
//         return this.tip;
//     }

//     void setColor(String newColor){
//         this.color = newColor;
//     }

//     void setTip(int tip){
//         this.tip = tip;
//     }
// }