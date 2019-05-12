package com.example.alome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context){
        this.context = context;
    }

    //Array
    public int[] slider_images ={
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground
    };
    public String[] slide_heading = {
            "Gọi video ổn định",
            "Chat nhóm tiện ích",
            "Gửi ảnh nhanh chóng"
    };
    public String[] slide_desc ={
            "Trò chuyện thật đã với chất lượng video ổn định mọi lúc, mọi nơi",
            "Trò chuyện thật đã với chất lượng video ổn định mọi lúc, mọi nơi",
            "Trò chuyện thật đã với chất lượng video ổn định mọi lúc, mọi nơi"

    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView  slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeadingView = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescView =(TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slider_images[position]);
        slideHeadingView.setText(slide_heading[position]);
        slideDescView.setText(slide_desc[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((RelativeLayout) object);
    }


}
