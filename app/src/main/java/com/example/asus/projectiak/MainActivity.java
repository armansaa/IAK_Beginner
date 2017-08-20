package com.example.asus.projectiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Toolbar xToolbar;
    ListView xListView;

    String[] BakeryNames = {"Brownies", "Carrot Cake", "Chocolate Chip Cookies", "Mini Cheese Cake", "Muffin",
            "Red Velvet Muffin", "Strawberry Short Cake", "Tiramisu", "Red Velvet","Froyo", "Gingerbread", "Ice Cream Sandwich",
            "Jelly Bean", "Pancake"};
    int[] BakeryPhoto = {R.drawable.brownies,
                        R.drawable.carrot_cake,
                        R.drawable.pic_choco_molten,
                        R.drawable.pict_cheese,
                        R.drawable.muffin,
                        R.drawable.pic_red_velvet,
                        R.drawable.pic_strawberry,
                        R.drawable.tiramisu,
                        R.drawable.pic_red_cake,
                        R.drawable.froyo,
                        R.drawable.gingerbread,
                        R.drawable.ice_cream_sandwich,
                        R.drawable.jelly_bean,
                        R.drawable.pancake};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xToolbar = (Toolbar) findViewById(R.id.toolbar);
        xToolbar.setTitle(getResources().getString(R.string.app_name));
        xListView = (ListView) findViewById(R.id.listview);
        NewClass newClass = new NewClass(MainActivity.this, BakeryNames, BakeryPhoto);
        xListView.setAdapter(newClass);
        xListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent xIntent = new Intent(MainActivity.this, DetailActivity.class);
                xIntent.putExtra("BakeryNames", BakeryNames[i]);
                xIntent.putExtra("BakeryPhoto", BakeryPhoto[i]);
                startActivity(xIntent);
            }
        });
    }
}
