class Instagram {

    // 1. Login using Facebook
    public void login(String facebookId) {
        System.out.println("Invoking login using Facebook Id: " + facebookId);
    }

    // 2. Login using Username + Password
    public void login(String userName, String psw) {
        System.out.println("Invoking login using Username: " + userName + " and Password: " + psw);
    }

    // 3. Login using Email + Password (different method name to avoid error)
    public void loginWithEmail(String email, String psw) {
        System.out.println("Invoking login using Email: " + email + " and Password: " + psw);
    }

    // 4. Login using Phone Number + Password
    public void login(long phoneNumber, String psw) {
        System.out.println("Invoking login using Phone Number: " + phoneNumber + " and Password: " + psw);
    }

    // 5. Login using Instagram ID
    public void loginWithInstaId(String instaId) {
        System.out.println("Invoking login using Instagram ID: " + instaId);
    }
}