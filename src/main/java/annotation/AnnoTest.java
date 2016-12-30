package annotation;


public class AnnoTest {
    @TODO
    public void calculateInterest(float amount) {
        System.out.println();
    }

    @TODO("Figure out the amount of interest per a month")
    public void calculateInterest(float amount, float rate) {
        // Need to finish this method later
    }

    @GroupTODO(
            item="Figure out the amount of interest per months",
            assignedTo="Brett McLaughlin",
            dateAssigned="08/04/2004"
    )
    public  void calculateInterest(float amount, float rate, int month) {
        // Need to finish this method later
    }
}
