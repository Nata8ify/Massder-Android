package com.domain.massder.data.model

data class RecommendMassager (
    override val id: Int,
    override val name: String,
    override val rating: Float,
    override val ratingAmount: Int,
    override val operateArea: String,
    override val bio: String,
    override val serviceFee: Double,
    override val isFreeCancel: Boolean
) : Massager(id, name, rating, ratingAmount, operateArea, bio, serviceFee, isFreeCancel)

fun getMockedRecommendMassager() : List<RecommendMassager> = listOf(
    RecommendMassager(101, "เฉิดฉาย สะพายกระเป๋า", 5.0F, 21, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 1580.00, true)
    , RecommendMassager(102, "จันทรา นาปรัง", 4.5F, 456, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 2185.00, true)
    , RecommendMassager(103, "ปารีณา มีอาวุธ", 4.0F, 2121, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 1650.00, true)
)