package PrototypeDesignPattern;

public class Student implements Prototype <Student>{

    private String name;

    private int age;

    private double psp;

    private String batch;

    private double avgBatchPSP;

    private int counter = 0;

    public Student(){


    }

    public Student(Student student){

        this.name = student.name;

        this.age = student.age;

        this.psp = student.psp;

        this.batch = student.batch;

        this.avgBatchPSP = student.avgBatchPSP;

        this.counter = student.counter;
    }


    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public int getAge(){

        return age;
    }

    public void setPsp(double psp){

        this.psp = psp;

    }
    public double getPsp(){

        return psp;
    }

    public void setBatch(String batch){

        this.batch = batch;

    }

    public String getBatch(){

        return batch;
    }

    public void setAvgBatchPSP(double avgBatchPSP){

        this.avgBatchPSP = avgBatchPSP;
    }

    public double getAvgBatchPSP(){

        return avgBatchPSP;
    }

    @Override
    public Student clone(){

       return new Student(this);

    }
}
