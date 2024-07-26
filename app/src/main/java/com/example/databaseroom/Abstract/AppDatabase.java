package com.example.databaseroom.Abstract;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.databaseroom.Dao.DaoArtRoom;
import com.example.databaseroom.Dao.DaoAuthor;
import com.example.databaseroom.Dao.DaoPicture;
import com.example.databaseroom.Dao.DaoPictureAuthor;
import com.example.databaseroom.Dao.DaoUsuario;
import com.example.databaseroom.Entity.ArtRoom;
import com.example.databaseroom.Entity.Author;
import com.example.databaseroom.Entity.AuthorWithPictures;
import com.example.databaseroom.Entity.Picture;
import com.example.databaseroom.Entity.Usuario;

@Database(
        entities = {Usuario.class, Author.class, Picture.class, ArtRoom.class},
        version  = 9
)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase appDatabase;
    private static String dataBaseName = "dbPruebas";
    public synchronized static AppDatabase getInstance(Context context){
        if (appDatabase == null){
            appDatabase = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, dataBaseName)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return appDatabase;
    }
    public abstract DaoUsuario daoUsuario();
    public abstract DaoArtRoom daoArtRoom();
    public abstract DaoPicture daoPicture();
    public abstract DaoAuthor daoAuthor();
    public abstract DaoPictureAuthor daoPictureAuthor();
}
