package com.example.databaseroom.Entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ArtRoom {
    @PrimaryKey
    @NonNull
    public String idRoom;

    public String name;
    public String description;
    public ArtRoom(){}
    public ArtRoom(@NonNull String idRoom, String name, String description) {
        this.idRoom = idRoom;
        this.name = name;
        this.description = description;
    }

    @NonNull
    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(@NonNull String idRoom) {
        this.idRoom = idRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
