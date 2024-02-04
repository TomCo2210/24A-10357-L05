package dev.tomco.a24a_10357_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.textview.MaterialTextView;
import com.google.gson.Gson;

import dev.tomco.a24a_10357_l05.Models.Playlist;
import dev.tomco.a24a_10357_l05.Models.Song;
import dev.tomco.a24a_10357_l05.Utilities.SharedPreferencesManagerV2;
import dev.tomco.a24a_10357_l05.Utilities.SharedPreferencesManagerV3;
import dev.tomco.a24a_10357_l05.Utilities.SignalManager;

public class MainActivity extends AppCompatActivity {

    private MaterialTextView main_LBL_text;

    public static final String PLAYLIST = "PLAYLIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

//        Playlist playlist = new Playlist();
//        playlist.setName("Top 2");
//
//        playlist.addSong(new Song()
//                .setName("Paradise")
//                .setArtist("Coldplay")
//                .setLength(210)
//                .setRating(4.5f)
//                .setReleaseDate(System.currentTimeMillis() / 1000)
//                .setViews(15_648_675l)
//                .addTag("Rock")
//                .addTag("Pop")
//        );
//        playlist.addSong(new Song()
//                .setName("יוניקורן")
//                .setArtist("נועה קירל")
//                .setLength(150)
//                .setRating(4.8f)
//                .setReleaseDate(System.currentTimeMillis() / 1000)
//                .setViews(1_654_689l)
//                .addTag("Pop")
//                .addTag("Eurovision")
//                .addTag("Israeli")
//        );
//        Gson gson = new Gson();
//        String playlistAsJson = gson.toJson(playlist);
//        Log.d("JSON", playlistAsJson);


//        String json = "{\"name\":\"Top 2\",\"songArrayList\":[{\"artist\":\"Coldplay\",\"length\":210,\"name\":\"Paradise\",\"rating\":4.5,\"releaseDate\":1707061008,\"tags\":[\"Rock\",\"Pop\"],\"views\":15648675},{\"artist\":\"נועה קירל\",\"length\":150,\"name\":\"יוניקורן\",\"rating\":4.8,\"releaseDate\":1707061008,\"tags\":[\"Pop\",\"Eurovision\",\"Israeli\"],\"views\":1654689}]}";
//        Playlist playlist2 = new Gson().fromJson(json, Playlist.class);

//        Log.d("Loaded Playlist from JSON:", playlist2.toString());

//        SharedPreferencesManagerV2 sharedPreferencesManagerV2 = new SharedPreferencesManagerV2(this);
//        sharedPreferencesManagerV2.putString(PLAYLIST,json);
        Playlist fromSP = new Gson().fromJson(SharedPreferencesManagerV3.getInstance().getString(PLAYLIST, ""), Playlist.class);
        Log.d("Playlist from SP", fromSP.toString());

        SignalManager.getInstance().vibrate(500);
        SignalManager.getInstance().toast("Hello World");

    }

    private void findViews() {
        main_LBL_text = findViewById(R.id.main_LBL_text);
    }
}