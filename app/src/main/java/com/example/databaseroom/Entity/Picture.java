package com.example.databaseroom.Entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity
public class Picture {
    @PrimaryKey
    @NonNull
    public String idPicture;
    public String idAuthorPicture;
    public String idRoomPicture;
    public String title;
    public String technique;
    public String category;
    public String description;
    public String year;
    public String link;
    public Picture() {
    }

    public Picture(@NonNull String idPicture, String idAuthorPicture, String idRoomPicture, String title, String technique, String category, String description, String year, String link) {
        this.idPicture = idPicture;
        this.idAuthorPicture = idAuthorPicture;
        this.idRoomPicture = idRoomPicture;
        this.title = title;
        this.technique = technique;
        this.category = category;
        this.description = description;
        this.year = year;
        this.link = link;
    }
    @NonNull
    public String getIdPicture() {
        return idPicture;
    }

    public void setIdPicture(@NonNull String idPicture) {
        this.idPicture = idPicture;
    }

    public String getIdAuthorPicture() {
        return idAuthorPicture;
    }

    public void setIdAuthorPicture(String idAuthorPicture) {
        this.idAuthorPicture = idAuthorPicture;
    }

    public String getIdRoomPicture() {
        return idRoomPicture;
    }

    public void setIdRoomPicture(String idRoomPicture) {
        this.idRoomPicture = idRoomPicture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
