class AmazonSmartDoorLockRunner {

    public static void main(String[] args) {

        AmazonSmartDoorLock.lockDoor();

        AmazonSmartDoorLock.getLockDetails(
                "Godrej",
                "PIN + App",
                true,
                48,
                "Silver"
        );

        AmazonSmartDoorLock.getPrice(18999);
    }
}