package com.architecture.components.ui.main

import androidx.lifecycle.ViewModel
import com.architecture.components.data.QuoteRepository
import com.architecture.components.data.Quote

class QuotesViewModel(private val quopteRepository: QuoteRepository)
    : ViewModel(){

    fun getQuotes() = quopteRepository.getQuotes()

    fun addQuote(quote: Quote) = quopteRepository.addQuote(quote)
}