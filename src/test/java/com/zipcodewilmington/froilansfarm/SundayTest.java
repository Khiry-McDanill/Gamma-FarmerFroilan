package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SundayTest {

    @Test
    void farmerCanPlantCrop() {

    // Arrange
    Farmer froilan = new Farmer();
    CropRow row = new CropRow();
    Crop corn = new CornStalk();

    // Act
    froilan.plant(corn, row);

    // Assert
    assertEquals(1, row.getCrops().size());
    assertEquals(corn, row.getCrops().get(0));
    }

    @Test
    void farmerPlantsCropsInThreeRows() {

    // Arrange
    Farmer froilan = new Farmer();

    CropRow row1 = new CropRow();
    CropRow row2 = new CropRow();
    CropRow row3 = new CropRow();

    Crop corn = new CornStalk();
    Crop tomato = new TomatoPlant();
    Crop carrot = new CarrotRoot();

    // Act
    froilan.plant(corn, row1);
    froilan.plant(tomato, row2);
    froilan.plant(carrot, row3);

    // Assert
    assertEquals(1, row1.getCrops().size());
    assertEquals(corn, row1.getCrops().get(0));

    assertEquals(1, row2.getCrops().size());
    assertEquals(tomato, row2.getCrops().get(0));

    assertEquals(1, row3.getCrops().size());
    assertEquals(carrot, row3.getCrops().get(0));
    
    }
}
