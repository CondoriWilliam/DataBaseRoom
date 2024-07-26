package com.example.databaseroom.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.databaseroom.Entity.ArtRoom;
import com.example.databaseroom.Entity.Author;
import com.example.databaseroom.Entity.Usuario;

import java.util.List;

@Dao
public interface DaoAuthor {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAuthor(Author... author);

    @Query("UPDATE author SET name = :name, surname = :surname WHERE idAuthor = :id")
    void updateAuthor(String id, String name, String surname);

    @Query("DELETE FROM author WHERE idAuthor = :id")
    void deleteAuthor(String id);

    @Query("SELECT * FROM author")
    List<Author> getAllAuthor();

    @Query("SELECT * FROM author WHERE idAuthor = :id")
    Author getAuthor(String id);
}
