package com.rajendra.foodapp;

import  android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rajendra.foodapp.adapter.AsiaFoodAdapter;
import com.rajendra.foodapp.adapter.PopularFoodAdapter;
import com.rajendra.foodapp.model.AsiaFood;
import com.rajendra.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class trangchu extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);

        // now here we will add some dummy data to out model class

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Cơm Gà Xé", "30.000 VNĐ", R.drawable.popularfood6));
        popularFoodList.add(new PopularFood("Gà nướng", "35.000 VNĐ", R.drawable.ganuong));
        popularFoodList.add(new PopularFood("Gà rán HTK", "27.000 VNĐ", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Bánh cuốn ", "56.000 VNĐ", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Tôm ran me", "45.000 VNĐ", R.drawable.trm));
        popularFoodList.add(new PopularFood("nghêu xào xả", "21.000 VNĐ", R.drawable.ngao));

        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood(" Pizza Family", "Đà Nẵng", R.drawable.asiafood1, "4.5", "42 Lê Duẩn"));
        asiaFoodList.add(new AsiaFood("Tiệm Ăn chợ Lớn", "Đà Nẵng", R.drawable.com, "4.2", "54 quang trung "));
        asiaFoodList.add(new AsiaFood("OCha House", "Đà Nẵng", R.drawable.ochahuse, "4.5", "104 Nguyễn Văn Linh  "));
        asiaFoodList.add(new AsiaFood("Mỳ Cay Hot Hot", "Hà Nội", R.drawable.micay, "4.2", "5 Trần Hưng Đạo"));
        asiaFoodList.add(new AsiaFood("CF highlind", "TPHCM", R.drawable.cfhinland, "4.5", "96 Hàm Nghi"));
        asiaFoodList.add(new AsiaFood("Trà Sữa GonCha", "Đà Nẵng", R.drawable.gongcha, "4.2", "147 Nguyễn Văn Linh"));

        setAsiaRecycler(asiaFoodList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);

    }



}
