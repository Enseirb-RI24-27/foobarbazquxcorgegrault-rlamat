import java.lang.reflect.Array;
package com.jad;

public class Foo {
    private Bar bar;
    private Array<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private Array<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public addGrault(Grault grault) {
        this.graults.add(grault);
    }

    public Bar getBar() {
        return bar;
    }

    public Array<Baz> getBazs() {
        return bazs;
    }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public Array<Grault> getGraults() {
        return graults;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }
}
