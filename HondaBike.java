class HondaBike {

    // static variables
    static boolean isStart;
    static int maxSpeed = 120;
    static int minSpeed = 0;
    static int currentSpeed = 40;

    // static method
    public static boolean startOrStop() {

        System.out.println("startOrStop method started");

        if (isStart == false) {
            isStart = true;
            System.out.println("Honda Bike Started: " + isStart);
        } else {
            isStart = false;
            System.out.println("Honda Bike Stopped: " + isStart);
        }

        System.out.println("startOrStop method ended");

        return isStart;
    }
}