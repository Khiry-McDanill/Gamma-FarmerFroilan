package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class FieldTest {

    @Test
    public void testAddCropRow() {
        Field field = new Field();
        CornCropRow cropRow = new CornCropRow();
        field.addCropRow(cropRow);
        Assert.assertTrue(field.getCropRows().contains(cropRow));
    }

    @Test
    public void testRemoveCropRow() {
        Field field = new Field();
        CornCropRow cropRow = new CornCropRow();
        field.addCropRow(cropRow);
        field.removeCropRow(cropRow);
        Assert.assertFalse(field.getCropRows().contains(cropRow));
    }

    @Test
    public void testRemoveCropRowDecreasesSize() {
        Field field = new Field();
        CornCropRow cropRow = new CornCropRow();
        field.addCropRow(cropRow);
        field.removeCropRow(cropRow);
        Assert.assertEquals(0, field.getCropRows().size());
    }

    @Test
    public void testFieldCanHoldMultipleDifferentCropRows() {
        Field field = new Field();
        field.addCropRow(new CornCropRow());
        field.addCropRow(new TomatoCropRow());
        field.addCropRow(new KaleCropRow());
        field.addCropRow(new PotatoCropRow());
        field.addCropRow(new CarrotCropRow());
        Assert.assertEquals(5, field.getCropRows().size());
    }

    @Test
    public void testRemoveCropRowNotInFieldDoesNotThrow() {
        Field field = new Field();
        CornCropRow cropRow = new CornCropRow();
        field.removeCropRow(cropRow);
        Assert.assertEquals(0, field.getCropRows().size());
    }

    @Test
    public void testFieldStartsEmpty() {
        Field field = new Field();
        Assert.assertEquals(0, field.getCropRows().size());
    }
}
