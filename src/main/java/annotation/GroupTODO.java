package annotation;

public @interface GroupTODO {
    public enum Severity { CRITICAL, IMPORTANT, TRIVIAL, DOCUMENTATION };
    Severity severity() default Severity.IMPORTANT;
    String item();
    String assignedTo();
    String dateAssigned();
}