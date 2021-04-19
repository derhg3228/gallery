package com.kovalev.gallery.domain.repository

import com.kovalev.gallery.domain.model.Album
import io.reactivex.Single

/**
 * To make an interaction between [AlbumRepositoryImp] & [GetAlbumsUseCase]
 * */
interface AlbumRepository {

    fun getAlbums(): Single<List<Album>>
}