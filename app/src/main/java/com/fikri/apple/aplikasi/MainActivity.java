package com.fikri.apple.aplikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listpuasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listpuasa = findViewById(R.id.list_puasa);

        listpuasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent seninKamis = new Intent(MainActivity.this, detail.class);
                    seninKamis.putExtra("posisi", position);
                    seninKamis.putExtra("Link", "http://www.almunawwar.net/manfaat-puasa-senin-kamis/");
                    startActivity(seninKamis);
                }else  if (position == 1){
                    Intent daud = new Intent(MainActivity.this, detail.class);
                    daud.putExtra("posisi", position);
                    daud.putExtra("Link", "https://muslim.or.id/17877-puasa-daud-sebaik-baiknya-puasa.html");
                    startActivity(daud);
                }else  if (position == 2){
                    Intent syawal = new Intent(MainActivity.this, detail.class);
                    syawal.putExtra("posisi", position);
                    syawal.putExtra("Link", "https://muslim.or.id/17782-tata-cara-puasa-syawal.html");
                    startActivity(syawal);
                }else  if (position == 3){
                    Intent  arofah= new Intent(MainActivity.this, detail.class);
                    arofah.putExtra("posisi", position);
                    arofah.putExtra("Link", "https://muslim.or.id/18509-keutamaan-puasa-arafah.html");
                    startActivity(arofah);
                }else  if (position == 4){
                    Intent  asySyuro= new Intent(MainActivity.this, detail.class);
                    asySyuro.putExtra("posisi", position);
                    asySyuro.putExtra("Link", "https://muslim.or.id/23090-keutamaan-puasa-asyura-dan-sejarahnya.html");
                    startActivity(asySyuro);
                }else  if (position == 5){
                    Intent  ayyamulBidh= new Intent(MainActivity.this, detail.class);
                    ayyamulBidh.putExtra("posisi", position);
                    ayyamulBidh.putExtra("Link", "https://muslim.or.id/17851-puasa-tiga-hari-setiap-bulan-dan-puasa-ayyamul-bidh.html");
                    startActivity(ayyamulBidh);
                }else  if (position == 6){
                    Intent  syaban= new Intent(MainActivity.this, detail.class);
                    syaban.putExtra("posisi", position);
                    syaban.putExtra("Link", "https://muslim.or.id/15917-anjuran-puasa-syaban.html");
                    startActivity(syaban);
                }
            }
        });
    }
}
