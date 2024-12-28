package adapter.chandan;

// Adapter : Implements are target by taking Chandan old behaviour and add new on the top of it.
class ChandanAdapter implements Target {
    private Chandan chandan;

    public ChandanAdapter(Chandan chandan) {
        this.chandan = chandan;
    }

    @Override
    public void workInNewEnvironment() {
        System.out.println("Adapting Chandan's workflow to the new environment.");
        chandan.workInOldEnvironment();
    }
}

