package com.example.databaseroom.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.databaseroom.Entity.AuthorWithPictures;
import com.example.databaseroom.Entity.PictureDetails;

import java.util.List;

@Dao
public interface DaoPictureAuthor {
    @Transaction
    @Query("SELECT * FROM author")
    List<AuthorWithPictures> getAllAuthorWithPictures();

    @Transaction
    @Query("SELECT p.title, a.name as authorName, a.surname as authorSurname, p.technique, p.category, p.description, p.year, p.link " +
            "FROM picture p " +
            "JOIN author a ON p.idAuthorPicture = a.idAuthor")
    List<PictureDetails> getPictureDetails();
}
