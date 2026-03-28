class SanyoAcRunner {

    public static void main(String[] args) {

        System.out.println("------ First Time Method Call ------");
        boolean acStatus = SanyoAc.onOrOff();
        System.out.println("Main Method AC Status: " + acStatus);

        System.out.println("------ Second Time Method Call ------");
        SanyoAc.onOrOff();

        System.out.println("------ Third Time Method Call ------");
        SanyoAc.onOrOff();

        System.out.println("------ Fourth Time Method Call ------");
        SanyoAc.onOrOff();

        System.out.println("------ Fifth Time Method Call ------");
        SanyoAc.onOrOff();
    }
}