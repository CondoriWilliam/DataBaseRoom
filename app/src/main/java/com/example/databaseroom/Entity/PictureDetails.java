package com.example.databaseroom.Entity;

import androidx.room.ColumnInfo;

public class PictureDetails {
    public String title;
    @ColumnInfo(name = "name")
    public String authorName;
    @ColumnInfo(name = "surname")
    public String authorSurname;
    public String technique;
    public String category;
    public String description;
    public int year;
    public String link;
}
