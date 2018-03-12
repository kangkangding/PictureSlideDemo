package com.example.mama.pictureslidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> listPicture=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        listPicture.add("http://wemex.forxc.cn/upload/20180304/e686002292e6df428b05f45d97dfbb51.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180308/d0ae362d628575edae8154d1114328ae.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180308/ee5090028823961989d869e991023d10.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180308/9762fe338921ca10d6ac765c043ea7bd.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180308/9762fe338921ca10d6ac765c043ea7bd.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180312/ff45ffc98ec5688c7afa287ae3254e7b.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180306/e8a6b7d8d2b83d149f98089a29ac9435.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180304/e686002292e6df428b05f45d97dfbb51.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180308/2c8ad762b18e542e9b558abc494d3fac.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180312/ff45ffc98ec5688c7afa287ae3254e7b.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180306/e8a6b7d8d2b83d149f98089a29ac9435.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180308/d10ba879b50659c8bcd7311a6b89ada0.jpg");
        listPicture.add("http://wemex.forxc.cn/upload/20180308/4e5bdff4b7f1d6ece02ae8f645c3318e.jpg");

        Banner banner = (Banner) findViewById(R.id.banner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.NOT_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(listPicture);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
//        banner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(100000);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}
