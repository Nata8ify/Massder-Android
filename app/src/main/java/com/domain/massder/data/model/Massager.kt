package com.domain.massder.data.model

abstract class Massager(open val id : Int = -1, open val name : String, open val rating : Float = 0F, open val ratingAmount : Int = 0, open val operateArea : String, open val bio : String, open val serviceFee : Double, open val isFreeCancel : Boolean)

