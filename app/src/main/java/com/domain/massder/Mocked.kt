package com.domain.massder

import com.domain.massder.data.model.LikedMassager
import com.domain.massder.data.model.MassagePlan
import com.domain.massder.data.model.RecommendMassager
import com.domain.massder.data.model.WorkingPlace


fun getMockedRecommendMassager() : List<RecommendMassager> = listOf(
    RecommendMassager(101, "เฉิดฉาย สะพายกระเป๋า", "https://i.pinimg.com/originals/87/70/f4/8770f465c98f90ed126a3fd1fc07bd10.jpg", 5.0F, 21, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 1580.00, true)
    , RecommendMassager(102, "จันทรา นาปรัง", "https://www.amazingcuties.com/wp-content/uploads/2019/03/Top-20-Most-Beautiful-Asian-Women-17.jpg",4.5F, 456, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 2185.00, true)
    , RecommendMassager(103, "ปารีณา มีอาวุธ", "http://c4250591.r91.cf2.rackcdn.com/5211693_0_5a6ac7f452bcc17442b8b9b2ef361397.jpg", 4.0F, 2121, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 1650.00, true)
)


fun getMockedLikedMassager() : List<LikedMassager> = listOf(
    LikedMassager(101, "เฉิดฉาย สะพายกระเป๋า", "https://i.pinimg.com/originals/87/70/f4/8770f465c98f90ed126a3fd1fc07bd10.jpg", 5.0F, 21, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 1580.00, true)
    , LikedMassager(102, "จันทรา นาปรัง", "https://www.amazingcuties.com/wp-content/uploads/2019/03/Top-20-Most-Beautiful-Asian-Women-17.jpg",4.5F, 456, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 2185.00, true)
    , LikedMassager(103, "ปารีณา มีอาวุธ", "http://c4250591.r91.cf2.rackcdn.com/5211693_0_5a6ac7f452bcc17442b8b9b2ef361397.jpg", 4.0F, 2121, "กรุงเทพฯ", "วิกิพีเดียดำเนินการโดยมูลนิธิวิกิมีเดีย องค์กรไม่แสวงผลกำไร ... นอกจากภาษาไทยแล้ว วิกิพีเดียยังมีรุ่นภาษาอื่นอีก 300 ภาษา โดยวิกิพีเดียขนาดใหญ่แสดงรายการด้านล่างนี้.", 1650.00, true)
)

fun getMockedWorkingPlace() : List<WorkingPlace> = listOf(
    WorkingPlace(10, "ออฟฟิศ", "https://techsauce.co/wp-content/uploads/2017/04/Playtorium.jpg")
    , WorkingPlace(11, "บ้าน","http://www.thanasiri.com/wp-content/uploads/2017/07/DSC_0306-500x300.jpg")
    , WorkingPlace(12, "ทำเนียบรัฐบาล","https://upload.wikimedia.org/wikipedia/th/thumb/3/3b/Government_House_of_Thailand.png/300px-Government_House_of_Thailand.png")
)

fun getMockedMassagePlan() : List<MassagePlan> = listOf(
    MassagePlan(111, "นวดแผนไทย", "https://upload.wikimedia.org/wikipedia/commons/0/0c/Thaimassage.jpg", "การนวด เป็นจัดระเบียบร่างกายรูปแบบหนึ่ง เพื่อการบำบัดและทำให้ร่างกายผ่อนคลาย โดยใช้ทักษะทางร่างกายและอุปกรณ์เสริมด้วยการ บีบ จับ คลึง รีดเส้น เหยียบ ยัน กดจุด ดัด หรือกระตุ้นด้วยการสั่น เพื่อกระตุ้นการทำงานของกล้ามเนื้อและต่อมต่าง ๆ ในบริเวณนั้น ๆ ทำงานดีขึ้น"),
    MassagePlan(112, "นวดแผนไทยอีกที", "https://upload.wikimedia.org/wikipedia/commons/0/0c/Thaimassage.jpg", "การนวด เป็นจัดระเบียบร่างกายรูปแบบหนึ่ง เพื่อการบำบัดและทำให้ร่างกายผ่อนคลาย โดยใช้ทักษะทางร่างกายและอุปกรณ์เสริมด้วยการ บีบ จับ คลึง รีดเส้น เหยียบ ยัน กดจุด ดัด หรือกระตุ้นด้วยการสั่น เพื่อกระตุ้นการทำงานของกล้ามเนื้อและต่อมต่าง ๆ ในบริเวณนั้น ๆ ทำงานดีขึ้น")
)