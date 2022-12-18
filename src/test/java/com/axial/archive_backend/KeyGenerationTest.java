package com.axial.archive_backend;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * Created on December 2022
 */
@Slf4j
public class KeyGenerationTest {

    @Test
    public void testOfKeyGeneration() {

        final String salt = BCrypt.gensalt();
        final String apiKey = RandomStringUtils.randomAlphanumeric(32);
        System.out.println("APIKEY: " + apiKey);

        final String hashedKey = BCrypt.hashpw(apiKey, salt);
        System.out.println("HASHED KEY: " + hashedKey);
    }

}
