package com.example.ishmeet.finalproject;

import android.app.WallpaperManager;
import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ishmeet.finalproject.dialog.CustomDialog;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SetWallpaper extends AppCompatActivity {

    //For RadioGroup
    Button btn;

    //for changing picture
    ImageView img;
    int pic;

    //Animation
    private Animation rotateAnimation;
    @BindView(R.id.img)
    ImageView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_wallpaper);
        ButterKnife.bind(this);
        initialAnimation();
        btn = (Button) findViewById(R.id.set_wall);
        img = (ImageView) findViewById(R.id.img);

        //sets up image to be viewed and set
        String number = getIntent().getStringExtra("position");
        if (number.equals("0")){
            pic = R.drawable.p1;
            img.setImageResource(R.drawable.p1);
        } else if (number.equals("1")){
            pic = R.drawable.p2;
            img.setImageResource(R.drawable.p2);
        } else if (number.equals("2")){
            pic = R.drawable.p3;
            img.setImageResource(R.drawable.p3);
        } else if (number.equals("3")){
            pic = R.drawable.p4;
            img.setImageResource(R.drawable.p4);
        } else if (number.equals("4")){
            pic = R.drawable.p5;
            img.setImageResource(R.drawable.p5);
        } else if (number.equals("5")){
            pic = R.drawable.p6;
            img.setImageResource(R.drawable.p6);
        } else if (number.equals("6")){
            pic = R.drawable.p7;
            img.setImageResource(R.drawable.p7);
        } else if (number.equals("7")){
            pic = R.drawable.p8;
            img.setImageResource(R.drawable.p8);
        } else if (number.equals("8")){
            pic = R.drawable.p9;
            img.setImageResource(R.drawable.p9);
        } else if (number.equals("9")){
            pic = R.drawable.p10;
            img.setImageResource(R.drawable.p10);
        } else if (number.equals("10")){
            pic = R.drawable.p11;
            img.setImageResource(R.drawable.p11);
        } else if (number.equals("11")){
            pic = R.drawable.p12;
            img.setImageResource(R.drawable.p12);
        } else if (number.equals("12")){
            pic = R.drawable.p13;
            img.setImageResource(R.drawable.p13);
        } else if (number.equals("13")){
            pic = R.drawable.p14;
            img.setImageResource(R.drawable.p14);
        } else if (number.equals("14")){
            pic = R.drawable.p15;
            img.setImageResource(R.drawable.p15);
        } else if (number.equals("15")){
            pic = R.drawable.p16;
            img.setImageResource(R.drawable.p16);
        } else if (number.equals("16")){
            pic = R.drawable.p17;
            img.setImageResource(R.drawable.p17);
        } else if (number.equals("17")){
            pic = R.drawable.p18;
            img.setImageResource(R.drawable.p18);
        } else if (number.equals("18")){
            pic = R.drawable.p19;
            img.setImageResource(R.drawable.p19);
        } else if (number.equals("19")){
            pic = R.drawable.p20;
            img.setImageResource(R.drawable.p20);
        } else if (number.equals("20")){
            pic = R.drawable.p21;
            img.setImageResource(R.drawable.p21);
        } else if (number.equals("21")){
            pic = R.drawable.p22;
            img.setImageResource(R.drawable.p22);
        } else if (number.equals("22")){
            pic = R.drawable.p23;
            img.setImageResource(R.drawable.p23);
        } else if (number.equals("23")){
            pic = R.drawable.p24;
            img.setImageResource(R.drawable.p24);
        } else if (number.equals("24")){
            pic = R.drawable.p25;
            img.setImageResource(R.drawable.p25);
        } else if (number.equals("25")){
            pic = R.drawable.p26;
            img.setImageResource(R.drawable.p26);
        } else if (number.equals("26")){
            pic = R.drawable.p27;
            img.setImageResource(R.drawable.p27);
        } else if (number.equals("27")){
            pic = R.drawable.p28;
            img.setImageResource(R.drawable.p28);
        } else if (number.equals("28")){
            pic = R.drawable.p29;
            img.setImageResource(R.drawable.p29);
        } else if (number.equals("29")){
            pic = R.drawable.p30;
            img.setImageResource(R.drawable.p30);
        } else if (number.equals("30")){
            pic = R.drawable.p31;
            img.setImageResource(R.drawable.p31);
        } else if (number.equals("31")){
            pic = R.drawable.p32;
            img.setImageResource(R.drawable.p32);
        } else if (number.equals("32")){
            pic = R.drawable.p33;
            img.setImageResource(R.drawable.p33);
        } else if (number.equals("33")){
            pic = R.drawable.p34;
            img.setImageResource(R.drawable.p34);
        } else if (number.equals("34")){
            pic = R.drawable.p35;
            img.setImageResource(R.drawable.p35);
        } else if (number.equals("35")){
            pic = R.drawable.p36;
            img.setImageResource(R.drawable.p36);
        } else if (number.equals("36")){
            pic = R.drawable.p37;
            img.setImageResource(R.drawable.p37);
        } else if (number.equals("37")){
            pic = R.drawable.p38;
            img.setImageResource(R.drawable.p38);
        } else if (number.equals("38")){
            pic = R.drawable.p39;
            img.setImageResource(R.drawable.p39);
        } else if (number.equals("39")){
            pic = R.drawable.p40;
            img.setImageResource(R.drawable.p40);
        } else if (number.equals("40")){
            pic = R.drawable.p41;
            img.setImageResource(R.drawable.p41);
        } else if (number.equals("41")){
            pic = R.drawable.p42;
            img.setImageResource(R.drawable.p42);
        } else if (number.equals("42")){
            pic = R.drawable.p43;
            img.setImageResource(R.drawable.p43);
        } else if (number.equals("43")){
            pic = R.drawable.p44;
            img.setImageResource(R.drawable.p44);
        } else if (number.equals("44")){
            pic = R.drawable.p45;
            img.setImageResource(R.drawable.p45);
        } else if (number.equals("45")){
            pic = R.drawable.p46;
            img.setImageResource(R.drawable.p46);
        } else if (number.equals("46")){
            pic = R.drawable.p47;
            img.setImageResource(R.drawable.p47);
        } else if (number.equals("47")){
            pic = R.drawable.p48;
            img.setImageResource(R.drawable.p48);
        } else if (number.equals("48")){
            pic = R.drawable.p49;
            img.setImageResource(R.drawable.p49);
        } else if (number.equals("49")){
            pic = R.drawable.p50;
            img.setImageResource(R.drawable.p50);
        } else if (number.equals("50")){
            pic = R.drawable.p51;
            img.setImageResource(R.drawable.p51);
        } else if (number.equals("51")){
            pic = R.drawable.p52;
            img.setImageResource(R.drawable.p52);
        } else if (number.equals("52")){
            pic = R.drawable.p53;
            img.setImageResource(R.drawable.p53);
        } else if (number.equals("53")){
            pic = R.drawable.p54;
            img.setImageResource(R.drawable.p54);
        } else if (number.equals("54")){
            pic = R.drawable.p55;
            img.setImageResource(R.drawable.p55);
        } else if (number.equals("55")){
            pic = R.drawable.p56;
            img.setImageResource(R.drawable.p56);
        } else if (number.equals("56")){
            pic = R.drawable.p57;
            img.setImageResource(R.drawable.p57);
        } else if (number.equals("57")){
            pic = R.drawable.p58;
            img.setImageResource(R.drawable.p58);
        } else if (number.equals("58")){
            pic = R.drawable.p59;
            img.setImageResource(R.drawable.p59);
        } else if (number.equals("59")){
            pic = R.drawable.p60;
            img.setImageResource(R.drawable.p60);
        } else if (number.equals("60")){
            pic = R.drawable.p61;
            img.setImageResource(R.drawable.p61);
        } else if (number.equals("61")){
            pic = R.drawable.p62;
            img.setImageResource(R.drawable.p62);
        } else if (number.equals("62")){
            pic = R.drawable.p63;
            img.setImageResource(R.drawable.p63);
        } else if (number.equals("63")){
            pic = R.drawable.p64;
            img.setImageResource(R.drawable.p64);
        } else if (number.equals("64")){
            pic = R.drawable.p65;
            img.setImageResource(R.drawable.p65);
        } else if (number.equals("65")){
            pic = R.drawable.p66;
            img.setImageResource(R.drawable.p66);
        } else if (number.equals("66")){
            pic = R.drawable.p67;
            img.setImageResource(R.drawable.p67);
        } else if (number.equals("67")){
            pic = R.drawable.p68;
            img.setImageResource(R.drawable.p68);
        } else if (number.equals("68")){
            pic = R.drawable.p69;
            img.setImageResource(R.drawable.p69);
        } else if (number.equals("69")){
            pic = R.drawable.p70;
            img.setImageResource(R.drawable.p70);
        } else if (number.equals("70")){
            pic = R.drawable.p71;
            img.setImageResource(R.drawable.p71);
        } else if (number.equals("71")){
            pic = R.drawable.p72;
            img.setImageResource(R.drawable.p72);
        } else if (number.equals("72")){
            pic = R.drawable.p73;
            img.setImageResource(R.drawable.p73);
        } else if (number.equals("73")){
            pic = R.drawable.p74;
            img.setImageResource(R.drawable.p74);
        } else if (number.equals("74")){
            pic = R.drawable.p75;
            img.setImageResource(R.drawable.p75);
        } else if (number.equals("75")){
            pic = R.drawable.p76;
            img.setImageResource(R.drawable.p76);
        } else if (number.equals("76")){
            pic = R.drawable.p77;
            img.setImageResource(R.drawable.p77);
        } else if (number.equals("77")){
            pic = R.drawable.p78;
            img.setImageResource(R.drawable.p78);
        } else if (number.equals("78")){
            pic = R.drawable.p79;
            img.setImageResource(R.drawable.p79);
        } else if (number.equals("79")){
            pic = R.drawable.p80;
            img.setImageResource(R.drawable.p80);
        } else if (number.equals("80")){
            pic = R.drawable.p81;
            img.setImageResource(R.drawable.p81);
        } else if (number.equals("81")){
            pic = R.drawable.p82;
            img.setImageResource(R.drawable.p82);
        } else if (number.equals("82")){
            pic = R.drawable.p83;
            img.setImageResource(R.drawable.p83);
        } else if (number.equals("83")){
            pic = R.drawable.p84;
            img.setImageResource(R.drawable.p84);
        } else if (number.equals("84")){
            pic = R.drawable.p85;
            img.setImageResource(R.drawable.p85);
        } else if (number.equals("85")){
            pic = R.drawable.p86;
            img.setImageResource(R.drawable.p86);
        } else if (number.equals("86")){
            pic = R.drawable.p87;
            img.setImageResource(R.drawable.p87);
        } else if (number.equals("87")){
            pic = R.drawable.p88;
            img.setImageResource(R.drawable.p88);
        } else if (number.equals("88")){
            pic = R.drawable.p89;
            img.setImageResource(R.drawable.p89);
        } else if (number.equals("89")){
            pic = R.drawable.p90;
            img.setImageResource(R.drawable.p90);
        } else if (number.equals("90")){
            pic = R.drawable.p91;
            img.setImageResource(R.drawable.p91);
        } else if (number.equals("91")){
            pic = R.drawable.p92;
            img.setImageResource(R.drawable.p92);
        } else if (number.equals("92")){
            pic = R.drawable.p93;
            img.setImageResource(R.drawable.p93);
        } else if (number.equals("93")){
            pic = R.drawable.p94;
            img.setImageResource(R.drawable.p94);
        } else if (number.equals("94")){
            pic = R.drawable.p95;
            img.setImageResource(R.drawable.p95);
        } else if (number.equals("95")){
            pic = R.drawable.p96;
            img.setImageResource(R.drawable.p96);
        } else if (number.equals("96")){
            pic = R.drawable.p97;
            img.setImageResource(R.drawable.p97);
        } else if (number.equals("97")){
            pic = R.drawable.p98;
            img.setImageResource(R.drawable.p98);
        } else if (number.equals("98")){
            pic = R.drawable.p99;
            img.setImageResource(R.drawable.p99);
        } else if (number.equals("99")){
            pic = R.drawable.p100;
            img.setImageResource(R.drawable.p100);
        } else if (number.equals("100")) {
            pic = R.drawable.p101;
            img.setImageResource(R.drawable.p101);
        } else if (number.equals("101")){
            pic = R.drawable.p102;
            img.setImageResource(R.drawable.p102);
        } else if (number.equals("102")){
            pic = R.drawable.p103;
            img.setImageResource(R.drawable.p103);
        } else if (number.equals("103")){
            pic = R.drawable.p104;
            img.setImageResource(R.drawable.p104);
        } else if (number.equals("104")){
            pic = R.drawable.p105;
            img.setImageResource(R.drawable.p105);
        } else if (number.equals("105")){
            pic = R.drawable.p106;
            img.setImageResource(R.drawable.p106);
        } else if (number.equals("106")){
            pic = R.drawable.p107;
            img.setImageResource(R.drawable.p107);
        } else if (number.equals("107")){
            pic = R.drawable.p108;
            img.setImageResource(R.drawable.p108);
        } else if (number.equals("108")){
            pic = R.drawable.p109;
            img.setImageResource(R.drawable.p109);
        } else if (number.equals("109")){
            pic = R.drawable.p110;
            img.setImageResource(R.drawable.p110);
        } else if (number.equals("110")){
            pic = R.drawable.p111;
            img.setImageResource(R.drawable.p111);
        } else if (number.equals("111")){
            pic = R.drawable.p112;
            img.setImageResource(R.drawable.p112);
        } else if (number.equals("112")){
            pic = R.drawable.p113;
            img.setImageResource(R.drawable.p113);
        } else if (number.equals("113")){
            pic = R.drawable.p114;
            img.setImageResource(R.drawable.p114);
        } else if (number.equals("114")){
            pic = R.drawable.p115;
            img.setImageResource(R.drawable.p115);
        } else if (number.equals("115")){
            pic = R.drawable.p116;
            img.setImageResource(R.drawable.p116);
        } else if (number.equals("116")){
            pic = R.drawable.p117;
            img.setImageResource(R.drawable.p117);
        } else if (number.equals("117")){
            pic = R.drawable.p118;
            img.setImageResource(R.drawable.p118);
        } else if (number.equals("118")){
            pic = R.drawable.p119;
            img.setImageResource(R.drawable.p119);
        } else if (number.equals("119")){
            pic = R.drawable.p120;
            img.setImageResource(R.drawable.p120);
        } else if (number.equals("120")){
            pic = R.drawable.p121;
            img.setImageResource(R.drawable.p121);
        } else if (number.equals("121")){
            pic = R.drawable.p122;
            img.setImageResource(R.drawable.p122);
        } else if (number.equals("122")){
            pic = R.drawable.p123;
            img.setImageResource(R.drawable.p123);
        } else if (number.equals("123")){
            pic = R.drawable.p124;
            img.setImageResource(R.drawable.p124);
        } else if (number.equals("124")){
            pic = R.drawable.p125;
            img.setImageResource(R.drawable.p125);
        } else if (number.equals("125")){
            pic = R.drawable.p126;
            img.setImageResource(R.drawable.p126);
        } else if (number.equals("126")){
            pic = R.drawable.p127;
            img.setImageResource(R.drawable.p127);
        } else if (number.equals("127")){
            pic = R.drawable.p128;
            img.setImageResource(R.drawable.p128);
        } else if (number.equals("128")){
            pic = R.drawable.p129;
            img.setImageResource(R.drawable.p129);
        } else if (number.equals("129")){
            pic = R.drawable.p130;
            img.setImageResource(R.drawable.p130);
        } else if (number.equals("130")){
            pic = R.drawable.p131;
            img.setImageResource(R.drawable.p131);
        } else if (number.equals("131")){
            pic = R.drawable.p132;
            img.setImageResource(R.drawable.p132);
        } else if (number.equals("132")){
            pic = R.drawable.p133;
            img.setImageResource(R.drawable.p133);
        } else if (number.equals("133")){
            pic = R.drawable.p134;
            img.setImageResource(R.drawable.p134);
        } else if (number.equals("134")){
            pic = R.drawable.p135;
            img.setImageResource(R.drawable.p135);
        } else if (number.equals("135")){
            pic = R.drawable.p136;
            img.setImageResource(R.drawable.p136);
        } else if (number.equals("136")){
            pic = R.drawable.p137;
            img.setImageResource(R.drawable.p137);
        } else if (number.equals("137")){
            pic = R.drawable.p138;
            img.setImageResource(R.drawable.p138);
        } else if (number.equals("138")){
            pic = R.drawable.p139;
            img.setImageResource(R.drawable.p139);
        } else if (number.equals("139")){
            pic = R.drawable.p140;
            img.setImageResource(R.drawable.p140);
        } else if (number.equals("140")){
            pic = R.drawable.p141;
            img.setImageResource(R.drawable.p141);
        } else if (number.equals("141")){
            pic = R.drawable.p142;
            img.setImageResource(R.drawable.p142);
        } else if (number.equals("142")){
            pic = R.drawable.p143;
            img.setImageResource(R.drawable.p143);
        } else if (number.equals("143")){
            pic = R.drawable.p144;
            img.setImageResource(R.drawable.p144);
        } else if (number.equals("144")){
            pic = R.drawable.p145;
            img.setImageResource(R.drawable.p145);
        } else if (number.equals("145")){
            pic = R.drawable.p146;
            img.setImageResource(R.drawable.p146);
        } else if (number.equals("146")){
            pic = R.drawable.p147;
            img.setImageResource(R.drawable.p147);
        } else if (number.equals("147")){
            pic = R.drawable.p148;
            img.setImageResource(R.drawable.p148);
        } else if (number.equals("148")){
            pic = R.drawable.p149;
            img.setImageResource(R.drawable.p149);
        } else if (number.equals("149")){
            pic = R.drawable.p150;
            img.setImageResource(R.drawable.p150);
        } else if (number.equals("150")) {
            pic = R.drawable.p151;
            img.setImageResource(R.drawable.p151);
        }



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog();
            }
        });

    }

    private void initialAnimation(){
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
    }

    private void rotate(){
        tv.startAnimation(rotateAnimation);
    }

    //sets wallpaper
    private void setPaper(){
        WallpaperManager wallmgr = WallpaperManager.getInstance(getApplicationContext());
        try {
            wallmgr.setResource(+ pic);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void customDialog(){
        CustomDialog dialog = new CustomDialog(this, new CustomDialog.ICustomDialogEventListener() {
            @Override
            public void onClickListener() {
                setPaper();
                rotate();
            }
        });
        dialog.show();
    }

}
