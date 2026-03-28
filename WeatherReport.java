class WeatherReport {
    public static void main(String[] args) {

        int temperature = 32;
        float humidity = 65.5f;
        long weatherStationId = 4455667788L;
        double windSpeed = 12.75;
        byte uvIndex = 7;
        short rainfall = 120;
        char seasonCode = 'S';
        boolean isRaining = false;
        String city = "Bangalore";

        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Station ID: " + weatherStationId);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("UV Index: " + uvIndex);
        System.out.println("Rainfall: " + rainfall);
        System.out.println("Season: " + seasonCode);
        System.out.println("Raining: " + isRaining);
        System.out.println("City: " + city);
    }
}