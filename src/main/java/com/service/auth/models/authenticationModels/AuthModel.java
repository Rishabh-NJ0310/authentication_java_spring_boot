package com.service.auth.models.authenticationModels;

import lombok.Data;



@Data
public class AuthModel {
    private String hospitalId;
    private String passkey;
    private String phoneNumber; // search Index
    private String password;
    private UserRole role;
    private String refreshToken;
    private Token token;
}





/*
    There is an specific way to get the iso format string in java example code is in below

    import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ISODateExample {

    public static void main(String[] args) {
        // 1. Get the current moment in UTC (ISO_INSTANT format)
        String isoInstant = Instant.now().toString();
        System.out.println("ISO Instant (UTC): " + isoInstant);

        // 2. Get the current date and time in a specific time zone
        // For example, in the system's default time zone
        ZonedDateTime nowInDefaultZone = ZonedDateTime.now();
        String isoDateTimeDefaultZone = nowInDefaultZone.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println("ISO Date-Time (Default Zone): " + isoDateTimeDefaultZone);

        // Or in a specific time zone, e.g., "America/New_York"
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime nowInNewYork = ZonedDateTime.now(newYorkZone);
        String isoDateTimeNewYork = nowInNewYork.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println("ISO Date-Time (New York Zone): " + isoDateTimeNewYork);

        // 3. Custom ISO 8601 format (e.g., without milliseconds)
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        String customISO = ZonedDateTime.now().format(customFormatter);
        System.out.println("Custom ISO Date-Time: " + customISO);
    }
}


* */