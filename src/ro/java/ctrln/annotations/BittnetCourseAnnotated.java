package ro.java.ctrln.annotations;

public class BittnetCourseAnnotated {

    @BittnetAnnotation(location = "Bucuresti", courses = 10, category = "Programare")
    public static void main(String[] args) {
        System.out.println("Aceasta este o clasa adnotata!");
    }
}
