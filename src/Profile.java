public class User {
    private String username;
    private Profile profile;

    public User(String username, Profile profile) {
        this.username = username;
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    // Method that is overly interested in Profile details
    public String getProfileSummary() {
        return "User: " + username + ", Email: " + profile.getEmail() + ", Address: " + profile.getAddress();
    }
}

public class Profile {
    private String email;
    private String address;

    public Profile(String email, String address) {
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
