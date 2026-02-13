package com.example.listycity;

import java.util.Objects;

/**
 * Represents a city in Canada (or elsewhere) using a city name and a province/region name.
 * <p>
 * City objects are comparable by {@link #getCityName()} so they can be sorted alphabetically by city name.
 * </p>
 */
public class City implements Comparable<City> {

    /** The city name (e.g., "Edmonton"). */
    private String city;

    /** The province/region name (e.g., "Alberta"). */
    private String province;

    /**
     * Creates a City object.
     *
     * @param city     The city name
     * @param province The province/region name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     *
     * @return The city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province/region name.
     *
     * @return The province/region name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this City with another City by city name (alphabetical order).
     *
     * @param other The other City to compare to
     * @return A negative value if this city name comes before {@code other}'s city name,
     *         zero if they are equal, or a positive value if it comes after
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Checks whether two City objects are equal.
     * <p>
     * Two cities are considered equal if they have the same city name and the same province/region name.
     * This is important because {@link java.util.List#contains(Object)} and {@link java.util.List#remove(Object)}
     * depend on {@link #equals(Object)}.
     * </p>
     *
     * @param o The object to compare with
     * @return True if {@code o} is a City with the same city and province values; otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return Objects.equals(city, other.city) && Objects.equals(province, other.province);
    }

    /**
     * Returns the hash code of this City.
     * <p>
     * This method is consistent with {@link #equals(Object)}.
     * </p>
     *
     * @return The hash code for this City
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
