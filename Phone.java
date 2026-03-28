class Phone {

    // static variables
    static boolean isPowerOn;
    static int batteryLevel = 80;
    static int minBattery = 10;
    static int currentBattery = 50;

    // static method
    public static boolean powerOnOff() {

        System.out.println("powerOnOff method started");

        if (isPowerOn == false) {
            isPowerOn = true;
            System.out.println("Phone is ON: " + isPowerOn);
        }
        else {
            isPowerOn = false;
            System.out.println("Phone is OFF: " + isPowerOn);
        }

        System.out.println("powerOnOff method ended");

        return isPowerOn;
    }
}