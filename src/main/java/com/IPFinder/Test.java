/**
 * A CLI application that returns continent, country, country code, state, latitude and longitude of an IP address.
 *
 * @since 18th July, 2019 by Onikoyi Damola Olutoba.
 */

package com.IPFinder;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    //Method main begins program execution
    public static void main(String... args) throws UnknownHostException {

        long ipAddress = new BigInteger(InetAddress.getByName("196.27.128.5").getAddress()).longValue();

        System.out.println("IP address: \n" +
                IPv4.getLocation("196.27.128.5"));

        System.out.println();
        System.out.println("Here is the result for the address: \n" +
                IPv4.getLocation(ipAddress));

        System.out.println();
        System.out.println("The InetAddress IP address is: \n" +
                IPv4.getLocation(InetAddress.getByName("196.27.128.5")));

    }
}
