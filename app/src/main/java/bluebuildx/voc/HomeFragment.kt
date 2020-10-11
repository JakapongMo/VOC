package bluebuildx.voc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import bluebuildx.voc.adapter.LevelOptionAdapter
import bluebuildx.voc.models.LevelOptionModel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var imageUrl: String =
            "https://image.freepik.com/free-vector/flat-children-s-day-kids-with-games-candies_23-2148324112.jpg"
        var viewPager: ViewPager = view.findViewById(R.id.view_pager)
        var adapter: LevelOptionAdapter

        val models = arrayListOf(
            LevelOptionModel(
                imageUrl, "ง่าย", "ระดับคำศัพย์ไม่ยากมากนัก\n" +
                        "เป็นคำศัพย์พื้นฐานที่ใช้ทั่วๆ ไป"
            ),
            LevelOptionModel(
                imageUrl, "ปานกลาง", "ระดับคำศัพย์ไม่ยากมากนัก\n" +
                        "เป็นคำศัพย์พื้นฐานที่ใช้ทั่วๆ ไป"
            ),
            LevelOptionModel(
                imageUrl, "ยาก", "ระดับคำศัพย์ไม่ยากมากนัก\n" +
                        "เป็นคำศัพย์พื้นฐานที่ใช้ทั่วๆ ไป"
            )
        )

        adapter = LevelOptionAdapter(models, this.context);
        viewPager.setPadding(80, 32, 80, 32);
        viewPager.adapter = adapter
    }
}


