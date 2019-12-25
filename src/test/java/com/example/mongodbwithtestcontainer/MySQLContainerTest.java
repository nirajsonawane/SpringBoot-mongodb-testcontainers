package com.example.mongodbwithtestcontainer;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class MySQLContainerTest {

    @Container
    private final MySQLContainer mySQLContainer = new MySQLContainer();

    @Test
    @DisplayName("Should start the container")
    public void test() {
        Assert.assertTrue(mySQLContainer.isRunning());
    }
}
