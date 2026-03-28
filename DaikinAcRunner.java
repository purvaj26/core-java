class DaikinAcRunner {

    public static void main(String[] args) {

        System.out.println("------ First Time Method Call ------");
        boolean acStatus = DaikinAc.onOrOff();
        System.out.println("Main Method AC Status: " + acStatus);

        System.out.println("------ Second Time Method Call ------");
        DaikinAc.onOrOff();

        System.out.println("------ Third Time Method Call ------");
        DaikinAc.onOrOff();

        System.out.println("------ Fourth Time Method Call ------");
        DaikinAc.onOrOff();

        System.out.println("------ Fifth Time Method Call ------");
        DaikinAc.onOrOff();
    }
}