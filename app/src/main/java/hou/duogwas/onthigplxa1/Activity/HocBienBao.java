package hou.duogwas.onthigplxa1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import hou.duogwas.onthigplxa1.Adapter.ListBienBaoAdapter;
import hou.duogwas.onthigplxa1.Class.BienBao;
import hou.duogwas.onthigplxa1.R;

public class HocBienBao extends AppCompatActivity {
    ListView lv_hocbienbao;
    ImageButton img_BtnHome;
    ArrayList<BienBao> bienbao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_bien_bao);
        AnhXa();

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new docJson().execute("https://duogwas.github.io/bienbaocam.json");
            }
        });


        img_BtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HocBienBao.this, MainActivity.class));
            }
        });
    }

    private void AnhXa() {
        bienbao = new ArrayList<BienBao>();
        lv_hocbienbao = findViewById(R.id.lv_bienbao);
        img_BtnHome = findViewById(R.id.img_btnHome);
    }

    class docJson extends AsyncTask<String, Integer, String> {

        @Override
        protected String doInBackground(String... params) {
            return docnoidungtuUrl(params[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            try {
                JSONArray jsonArray = new JSONArray(s);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject bien = jsonArray.getJSONObject(i);
                    bienbao.add(new BienBao(bien.getString("TenBien"), bien.getString("Hinh")
                    ));
                }
                ListBienBaoAdapter listBienBaoAdapter = new ListBienBaoAdapter(getApplicationContext(), R.layout.custom_lv_bienbao, bienbao);
                lv_hocbienbao.setAdapter(listBienBaoAdapter);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }

    private static String docnoidungtuUrl(String TheUrl) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(TheUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return content.toString();
    }
}