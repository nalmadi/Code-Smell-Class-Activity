public class EmailService{
    public void addUser(String email, String message) {
        if (isEmailAddressValid(email)) {
            String cleanedEmail = sanitizeEmail(email);
            // Register the user with the cleaned email
            System.out.println(message + cleanedEmail);
        } else {
            System.out.println("Invalid email address.");
        }
    }
    protected boolean isEmailAddressValid(String email) {
        // Simple email validation
        return email != null && email.contains("@");
    }

    protected String sanitizeEmail(String email) {
        return email.trim().toLowerCase();
    }
}