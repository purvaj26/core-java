class InstagramRunner {

    public static void main(String[] args) {

        Instagram purvaj = new Instagram();

        purvaj.login("facebook_user");

        purvaj.login("purvaj123", "pass123");

        purvaj.login("purvaj@gmail.com", "emailpass");

        purvaj.login(8576243210L, "phonepass");

        purvaj.loginWithInstaId("insta_purvaj");

    }
}