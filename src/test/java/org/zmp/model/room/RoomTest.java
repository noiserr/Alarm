package org.zmp.model.room;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.fest.assertions.api.Assertions.assertThat;

public class RoomTest {

    @Test
    public void should_assert_a_behaviour() {
        // Given
        // Setup the system under test
        Room garage = new GarageRoom(100,100);
        // When
        // Execute the system under test
        garage.addAlarms("fire");
        // Then
        // Assert that the expected change has occurred
        assertThat(garage.roomName).isEqualTo("Garage");
    }
}