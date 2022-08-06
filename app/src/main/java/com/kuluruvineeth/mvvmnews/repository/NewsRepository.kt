package com.kuluruvineeth.mvvmnews.repository

import com.kuluruvineeth.mvvmnews.api.RetrofitInstance
import com.kuluruvineeth.mvvmnews.db.ArticleDatabase
import com.kuluruvineeth.mvvmnews.models.Article
import com.kuluruvineeth.mvvmnews.util.Resource

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String,pageNumber:Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}