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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var homeView: View = inflater.inflate(R.layout.fragment_home, container, false)

        var imageUrl: String =
            "https://image.freepik.com/free-vector/flat-children-s-day-kids-with-games-candies_23-2148324112.jpg"
        var viewPager: ViewPager = homeView.findViewById(R.id.view_pager)
        var adapter: LevelOptionAdapter

        var models = ArrayList<LevelOptionModel>();
        models.add(
            LevelOptionModel(
                imageUrl, "ยาก", "ระดับคำศัพย์ไม่ยากมากนัก\n" +
                        "เป็นคำศัพย์พื้นฐานที่ใช้ทั่วๆ ไป"
            )
        )
        models.add(
            LevelOptionModel(
                imageUrl, "ปานกลาง", "ระดับคำศัพย์ไม่ยากมากนัก\n" +
                        "เป็นคำศัพย์พื้นฐานที่ใช้ทั่วๆ ไป"
            )
        )
        models.add(
            LevelOptionModel(
                imageUrl, "ง่าย", "ระดับคำศัพย์ไม่ยากมากนัก\n" +
                        "เป็นคำศัพย์พื้นฐานที่ใช้ทั่วๆ ไป"
            )
        )
        adapter = LevelOptionAdapter(models, this.context);

        viewPager.setPadding(80,32,80,32);
        viewPager.adapter = adapter

        return homeView
    }
}


