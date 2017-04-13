package com.example.ishmeet.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ishmeet.finalproject.Adapter.ListViewAdapter;
import com.example.ishmeet.finalproject.Adapter.ViewPagerAdapter;

import java.util.ArrayList;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private Button music;
    private Button demo;
    private ArrayList<String> listResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listResult = new ArrayList<String>();
        createPokeList();
        initialView();
        initialListener();
    }

    private void createPokeList() {
        listResult.add("Bulbasaur");
        listResult.add("Ivysaur");
        listResult.add("Venusaur");
        listResult.add("Charmander");
        listResult.add("Charmeleon");
        listResult.add("Charizard");
        listResult.add("Squirtle");
        listResult.add("Wartortle");
        listResult.add("Blastoise");
        listResult.add("Caterpie");
        listResult.add("Metapod");
        listResult.add("Butterfree");
        listResult.add("Weedle");
        listResult.add("Kakuna");
        listResult.add("Beedrill");
        listResult.add("Pidgey");
        listResult.add("Pidgeotto");
        listResult.add("Pidgeot");
        listResult.add("Rattata");
        listResult.add("Raticate");
        listResult.add("Spearow");
        listResult.add("Fearow");
        listResult.add("Ekans");
        listResult.add("Arbok");
        listResult.add("Pikachu");
        listResult.add("Raichu");
        listResult.add("Sandshrew");
        listResult.add("Sandslash");
        listResult.add("Nidoran(f)");
        listResult.add("Nidorina");
        listResult.add("Nidoqueen");
        listResult.add("Nidoran(m)");
        listResult.add("Nidorino");
        listResult.add("Nidoking");
        listResult.add("Clefairy");
        listResult.add("Clefable");
        listResult.add("Vulpix");
        listResult.add("Ninetales");
        listResult.add("Jigglypuff");
        listResult.add("Wigglytuff");
        listResult.add("Zubat");
        listResult.add("Golbat");
        listResult.add("Oddish");
        listResult.add("Gloom");
        listResult.add("Vileplume");
        listResult.add("Paras");
        listResult.add("Parasect");
        listResult.add("Venonat");
        listResult.add("Venomoth");
        listResult.add("Diglett");
        listResult.add("Dugtrio");
        listResult.add("Meowth");
        listResult.add("Persian");
        listResult.add("Psyduck");
        listResult.add("Golduck");
        listResult.add("Mankey");
        listResult.add("Primeape");
        listResult.add("Growlithe");
        listResult.add("Arcanine");
        listResult.add("Poliwag");
        listResult.add("Poliwhirl");
        listResult.add("Poliwrath");
        listResult.add("Abra");
        listResult.add("Kadabra");
        listResult.add("Alakazam");
        listResult.add("Machop");
        listResult.add("Machoke");
        listResult.add("Machamp");
        listResult.add("Bellsprout");
        listResult.add("Weepinbell");
        listResult.add("Victreebel");
        listResult.add("Tentacool");
        listResult.add("Tentacruel");
        listResult.add("Geodude");
        listResult.add("Graveler");
        listResult.add("Golem");
        listResult.add("Ponyta");
        listResult.add("Rapidash");
        listResult.add("Slowpoke");
        listResult.add("Slowbro");
        listResult.add("Magnemite");
        listResult.add("Magneton");
        listResult.add("Farfetch’d");
        listResult.add("Doduo");
        listResult.add("Dodrio");
        listResult.add("Seel");
        listResult.add("Dewgong");
        listResult.add("Grimer");
        listResult.add("Muk");
        listResult.add("Shellder");
        listResult.add("Cloyster");
        listResult.add("Gastly");
        listResult.add("Haunter");
        listResult.add("Gengar");
        listResult.add("Onix");
        listResult.add("Drowzee");
        listResult.add("Hypno");
        listResult.add("Krabby");
        listResult.add("Kingler");
        listResult.add("Voltorb");
        listResult.add("Electrode");
        listResult.add("Exeggcute");
        listResult.add("Exeggutor");
        listResult.add("Cubone");
        listResult.add("Marowak");
        listResult.add("Hitmonlee");
        listResult.add("Hitmonchan");
        listResult.add("Lickitung");
        listResult.add("Koffing");
        listResult.add("Weezing");
        listResult.add("Rhyhorn");
        listResult.add("Rhydon");
        listResult.add("Chansey");
        listResult.add("Tangela");
        listResult.add("Kangaskhan");
        listResult.add("Horsea");
        listResult.add("Seadra");
        listResult.add("Goldeen");
        listResult.add("Seaking");
        listResult.add("Staryu");
        listResult.add("Starmie");
        listResult.add("Mr.Mime");
        listResult.add("Scyther");
        listResult.add("Jynx");
        listResult.add("Electabuzz");
        listResult.add("Magmar");
        listResult.add("Pinsir");
        listResult.add("Tauros");
        listResult.add("Magikarp");
        listResult.add("Gyarados");
        listResult.add("Lapras");
        listResult.add("Ditto");
        listResult.add("Eevee");
        listResult.add("Vaporeon");
        listResult.add("Jolteon");
        listResult.add("Flareon");
        listResult.add("Porygon");
        listResult.add("Omanyte");
        listResult.add("Omastar");
        listResult.add("Kabuto");
        listResult.add("Kabutops");
        listResult.add("Aerodactyl");
        listResult.add("Snorlax");
        listResult.add("Articuno");
        listResult.add("Zapdos");
        listResult.add("Moltres");
        listResult.add("Dratini");
        listResult.add("Dragonair");
        listResult.add("Dragonite");
        listResult.add("Mewtwo");
        listResult.add("Mew");
    }

    private void initialView() {
        music = (Button) findViewById(R.id.music);
        demo = (Button) findViewById(R.id.demo);
        listView = (ListView) findViewById(R.id.list_view);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listResult);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, SetWallpaper.class);
        String position1 = Integer.toString(position);
        intent.putExtra("position", position1);
        startActivity(intent);
    }

    private void initialListener(){
//        music.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(),ListViewActivity.class);
//                startActivityForResult(intent,3);
//                Intent intent = new Intent(v.getContext(), ListViewActivity.class);
//                startActivity(intent);
//            }
//        });
        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ViewPagerActivity.class);
                startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MusicActivity.class);
                startActivity(intent);
            }
        });
    }

}
