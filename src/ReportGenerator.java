import java.util.List;

public class ReportGenerator {
    // Generates a detailed report
    public void generateReport(List<User> users) {
        // Step 1: Create the report content
        String reportContent = createReportContent(users);

        // Step 2: Save the report to a file
        saveReportToFile(reportContent);
    }

    // Creates the report content based on user data
    private String createReportContent(List<User> users) {
        StringBuilder report = new StringBuilder();
        report.append("User Report\n");
        report.append("------------\n");

        // Step 2: Process and format each user's data
        for (User user : users) {
            String formattedData = formatUserData(user);
            report.append(formattedData);
            report.append("\n");
        }

        return report.toString();
    }

    // Formats a single user's data for the report
    private String formatUserData(User user) {
        // Retrieve user data
        String username = user.getUsername();
        String email = user.getEmail();
        String address = user.getAddress();

        // Process user data
        String processedData = processUserData(username, email, address);

        // Format the data for the report
        return formatReportData(username, email, address, processedData);
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

// User class to represent user data
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
