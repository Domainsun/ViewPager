package com.example.administrator.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;  //对应的viewPager
    private List<View> viewList;//view 数组
    private MyPagerAdapter ViewAdapter;
    private View v1,v2,v3;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();






    }

    private void event() {

    }

    private void init() {
        viewPager = (ViewPager) findViewById(R.id.ViewPager);

        viewList = new ArrayList<View>();// 将要分页显示的View装入数组中
        LayoutInflater li = getLayoutInflater();
        v1=li.inflate(R.layout.view1,null);
        v2=li.inflate(R.layout.view2,null);

        viewList.add(v1);
        viewList.add(v2);
        ViewAdapter = new MyPagerAdapter((ArrayList<View>) viewList);
        viewPager.setAdapter(ViewAdapter);


        tv1= (TextView) v1.findViewById(R.id.tv);
        tv1.setText("更改后的TextView");

    }
}
