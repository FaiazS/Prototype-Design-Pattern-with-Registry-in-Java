package PrototypeDesignPattern;

public class IntelligentStudent extends Student{

    private int IQ;

    public IntelligentStudent(){


    }

    public IntelligentStudent(IntelligentStudent intelligentStudent){

        super(intelligentStudent);
        this.IQ = intelligentStudent.IQ;
    }

    public void setIQ(int IQ) {

        this.IQ = IQ;
    }

    public int getIQ() {

        return IQ;
    }


    @Override

    public IntelligentStudent clone(){

        return new IntelligentStudent(this);
    }
}
