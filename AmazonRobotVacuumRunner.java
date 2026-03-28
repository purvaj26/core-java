class AmazonRobotVacuumRunner {

    public static void main(String[] args) {

        AmazonRobotVacuum.cleanFloor();

        AmazonRobotVacuum.getVacuumDetails(
                "iRobot",
                120,
                "Auto",
                true,
                "Black"
        );

        AmazonRobotVacuum.getPrice(24999);
    }
}