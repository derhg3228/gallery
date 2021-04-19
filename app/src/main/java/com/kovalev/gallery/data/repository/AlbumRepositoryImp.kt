package com.kovalev.gallery.data.repository

import com.kovalev.gallery.domain.model.Album
import com.kovalev.gallery.data.source.local.AppDatabase
import com.kovalev.gallery.data.source.remote.RetrofitService
import com.kovalev.gallery.domain.repository.AlbumRepository
import io.reactivex.Single


/**
 * This repository is responsible for
 * fetching data[Album] from server or db
 * */
class AlbumRepositoryImp(
    private val retrofitService: RetrofitService
) :
    AlbumRepository {


    override fun getAlbums(): Single<List<Album>> {
        return retrofitService.getAlbums()
    }


}