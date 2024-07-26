package com.example.databaseroom.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.databaseroom.Entity.Usuario;

import java.util.List;

@Dao
public interface DaoUsuario  {
    @Query("SELECT *  FROM usuario")
    List<Usuario> obtenerUsuarios();

    @Query("SELECT * FROM usuario WHERE usuario = :user")
    Usuario obtenerUsuario(String user);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertarUsuario(Usuario... usuarios);

    @Query("UPDATE usuario SET nombre = :nombre, correo = :correo WHERE usuario = :user")
    void actualizarUsusario(String user, String nombre, String correo);

    @Query("DELETE FROM usuario WHERE usuario = :user")
    void eliminarUsuario(String user);
}
