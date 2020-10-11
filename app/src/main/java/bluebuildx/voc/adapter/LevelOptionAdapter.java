package bluebuildx.voc.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.List;

import bluebuildx.voc.R;
import bluebuildx.voc.models.LevelOptionModel;

public class LevelOptionAdapter extends PagerAdapter {

    private List<LevelOptionModel> models;

    public LevelOptionAdapter(List<LevelOptionModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    private LayoutInflater layoutInflater;
    private Context context;


    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.level_option_card, container, false);

        ImageView imageView;
        TextView level, description;

        imageView = view.findViewById(R.id.image_view_card);
        level = view.findViewById(R.id.level_text);
        description = view.findViewById(R.id.description_text);

        Picasso.get()
                .load(models.get(position).getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
        level.setText(models.get(position).getLevel());
        description.setText(models.get(position).getDescription());

        container.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
