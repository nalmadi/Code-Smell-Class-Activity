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


public class AdminService extends EmailService{
    
    private String email;
    private EmailService emailService;


    public String getEmail(){
        return this.email;
    }

    public AdminService(EmailService service){
        this.emailService = service;
    }

    // add Admin; open for modification for adding more admin info
    public void addAdmin(String email){
        String validatedEmail = this.emailService.addEmail(email);
        if (validatedEmail != ""){
            this.email = validatedEmail;
            this.emailService.RegisterEmailConfirm("New Admin ", validatedEmail);
        }
    }

}


public class UserService extends EmailService{

    private String email;
    private EmailService emailService;

    public String getEmail(){
        return this.email;
    }

    public UserService(EmailService service){
        this.emailService = service;
    }

    // add User; open for modification for adding more user info
    public void addUser(String email){
        String validatedEmail = this.emailService.addEmail(email);

        if(validatedEmail != ""){
            this.email = validatedEmail;
            this.emailService.RegisterEmailConfirm("New User ", validatedEmail);
        }
    }

}

