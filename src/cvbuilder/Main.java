package cvbuilder;

import cvbuilder.model.Achievement;
import cvbuilder.model.Profile;
import cvbuilder.model.Contact;
import cvbuilder.model.Internshipp;
import cvbuilder.model.OrganizationExperience;
import cvbuilder.model.Education;
import util.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CV BUILDER ===");

        // Profil dan Kontak
        String name = InputHelper.getString("Enter your name");
        String title = InputHelper.getString("Enter your title");
        String summary = InputHelper.getString("Enter a short summary");
        Profile profile = new Profile(name, title, summary);

        String email = InputHelper.getString("Enter your email");
        String phone = InputHelper.getString("Enter your phone number");
        String address = InputHelper.getString("Enter your address");
        Contact contact = new Contact(email, phone, address);

        // Pendidikan
        List<Education> educations = new ArrayList<>();
        int eduCount = InputHelper.getInt("How many education entries?");
        for (int i = 0; i < eduCount; i++) {
            System.out.println("Education #" + (i + 1));
            String degree = InputHelper.getString("Degree");
            String institution = InputHelper.getString("Institution");
            String start = InputHelper.getString("Start Year");
            String end = InputHelper.getString("End Year");
            educations.add(new Education(degree, institution, start, end));
        }

        // Prestasi
        List<Achievement> achievements = new ArrayList<>();
        int achCount = InputHelper.getInt("How many achievements?");
        for (int i = 0; i < achCount; i++) {
            System.out.println("Achievement #" + (i + 1));
            String titleAch = InputHelper.getString("Title");
            String desc = InputHelper.getString("Description");
            String year = InputHelper.getString("Year");
            achievements.add(new Achievement(titleAch, desc, year));
        }

        // Pengalaman Organisasi
        List<OrganizationExperience> orgs = new ArrayList<>();
        int orgCount = InputHelper.getInt("How many organizational experiences?");
        for (int i = 0; i < orgCount; i++) {
            System.out.println("Organization #" + (i + 1));
            String role = InputHelper.getString("Role");
            String orgName = InputHelper.getString("Organization Name");
            String start = InputHelper.getString("Start Date");
            String end = InputHelper.getString("End Date");
            String desc = InputHelper.getString("Description");
            orgs.add(new OrganizationExperience(role, orgName, start, end, desc));
        }

        // Internship
        List<Internshipp> internships = new ArrayList<>();
        int intCount = InputHelper.getInt("How many internships?");
        for (int i = 0; i < intCount; i++) {
            System.out.println("Internship #" + (i + 1));
            String company = InputHelper.getString("Company");
            String position = InputHelper.getString("Position");
            String start = InputHelper.getString("Start Date");
            String end = InputHelper.getString("End Date");
            String responsibilities = InputHelper.getString("Responsibilities");
            internships.add(new Internshipp(company, position, start, end, responsibilities));
        }

        // Tampilkan CV
        System.out.println("\n=== YOUR CV ===");
        System.out.println(profile);
        System.out.println("Contact: " + contact);
        System.out.println("\nEducation:");
        for (Education edu : educations) {
            System.out.println("- " + edu);
        }
        System.out.println("\nAchievements:");
        for (Achievement ach : achievements) {
            System.out.println("- " + ach);
        }
        System.out.println("\nOrganizational Experience:");
        for (OrganizationExperience org : orgs) {
            System.out.println("- " + org);
        }
        System.out.println("\nInternships:");
        for (Internshipp internship : internships) {
            System.out.println("- " + internship);
        }
    }
}