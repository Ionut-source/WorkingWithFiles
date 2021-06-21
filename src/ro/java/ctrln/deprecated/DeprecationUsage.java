package ro.java.ctrln.deprecated;

public class DeprecationUsage {
    @SuppressWarnings({"deprecation","unchecked"})
    public static void main(String[] args) {

        Deprecation deprecation = new Deprecation();
        deprecation.doSomethingNew();
    }
}
