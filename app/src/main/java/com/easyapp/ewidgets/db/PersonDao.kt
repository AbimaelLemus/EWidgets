package com.easyapp.ewidgets.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PersonDao { //DAO Data Access Object
    //lo de suspend es para que no se ejecuten en el hilo principal

    //forma de acceder a la bd

    @Query("SELECT * FROM PersonEntity")
    suspend fun getAll(): List<PersonEntity>

    @Query("SELECT * FROM PersonEntity WHERE id = :id")
    suspend fun getById(id: Int): PersonEntity

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    //un elemento, como una lista de elementos
    suspend fun insert(people: List<PersonEntity>)

    @Update
    suspend fun update(person: PersonEntity)

    @Delete
    suspend fun delete(person: PersonEntity)
}