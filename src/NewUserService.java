public class NewUserService extends EmailService{

    private String email;
    private EmailService emailService;

    public String getEmail(){
        return this.email;
    }

    public NewUserService(EmailService service){
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
