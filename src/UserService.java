public class UserService extends Email{
    public void registerUser(String email) {
        if (checkEmail(email)) {
            String cleanedEmail = sanitizeEmail(email);
            // Register the user with the cleaned email
            System.out.println("User registered with email: " + cleanedEmail);
        } else {
            System.out.println("Invalid email address.");
        }
    }
   
    // private String normalizeEmail(String email) {
    //     return email.trim().toLowerCase();
    // }
}

public class AdminService extends Email{
    public void addAdmin(String email) {
        if (checkEmail(email)) {
            String normalizedEmail = normalizeEmail(email);
            // Add the admin with the normalized email
            System.out.println("Admin added with email: " + normalizedEmail);
        } else {
            System.out.println("Invalid email address.");
        }
    }

    private String normalizeEmail(String email) {
        return email.trim().toLowerCase();
    }
}

public class Email {
    public boolean checkEmail(String email) {
        return email != null && email.contains("@");
    }
    
    // private String normalizeEmail(String email) {
    //     return email.trim().toLowerCase();
    // }
}

// private boolean isEmailAddressValid(String email) {
    //     // Simple email validation
    //     return email != null && email.contains("@");
    // 
// private boolean checkAdminEmail(String email) {
    //     // Simple email validation
    //     return email != null && email.contains("@");
    // }