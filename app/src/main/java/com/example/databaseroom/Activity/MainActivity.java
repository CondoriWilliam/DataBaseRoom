package com.example.databaseroom.Activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import com.example.databaseroom.Abstract.AppDatabase;
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
import com.example.databaseroom.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvUsuario;
    private AppDatabase appDatabase;
    private DaoUsuario daoUsuario;
    private DaoArtRoom daoArtRoom;
    private List<Usuario> listUsers;
    private List<ArtRoom> listArtRoom;
    private List<Author> listAuthor;
    private DaoAuthor daoAuthor;
    private DaoPicture daoPicture;
    private List<Picture> listPictures;
    private DaoPictureAuthor daoPictureAuthor;
    private List<AuthorWithPictures> listAuthorWithPictures;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();

        //insertUser(user1,user2,user3);
        //deleteUser("lobo2");
        //getUser("lobo1");
        //getAllUsers();

//        ArtRoom galeria01 = new ArtRoom("1","Galeria 01", "Cuadros");
//        insertArtRoom(galeria01);

//        Author author1 = new Author("1", "william", "condori anconayra");
//        daoAuthor.insertAuthor(author1);
//        getAllUsers();

        Author author1 = new Author("1", "william", "condori anconayra");
        Picture picture1 = new Picture("1","1","1","Monaliza","Ole","Pintura","Las pintura mas hermosa","2024","Link1");
        Picture picture2 = new Picture("2","1","1","Solar","Ole","Pintura","Las pintura mas hermosa","2024","Link2");
        Picture picture3 = new Picture("3","2","1","Dados","Ole","Pintura","Las pintura mas hermosa","2024","Link3");
        daoAuthor.insertAuthor(author1);
        daoPicture.insertPicture(picture1);
        daoPicture.insertPicture(picture2);
        daoPicture.insertPicture(picture3);
        daoPictureAuthor.getAllAuthorWithPictures();
        getAllUsers();

        Log.d("MainActivity", "tamaño "+picture1.getTitle());
        Log.d("MainActivity", "tamaño "+picture2.getTitle());
        Log.d("MainActivity", "tamaño "+picture3.getTitle());

    }

    private void init() {
        tvUsuario = findViewById(R.id.tvUsuarios);
        context = MainActivity.this;
        appDatabase = AppDatabase.getInstance(context);
        //daoUsuario = appDatabase.daoUsuario();
        //daoArtRoom = appDatabase.daoArtRoom();
        daoPicture = appDatabase.daoPicture();
        daoAuthor = appDatabase.daoAuthor();
        daoPictureAuthor = appDatabase.daoPictureAuthor();
    }

    private void insertUpdateUser(Usuario user) {
        daoUsuario.insertarUsuario(user);
//        Usuario existingUser = daoUsuario.obtenerUsuario(user.getUsuario());
//        if (existingUser == null) {
//            daoUsuario.insertarUsuario(user);
//        }
//        else {
//            daoUsuario.actualizarUsusario(user.getUsuario(), user.getNombre(), user.getCorreo());
//        }
    }

    private void insertArtRoom(ArtRoom artRoom) {
        ArtRoom existingUser = daoArtRoom.getArtRoom(artRoom.getIdRoom());
        if (existingUser == null) {
            daoArtRoom.insertArtRoom(artRoom);
        }
        else {
            daoArtRoom.updateArtRoom(artRoom.getIdRoom(), artRoom.getName(), artRoom.getDescription());
        }
    }

    private void getUser(String id) {
        Usuario user = daoUsuario.obtenerUsuario(id);
        StringBuilder text = new StringBuilder();
        if (user != null) {
            text.append("Usuario ").append(user.getUsuario()).append(", ")
                    .append(user.getNombre()).append(", ")
                    .append(user.getCorreo()).append("\n");
        } else {
            text.append("Usuario no encontrado");
        }
        tvUsuario.setText(text);
    }

    private void getAllUsers() {
//        listUsers = daoUsuario.obtenerUsuarios();
//        StringBuilder text = new StringBuilder();
//        int count = 0;
//        for(Usuario user : listUsers){
//            text.append("Usuario ").append(count++).append(" = ")
//                    .append(user.getUsuario()).append(", ")
//                    .append(user.getNombre()).append(", ")
//                    .append(user.getCorreo()).append("\n");
//        }
//        tvUsuario.setText(text.toString());

//        listArtRoom = daoArtRoom.getAllArtRoom();
//        StringBuilder text = new StringBuilder();
//        int count = 0;
//        for (ArtRoom artRoom : listArtRoom) {
//            text.append("Room ").append(artRoom.getIdRoom()).append(" = ")
//                    .append(artRoom.getName()).append(", ")
//                    .append(artRoom.getDescription()).append("\n");
//        }
//        tvUsuario.setText(text.toString());

//        listAuthor = daoAuthor.getAllAuthor();
//        StringBuilder text = new StringBuilder();
//        for (Author author : listAuthor) {
//            text.append("Author ").append(author.getIdAuthor()).append(" = ")
//                    .append(author.getName()).append(", ")
//                    .append(author.getLastName()).append("\n");
//        }
//        tvUsuario.setText(text.toString());

//        listAuthorWithPictures = daoPictureAuthor.getAllAuthorWithPictures();
//        StringBuilder text = new StringBuilder();
//        for (AuthorWithPictures author : listAuthorWithPictures) {
//            text.append("Author ").append(author.pictures.toString()).append(" = ")
//                    .append(author.author.getIdAuthor())
//                    .append(author.author.getName())
//                    .append(author.author.getSurname()).append("\n");
//        }
//        tvUsuario.setText(text.toString());

        List<AuthorWithPictures> listAuthorWithPictures = daoPictureAuthor.getAllAuthorWithPictures();
        StringBuilder text = new StringBuilder();

        for (AuthorWithPictures authorPictures : listAuthorWithPictures) {
            text.append("Author: ").append(authorPictures.author.getIdAuthor()).append(" = ")
                    .append(authorPictures.author.getName()).append(", ")
                    .append(authorPictures.author.getSurname()).append("\n    ");

            for (Picture picture : authorPictures.pictures) {
                text.append("Picture: ").append(picture.getTitle()).append(", ")
                        .append(picture.getTechnique()).append(", ")
                        .append(picture.getCategory()).append(", ")
                        .append(picture.getDescription()).append(", ")
                        .append(picture.getYear()).append(", ")
                        .append(picture.getLink()).append("\n");
            }
        }
        tvUsuario.setText(text.toString());
    }

    private void deleteUser(String id) {
        daoUsuario.eliminarUsuario(id);
    }
}