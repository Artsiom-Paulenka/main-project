package homework.third;

public class Third {
    public static void main(String[] args) {
        //First level: Феликс прожил 3 011 456 567 секунд. Сколько лет прожил Феликс? Посчитать, используя Java,
        // Long-переменные и деление.
        //Кто не знает - по какой формуле посчитать - напишите мне, но сначала подумайте
        long felixLiveInSecond = 3_011_456_567L;
        int DaysAYear = 365;
        int HoursADay = 24;
        int MinutesAHours = 60;
        int SecondsAMinutes = 60;
        int secondsAYear = DaysAYear * HoursADay * MinutesAHours * SecondsAMinutes; // 365*24*60*60
        System.out.println(felixLiveInSecond / secondsAYear);

        //Second level: Астерикс и Обеликс варили зелье
        boolean cookAst = false;
        int time = 9;
        boolean durationOfCook = (time > 5);
        System.out.println(cookAst || durationOfCook);


    }
}
