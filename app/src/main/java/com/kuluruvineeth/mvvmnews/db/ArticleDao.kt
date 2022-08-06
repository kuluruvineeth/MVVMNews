package com.kuluruvineeth.mvvmnews.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.kuluruvineeth.mvvmnews.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Query("SELECT * from articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}