package com.example.bookstoremanagementplatform; // Asigurați-vă că pachetul este corect

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = BookstoreManagementPlatformApplication.class)
class BookstoreManagementPlatformApplicationTests {

    @Autowired
    private BookstoreManagementPlatformApplication bookstoreManagementPlatformApplication;

    @Test
    void contextLoads() {
        assertNotNull(bookstoreManagementPlatformApplication);
    }
}
