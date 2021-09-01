package com.example.dimagi.explorations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.noties.markwon.Markwon;
import io.noties.markwon.ext.tables.TablePlugin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String markdown =  "" +
                "| HEADER | HEADER | HEADER |\n" +
                "|:----:|:----:|:----:|\n" +
                "|   测试  |   测试   |   测试   |\n" +
                "|  测试  |   测试   |  测测测12345试测试测试   |\n" +
                "|   测试  |   测试   |   123445   |\n" +
                "|   测试  |   测试   |   (650) 555-1212   |\n" +
                "|   测试  |   测试   |   [link](#)   |\n";

        getMarkWon().setMarkdown((TextView)findViewById(R.id.tv), markdown);
    }

    private Markwon getMarkWon() {
        return Markwon.builder(this)
                .usePlugin(TablePlugin.create(this))
                .build();
    }
}
