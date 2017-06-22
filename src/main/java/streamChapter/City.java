package streamChapter;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Created by Mike on 2017-06-07.
 */
public class City {
    private String name;
    private String state;
    private String secondaryLang;
    private long population;
    private int areaSqKm;
    private boolean isStateCapital;

    public City(String name, String state, String secondaryLang, long population,
                int areaSqKm, boolean isStateCapital) {
        this.name = name;
        this.state = state;
        this.secondaryLang = secondaryLang;
        this.population = population;
        this.areaSqKm = areaSqKm;
        this.isStateCapital = isStateCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSecondaryLang() {
        return secondaryLang;
    }

    public void setSecondaryLang(String secondaryLang) {
        this.secondaryLang = secondaryLang;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getAreaSqKm() {
        return areaSqKm;
    }

    public void setAreaSqKm(int areaSqKm) {
        this.areaSqKm = areaSqKm;
    }

    public boolean isStateCapital() {
        return isStateCapital;
    }

    public void setStateCapital(boolean stateCapital) {
        isStateCapital = stateCapital;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", secondaryLang='" + secondaryLang + '\'' +
                ", population=" + population +
                ", areaSqKm=" + areaSqKm +
                ", isStateCapital=" + isStateCapital +
                '}';
    }

    public static void main(String[] args) {

        Map<String,Set<String>> statesWithLangs = getStreamWithCities().collect(
                groupingBy(City::getState,mapping(City::getSecondaryLang,toSet())));
        statesWithLangs.forEach((k,v)-> System.out.println(k+"\n"+v));
        System.out.println();

        Map<String,Long> statesWithCities = getStreamWithCities().collect(
                groupingBy(City::getState,counting()));
        statesWithCities.forEach((k,v)-> System.out.println(k+"\n"+v));
        System.out.println();

        Map<String,Long> stateWithSummedPopulation= getStreamWithCities().collect(
                groupingBy(City::getState,summingLong(City::getPopulation)));
        stateWithSummedPopulation.forEach((k,v)-> System.out.println(k+"\n"+v));
        System.out.println();

        Map<String,Optional<Long>> stateWithMostPopulation= getStreamWithCities().collect(
                groupingBy(City::getState,mapping(City::getPopulation,maxBy(Long::compare))));
        stateWithMostPopulation.forEach((k,v)-> System.out.println(k+"\n"+v));
        System.out.println();

        Map<String,Integer> stateWithBiggestCityArea= getStreamWithCities().collect(
                groupingBy(City::getState,
                        mapping(City::getAreaSqKm,
                                collectingAndThen(maxBy(Integer::compare),Optional::get))));
        stateWithBiggestCityArea.forEach((k,v)-> System.out.println(k+"\n"+v));
        System.out.println();
    }

    public static Stream<City> getStreamWithCities(){

        return Stream.of(
                new City("New York","New York",
                "De",8_500_000,783,true),
                new City("Los Angeles","California",
                "Fr",3_900_000,1_200,false),
                new City("Chicago","Illinois",
                "De",2_700_000,596,false),
                new City("Huston","Texas",
                        "Fr",1_500_000,1_596,true),
                new City("San Antonio","Texas",
                        "De",1_400_000,1_193,false),
                new City("Dallas","Texas",
                "Fr",1_300_000,881,false),
                new City("San Francisco","California",
                        "Fr",870_000,121,false));
    }

}
