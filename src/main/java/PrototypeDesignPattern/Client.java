package PrototypeDesignPattern;

public class Client {

    public static void populateStudentRegistry(StudentPrototypeRegistry studentPrototypeRegistry){

        Student may23student = new Student();

        may23student.setBatch("May 23 Batch");
        may23student.setAvgBatchPSP(95.0);

        studentPrototypeRegistry.
                registerStudent("may23StudentPrototype", may23student);

        IntelligentStudent apr23Student = new IntelligentStudent();

        apr23Student.setBatch("April 23 Batch");
        apr23Student.setAvgBatchPSP(98.0);

        studentPrototypeRegistry.
                registerStudent("apr23StudentPrototype", apr23Student);
    }



    public static void main(String[] args) {

        StudentPrototypeRegistry studentProtoTypeRegistry = new StudentPrototypeRegistry();

        populateStudentRegistry(studentProtoTypeRegistry);

       Student FaiazAhmed = studentProtoTypeRegistry

               .getStudent("may23StudentPrototype")

               .clone();


       FaiazAhmed.setAge(30);

       FaiazAhmed.setPsp(90.0);

       FaiazAhmed.setName("FaiazAhmed");

       Student FaiazAhmedA = studentProtoTypeRegistry

               .getStudent("apr23StudentPrototype")

               .clone();


       FaiazAhmedA.setAge(30);

       FaiazAhmedA.setPsp(92.0);

       FaiazAhmedA.setName("FaiazAhmedA");

       System.out.println("DEBUG");

    }

}
