package com.example.sakurasky.yedance.Activitys;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sakurasky.yedance.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/**
 *
 * 资讯新闻内容界面
 * @author yusi
 */
public class ContentActivity extends BaseActivity {
    @ViewInject(R.id.headtitle)
    TextView headtitle;
    @ViewInject(R.id.headreturn)
    ImageView headreturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_content);
        ViewUtils.inject(this);
        Intent i =getIntent();
        headtitle.setText(i.getStringExtra("title").toString()!=null?i.getStringExtra("title").toString():"null");
        headreturn.setVisibility(View.VISIBLE);
        headreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
