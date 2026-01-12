package com.jad;

public class Corge {
    private Foo foo;

    public Corge(Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo newFoo) {
        if (this.foo == newFoo) return;

        Foo oldFoo = this.foo;
        this.foo = null;
        if (oldFoo != null && oldFoo.getCorge() == this) {
            oldFoo.setCorge(null);
        }

        this.foo = newFoo;
        if (newFoo != null && newFoo.getCorge() != this) {
            newFoo.setCorge(this);
        }
    }
}
