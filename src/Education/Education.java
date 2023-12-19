package Education;

interface IEducation {
    public int getAmountOfExtraIQ();
}

public class Education {
    private int IQ;

    public Education(int IQ) {
        this.IQ = IQ;
    }

    public int getAmountOfExtraIQ(int incomingIQ) {
        return this.IQ + incomingIQ;
    }
}
