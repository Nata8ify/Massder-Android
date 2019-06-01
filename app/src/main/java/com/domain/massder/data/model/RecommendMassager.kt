package com.domain.massder.data.model

data class RecommendMassager (
    override val id: Int,
    override val name: String,
    override val imageUrl: String,
    override val rating: Float,
    override val ratingAmount: Int,
    override val operateArea: String,
    override val bio: String,
    override val serviceFee: Double,
    override val isFreeCancel: Boolean
) : Massager(id, name, imageUrl, rating, ratingAmount, operateArea, bio, serviceFee, isFreeCancel)
