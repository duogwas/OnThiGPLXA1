package hou.duogwas.onthigplxa1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import hou.duogwas.onthigplxa1.R;

public class ThongTinUngDung extends AppCompatActivity {
    ImageButton img_BtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_ung_dung);

        img_BtnHome=findViewById(R.id.img_btnHome);
        img_BtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThongTinUngDung.this,MainActivity.class));
            }
        });
    }
}