package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final List<CropRow> rows = new ArrayList<>();

    public void addRow(CropRow row) {
        rows.add(row);
    }

    public List<CropRow> getRows() {
        return rows;
    }
}
