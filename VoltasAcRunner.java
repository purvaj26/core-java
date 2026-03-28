class VoltasAcRunner {

    public static void main(String[] args) {

        System.out.println("------ First Time Method Call ------");
        boolean acStatus = VoltasAc.onOrOff();
        System.out.println("Main Method AC Status: " + acStatus);

        System.out.println("------ Second Time Method Call ------");
        VoltasAc.onOrOff();

        System.out.println("------ Third Time Method Call ------");
        VoltasAc.onOrOff();

        System.out.println("------ Fourth Time Method Call ------");
        VoltasAc.onOrOff();

        System.out.println("------ Fifth Time Method Call ------");
        VoltasAc.onOrOff();
    }
}