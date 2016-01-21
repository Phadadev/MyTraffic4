package com.pw.paphat.mytraffic4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create ListView
        createListView();

    }   //Main Method

    private void createListView() {
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strTitle = objMyData.title();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this,intIcon,strTitle);
        ListView myListView = (ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);
    }   //Create ListView

    public void clickAboutMe(View view) {

        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("http://www.rcsayoungpilot.com"));
        startActivity(objIntent);
    }   //Click


}   //Main Class
