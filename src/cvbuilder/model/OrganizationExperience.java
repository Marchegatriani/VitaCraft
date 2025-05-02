package cvbuilder.model;

public class OrganizationExperience {
    private String role;
    private String organization;
    private String startDate;
    private String endDate;
    private String description;

    public OrganizationExperience(String role, String organization, String startDate, String endDate, String description) {
        this.role = role;
        this.organization = organization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }
}
    // Getter dan Setter