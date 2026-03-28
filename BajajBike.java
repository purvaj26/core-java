class BajajBike {

    static boolean isStart;
    static int maxSpeed = 110;
    static int minSpeed = 0;
    static int currentSpeed = 35;

    public static boolean startOrStop() {

        System.out.println("startOrStop method started");

        if (isStart == false) {
            isStart = true;
            System.out.println("Bajaj Bike Started: " + isStart);
        } else {
            isStart = false;
            System.out.println("Bajaj Bike Stopped: " + isStart);
        }

        System.out.println("startOrStop method ended");

        return isStart;
    }
}