class PhoneRunner {

    public static void main(String[] args) {

        System.out.println("----- First Time Method Call -----");
        boolean phoneStatus = Phone.powerOnOff();
        System.out.println("Main Method Phone Status: " + phoneStatus);

        System.out.println("----- Second Time Method Call -----");
        Phone.powerOnOff();

        System.out.println("----- Third Time Method Call -----");
        Phone.powerOnOff();

        System.out.println("----- Fourth Time Method Call -----");
        Phone.powerOnOff();

        System.out.println("----- Fifth Time Method Call -----");
        Phone.powerOnOff();
    }
}