package com.example.databaseroom.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.databaseroom.Entity.Author;
import com.example.databaseroom.Entity.Picture;

import java.util.List;

@Dao
public interface DaoPicture {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPicture(Picture... pictures);

    @Query("UPDATE picture SET  idAuthorPicture= :idAuthorPicture, idRoomPicture = :idRoomPicture, title = :title, technique = :technique, category = :category, description = :description, year = :year, link = :link WHERE idPicture = :idPicture")
    void updatePicture(String idPicture, String idAuthorPicture, String idRoomPicture, String title, String technique, String category, String description, String year, String link);

    @Query("DELETE FROM picture WHERE idPicture = :id")
    void deletePicture(String id);

    @Query("SELECT * FROM picture")
    List<Picture> getAllPicture();

    @Query("SELECT * FROM picture WHERE idPicture = :id")
    Picture getPicture(String id);
}
