package hou.duogwas.onthigplxa1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import hou.duogwas.onthigplxa1.R;

public class HoTro extends AppCompatActivity {
    ImageButton img_BtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ho_tro);

        img_BtnHome=findViewById(R.id.img_btnHome);
        img_BtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HoTro.this,MainActivity.class));
            }
        });
    }
}