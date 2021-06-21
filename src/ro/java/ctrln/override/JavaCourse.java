package ro.java.ctrln.override;

public class JavaCourse extends BittnetCourse{

    @Override
    public String printMessage(String message) {
        return super.printMessage(message);
    }

  // @Override - aici o sa creeze o r=eroare de compilare pt ca doSomethingDifferent() nu exista in clasa parinte
    public void doSomethingDifferent() {

    }
}
