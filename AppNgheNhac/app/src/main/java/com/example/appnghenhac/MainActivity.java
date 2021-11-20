package com.example.appnghenhac;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txtSongName, txtTotalTime;
    Button btnSelect, btnPlay, btnPause;
    ArrayList<Song> arraySong;
    int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        AddSong();
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arraySong.get(position).getFile());
        txtSongName.setText(arraySong.get(position).getSongName());
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChonBaiHat.class);
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                txtSongName.setText(arraySong.get(position).getSongName());
            }
        });
    }
    private void AddSong(){
        arraySong = new ArrayList<>();
        arraySong.add(new Song("Bao tiền một mớ bình yên",R.raw.bao_tien_mot_mo_binh_yen));
        arraySong.add(new Song("Bước qua mùa cô đơn",R.raw.buoc_qua_mua_co_don));
        arraySong.add(new Song("Đi qua mùa hạ",R.raw.di_qua_mua_ha));
        arraySong.add(new Song("Dù cho mai về sau",R.raw.du_cho_mai_ve_sau));
        arraySong.add(new Song("Muộn rồi mà sao còn",R.raw.muon_roi_ma_sao_con));
        arraySong.add(new Song("Tình yêu xanh lá",R.raw.tinh_yeu_xanh_la));
    }

    private void AnhXa(){
        txtSongName = (TextView) findViewById(R.id.textviewSongName);
        txtTotalTime= (TextView) findViewById(R.id.textviewTotalTime);
        btnPause = (Button) findViewById(R.id.button6Pause);
        btnPlay = (Button) findViewById(R.id.button5Play);
        btnSelect = (Button) findViewById(R.id.button4Select);

    }
}