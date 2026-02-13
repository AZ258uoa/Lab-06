package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Keeps a list of {@link City} objects and provides basic operations to manage the list.
 */
public class CityList {

    /** The internal list that stores the City objects. */
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if the city does not already exist.
     *
     * @param city A candidate city to add
     * @throws IllegalArgumentException If the city is already in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks whether the given city is in the list.
     *
     * @param city The city to check
     * @return True if the city belongs in the list; otherwise false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list.
     * <p>
     * If the city exists, it is removed. If the city does not exist, an exception is thrown.
     * </p>
     *
     * @param city The city to remove
     * @throws IllegalArgumentException If the city is not present in the list
     */
    public void delete(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Counts how many cities are currently in the list.
     *
     * @return The number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns a sorted list of cities.
     * <p>
     * The sorting order is determined by {@link City#compareTo(City)}.
     * </p>
     *
     * @return The sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
