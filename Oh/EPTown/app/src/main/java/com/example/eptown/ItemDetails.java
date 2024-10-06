//상품 상세 화면
package com.example.eptown;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        // 상태바 배경을 하얀색으로 설정
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(Color.WHITE);
        }

        // ItemCostPrice에 취소선 적용
        //유저 추천 상품
        TextView ItemCostPriceTextView = findViewById(R.id.ItemCostPrice);
        ItemCostPriceTextView.setPaintFlags(ItemCostPriceTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);;


    }
}
