public class NewAdminService extends EmailService{
    
    private String email;
    private EmailService emailService;


    public String getEmail(){
        return this.email;
    }

    public NewAdminService(EmailService service){
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
