package homework.fouth;

public class HomeworkSecondLevel {
    public static void main(String[] args) {
        int airTemperature = 30;
        boolean goodAirTemperature = airTemperature > 28;
        int waterTemperature = 20;
        boolean goodWaterTemperature = waterTemperature > 26;
        System.out.println(goodAirTemperature && goodWaterTemperature);

    }
}
