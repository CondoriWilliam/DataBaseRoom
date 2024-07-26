package com.example.databaseroom.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.databaseroom.Entity.ArtRoom;
import com.example.databaseroom.Entity.Usuario;

import java.util.List;

@Dao
public interface DaoArtRoom {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertArtRoom(ArtRoom artRoom);

    @Query("UPDATE artroom SET name = :name, description = :description WHERE idRoom = :id")
    void updateArtRoom(String id, String name, String description);

    @Query("DELETE FROM artroom WHERE idRoom = :id")
    void deleteArtRoom(String id);

    @Query("SELECT * FROM artroom")
    List<ArtRoom> getAllArtRoom();

    @Query("SELECT * FROM artroom WHERE idRoom = :id")
    ArtRoom getArtRoom(String id);
}
