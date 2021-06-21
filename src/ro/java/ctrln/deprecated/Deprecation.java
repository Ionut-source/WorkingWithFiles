package ro.java.ctrln.deprecated;

/**
 * @deprecated Aceasta clasa va fi scoasa din uz in urmatoarele versiuni. Ar trebui sa folosesti {#link}
 */
@Deprecated
public class Deprecation {

    /**
     * @deprecated  Ar trebui sa folosesti alta metoda; incearca {@link #doSomethingNew() doSomethingNew}
     */
    @Deprecated
    public void doSomething() {

    }

    /**
     * Aceasta este noua metoda care ar trebui folosita in locul {@link #doSomething() doSomething}
     */
    public void doSomethingNew() {

    }
}
