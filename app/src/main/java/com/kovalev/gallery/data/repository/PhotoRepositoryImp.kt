package com.kovalev.gallery.data.repository

import com.kovalev.gallery.data.source.local.AppDatabase
import com.kovalev.gallery.data.source.remote.RetrofitService
import com.kovalev.gallery.domain.model.Photo
import com.kovalev.gallery.domain.repository.PhotoRepository
import io.reactivex.Single

/**
 * This repository is responsible for
 * fetching data [photo] from server or db
 * */
class PhotoRepositoryImp(
    private val database: AppDatabase,
    private val retrofitService: RetrofitService
) : PhotoRepository {

    override fun isFavorite(photoId: Long): Boolean {
        val loadOneByPhotoId = database.photoDao.loadOneByPhotoId(photoId)
        return loadOneByPhotoId != null
    }

    override fun deletePhoto(photo: Photo) {
        database.photoDao.delete(photo)
    }

    override fun addPhoto(photo: Photo) {
        database.photoDao.insert(photo)
    }


    override fun getPhotoDetail(photoId: Long?): Single<Photo> {
        return retrofitService.getPhotoDetail(photoId!!)
    }

    override fun getPhotos(albumId: Long?): Single<List<Photo>> {
        return retrofitService.getPhotos(albumId!!)
    }

}