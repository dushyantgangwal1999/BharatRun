package com.example.core.domain

// Define a sealed interface Result with two possible states: Success and Error
sealed interface Result<out D, out E : Error> {
    // Data class representing a successful result with data of type D
    data class Success<out D>(val data: D) : Result<D, Nothing>

    // Data class representing an error result with error of type E
    data class Error<out E : com.example.core.domain.Error>(val error: E) : Result<Nothing, E>
}

// Inline extension function for Result that transforms the success data using the provided mapping function
inline fun <T, E : Error, R> Result<T, E>.map(map: (T) -> R): Result<R, E> {
    return when (this) {
        // If the Result is an Error, return a new Result.Error with the same error
        is Result.Error -> Result.Error(error)

        // If the Result is a Success, apply the map function to the data and wrap it in a new Result.Success
        is Result.Success -> Result.Success(map(data))
    }
}

// Extension function for Result that transforms the success data to Unit (EmptyDataResult)
fun <T, E : Error> Result<T, E>.asEmptyDataResult(): EmptyDataResult<E> {
    return map { }
}

// Type alias for a Result with Unit as the success data type, used to represent empty data results
typealias EmptyDataResult<E> = Result<Unit, E>