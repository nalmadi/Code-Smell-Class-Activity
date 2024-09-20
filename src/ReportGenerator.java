import java.util.List;

public class ReportGenerator {
    // Generates a detailed report
    public void generateReport(List<User> users) {
        // Step 1: Initialize report content
        StringBuilder report = new StringBuilder();
        report.append("User Report\n");
        report.append("------------\n");

        // Step 2: Process each user
        for (User user : users) {
            // Retrieve user data
            String username = user.getUsername();
            String email = user.getEmail();
            String address = user.getAddress();

            // Perform some data processing
            String processedData = processUserData(username, email, address);

            // Format data for report
            String formattedData = formatReportData(username, email, address, processedData);

            // Append formatted data to report
            report.append(formattedData);
            report.append("\n");
        }

        // Step 3: Save the report to a file
        saveReportToFile(report.toString());
    }

    // Processes user data
    private String processUserData(String username, String email, String address) {
        // Data processing logic here
        return "Processed: " + username + ", " + email + ", " + address;
    }

    // Formats report data
    private String formatReportData(String username, String email, String address, String processedData) {
        // Formatting logic here
        return "User: " + username + ", Email: " + email + ", Address: " + address + ", " + processedData;
    }

    // Saves the report to a file
    private void saveReportToFile(String reportContent) {
        // File saving logic here
        System.out.println("Report saved to file:\n" + reportContent);
    }
}

class User {
    private String username;
    private String email;
    private String address;

    public User(String username, String email, String address) {
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
