package com.example.databaseroom.Entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Relation;

import java.util.List;

public class AuthorWithPictures {
    @Embedded
    public Author author;
    @Relation(
            parentColumn = "idAuthor",
            entityColumn = "idAuthorPicture"
    )
    public List<Picture> pictures;
}
