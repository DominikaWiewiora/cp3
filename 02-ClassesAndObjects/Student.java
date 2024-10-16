public class Student {
    String name;
    int age;
    String StudentId;
    boolean isIdValid;
    int semester;
    float avgGrade;

    void displayData() {
        System.out.println("Name: "+name);
        System.out.println("Semester number: "+semester);
        System.out.println("Average grade: "+avgGrade);
    }

    void cardValidation() {
        if(isIdValid==true) {
            System.out.println("ID Card is valid");
        }
        else {
            System.out.println("ID Card is not valid ");
        }
    }

    void displayStudentID() {
        System.out.println("Student name: "+name);
        System.out.println("ID number: "+StudentId); 
    }


}