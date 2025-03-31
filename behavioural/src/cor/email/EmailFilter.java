package cor.email;

public abstract class EmailFilter {
    protected EmailFilter nextFilter;

    public void setNextFilter(EmailFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public void filter(Email email) {
        if (nextFilter != null) {
            nextFilter.filter(email);
        }
    }
}
