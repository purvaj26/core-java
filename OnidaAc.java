class OnidaAc {

    static boolean isSwitch;

    public static boolean onOrOff() {

        System.out.println("onOrOff method started");

        if (isSwitch == false) {
            isSwitch = true;
            System.out.println("AC is ON: " + isSwitch);
        } else {
            isSwitch = false;
            System.out.println("AC is OFF: " + isSwitch);
        }

        System.out.println("onOrOff method ended");

        return isSwitch;
    }

    public static void main(String[] args) {

        System.out.println("------ First Time Method Call ------");
        boolean status = onOrOff();
        System.out.println("Main Method AC Status: " + status);

        System.out.println("------ Second Time Method Call ------");
        onOrOff();

        System.out.println("------ Third Time Method Call ------");
        onOrOff();

        System.out.println("------ Fourth Time Method Call ------");
        onOrOff();

        System.out.println("------ Fifth Time Method Call ------");
        onOrOff();
    }
}