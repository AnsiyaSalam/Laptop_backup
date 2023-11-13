package Country;

import java.util.*;
import java.util.stream.Stream;

public class Country {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("United States", "United Arab Emirates", "China", "India", "Australia");

        // Find the country with the longest name
        String longestCountryName = countries.stream()
                .reduce((country1, country2) ->
                        country1.length() > country2.length() ? country1 : country2)
                .orElse(null);

        System.out.println("Country with the longest name: " + longestCountryName);
    }
}






