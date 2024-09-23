public abstract class EmailService{

    private boolean isEmailAddressValid(String email) {
        // Simple email validation
        return email != null && email.contains("@");
    }

    private String sanitizeEmail(String email) {
        return email.trim().toLowerCase();
    }

    public String addEmail(String email){

        if(isEmailAddressValid(email)){
            String cleanedEmail = sanitizeEmail(email);
            return cleanedEmail;
        }else{
            System.out.println("Invalid Email.");

            return "";
        }
    }

    public void RegisterEmailConfirm(String registerType, String email){
        System.out.println(String.format("%s registered with email: %s",registerType, email));
    }
}