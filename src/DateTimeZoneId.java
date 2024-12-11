import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class DateTimeZoneId {

    public static List<String> getZones(String country) {
        List<String> zones = new ArrayList<>();

        for (String i : TimeZone.getAvailableIDs()) {
            if (i.startsWith(country)) {
                zones.add(i);
            }
        }
        return zones;

    }

    public static void getZonesId(){
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        String[] cityNames = {"Abu Dhabi","Jakarta", "Dubai", "Sydney", "Dhaka", "NewYork", "Indianapolis", "sao Tome", "Boston"};

        for (String cityName: cityNames) {
            String tzCityname = Normalizer.normalize(cityName, Normalizer.Form.NFKD)
                    .replaceAll("[^\\p{ASCII}-_]","")
                    .replace(' ','_');

            List<String> possibleTimeZones = zoneIds.stream()
                    .filter(zid->zid.endsWith("/"+ tzCityname))
                    .collect(Collectors.toList());
            System.out.format("%-12s %s%n",cityName,possibleTimeZones);
        }

    }
    public static void main(String[] args) {

//        ZoneId z = ZoneId.of("America/New_York");
        ZoneId z = ZoneId.ofOffset("ET", ZoneOffset.UTC);
        ZonedDateTime zt = ZonedDateTime.now(z);
        System.out.println(zt);
        System.out.println("----------------");

        List<String> timeZonesInUS = ZoneId.getAvailableZoneIds()
                .stream()
                .filter(zoneId -> zoneId.startsWith("Switzerland"))
                .collect(Collectors.toList());
        System.out.println(timeZonesInUS);
        System.out.println("************************");

        System.out.println(getZones("HE"));

        System.out.println("$$$$$$$$$$$$$$$$$$$$$");
        getZonesId();

        System.out.println("^^^^^^^^^^^^^^^^^");
        String array = Arrays.stream(("ATAKETE HAILE TEFFERA").split(" "))
        .map(city->city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase()).collect(Collectors.joining(" "));
        System.out.println(array);
    }
}
