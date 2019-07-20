/**
 * A CLI application that returns continent, country, state, latitude and longitude of an IP address.
 *
 * @since 18th July, 2019 by Onikoyi Damola Olutoba.
 */

package com.IPFinder;

import com.maxmind.geoip.Location;

public class Locate {

    private String continent;
    private String countryCode;
    private String countryName;
    private String city;
    private float latitude;
    private float longitude;

    // This constructor initializes the variables
    public Locate(String countryName, String countryCode, String state,
                  float latitude, float longitude) {

        this.countryName = countryName;
        this.countryCode = countryCode;
        this.city = state;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public String getContinent() {
        return continent;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }


    public String getCity() {
        return city;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public static Locate map(Location location) {
        return new Locate(location.countryName, location.countryCode, location.city, location.latitude, location.longitude);
    }

    @Override
    public String toString() {
        return "Locate{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", city='" + city + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
