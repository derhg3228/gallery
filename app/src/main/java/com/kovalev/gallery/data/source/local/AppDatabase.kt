package com.kovalev.gallery.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kovalev.gallery.data.source.local.dao.PhotoDao
import com.kovalev.gallery.domain.model.Photo

/**
 * To manage data items that can be accessed, updated
 * & maintain relationships between them
 *
 * @Created by ZARA
 */
@Database(entities = [Photo::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract val photoDao: PhotoDao

    companion object {
        const val DB_NAME = "ArtGalleryDatabase.db"
    }
}
