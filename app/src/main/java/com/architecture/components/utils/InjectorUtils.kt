package com.architecture.components.utils

import com.architecture.components.data.FakeDatabase
import com.architecture.components.data.QuoteRepository
import com.architecture.components.ui.main.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}