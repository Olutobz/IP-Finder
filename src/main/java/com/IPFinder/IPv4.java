/**
 * A CLI application that returns continent, country, state, latitude and longitude of an IP address.
 *
 * @since 18th July, 2019 by Onikoyi Damola Olutoba.
 */

package com.IPFinder;

import com.maxmind.geoip.LookupService;

import java.io.IOException;
import java.net.InetAddress;


/* This class use the GeoIP2/GeoLiteCity Java API to fetch location data for a given IP address from the database.*/
public class IPv4 {

    private static LookupService lookUp;

    static {
        try {
            lookUp = new LookupService(
                    IPv4.class.getResource("/GeoLiteCity.dat").getFile(),
                    LookupService.GEOIP_MEMORY_CACHE);

            System.out.println("GeoIP Database loaded: " + lookUp.getDatabaseInfo());
        } catch (IOException e) {
            System.out.println("Could not load geo ip database: " + e.getMessage());
        }
    }

    public static Locate getLocation(String ipAddress) {
        return Locate.map(lookUp.getLocation(ipAddress));
    }

    public static Locate getLocation(long ipAddress) {
        return Locate.map(lookUp.getLocation(ipAddress));
    }

    public static Locate getLocation(InetAddress ipAddress) {
        return Locate.map(lookUp.getLocation(ipAddress));
    }
}
