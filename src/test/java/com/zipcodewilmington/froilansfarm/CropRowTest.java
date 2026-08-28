package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CropRowTest {

    @Test
    void canAddCrop() {

    // Arrange
    CropRow row = new CropRow();
    Crop corn = new CornStalk();

    // Act
    row.addCrop(corn);

    // Assert
    assertEquals(1, row.getCrops().size());
    
    }

    @Test
    void storesTheCorrectCrop() {

    // Arrange
    CropRow row = new CropRow();
    Crop corn = new CornStalk();

    // Act
    row.addCrop(corn);

    // Assert
    assertEquals(corn, row.getCrops().get(0));

    }
}