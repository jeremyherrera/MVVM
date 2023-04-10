package com.example.mvvm.domain

import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteRepository

class GetQuoteUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
}