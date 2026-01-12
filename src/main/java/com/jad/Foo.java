package com.jad;
import java.util.List;

public class Foo {

        private Bar bar;
        private List<Baz> bazs = new java.util.ArrayList<>();
        private Qux qux = new Qux();
        private Corge corge;
        private List<Grault> graults = new java.util.ArrayList<>();

        public Foo(Bar bar) {
            this.bar = bar;
        }

        public void addBaz(Baz baz) {
            this.bazs.add(baz);
        }

        public void addGrault() {
            this.graults.add(new Grault(this));
        }

        public Bar getBar() {
            return bar;
        }

        public List<Baz> getBazs() {
            return bazs;
        }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public List<Grault> getGraults() {
        return graults;
    }

    public void setCorge(Corge newCorge) {
        if (this.corge == newCorge) return;

        Corge oldCorge = this.corge;
        this.corge = null;
        if (oldCorge != null && oldCorge.getFoo() == this) {
            oldCorge.setFoo(null);
        }

        this.corge = newCorge;
        if (newCorge != null && newCorge.getFoo() != this) {
            newCorge.setFoo(this);
        }
    }
}
