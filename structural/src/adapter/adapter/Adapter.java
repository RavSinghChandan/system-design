package adapter.adapter;

import adapter.adaptee.Adaptee;
import adapter.target.Target;

public class Adapter implements Target {

  private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
    adaptee.specificRequest();
    }
}
