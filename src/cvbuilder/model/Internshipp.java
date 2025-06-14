package model;

public class Internshipp extends CVEntry {
    private String company;
    private String position;
    private String responsibilities;

    public Internshipp(String company, String position, String start, String end, String responsibilities) {
        super(start, end);
        this.company = company;
        this.position = position;
        this.responsibilities = responsibilities;
    }

    @Override
    public String formatForDisplay() {
        return position + " at " + company + " (" + getStart() + " - " + getEnd() + "): " + responsibilities;
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}
