package com.example.afif.myfinalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.widget.VideoView;

public class third_activity extends AppCompatActivity {

    private VideoView var;
    private int[] ids=new int[20];
    private int index=0;
    private int index2=0;
    private StringBuilder holder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_third_activity);
        var=findViewById(R.id.videoviewid);

        Bundle ob=getIntent().getExtras();
        if(ob!=null) {
            String str = ob.getString("tag");
            holder = new StringBuilder();
                assert str != null;
                for (int i = 0; i <= str.length(); i++) {
                    if (i == str.length()) {
                        apple();
                        continue;
                    }
                    else if (str.charAt(i) == ' ') {
                        if (holder.toString().equals("সব") || holder.toString().equals("কখনো")) {
                            continue;
                        }
                        apple();
                        holder.setLength(0);
                        continue;
                    }
                    holder.append(str.charAt(i));
                }
                    var.requestFocus();
                    var.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + ids[index]));
                    var.start();
        }

        else{
            Toast.makeText(third_activity.this,"no input",Toast.LENGTH_SHORT).show();
            Intent obj = new Intent(third_activity.this, MainActivity.class);
            startActivity(obj);
        }


        var.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if(index==index2-1){
                    index=0;
                    Intent obj=new Intent(third_activity.this,MainActivity.class);
                    startActivity(obj);
                }
                    index++;
                    var.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + ids[index]));
                    Toast.makeText(third_activity.this,"next",Toast.LENGTH_SHORT).show();
                    var.start();
            }
        });

    }

    public void apple(){
            if (holder.toString().equals("উপর") || holder.toString().equals("উচ্চ")) {
                ids[index2] = R.raw.above;
                index2++;
            }
            if (holder.toString().equals("উপরিভাগ")) {
                ids[index2] = R.raw.abovesurface;
                index2++;
            }
            if (holder.toString().equals("পরে")) {
                ids[index2] = R.raw.after;
                index2++;
            }
            if (holder.toString().equals("বিকাল")) {
                ids[index2] = R.raw.afternoon;
                index2++;
            }
            if (holder.toString().equals("আমেরিকা")) {
                ids[index2] = R.raw.america;
                index2++;
            }
            if (holder.toString().equals("এবং")) {
                ids[index2] = R.raw.and;
                index2++;
            }
            if (holder.toString().equals("ঘোষণা")) {
                ids[index2] = R.raw.announce;
                index2++;
            }
            if (holder.toString().equals("এপ্রিল")) {
                ids[index2] = R.raw.april;
                index2++;
            }
            if (holder.toString().equals("এলাকা")) {
                ids[index2] = R.raw.area;
                index2++;
            }
            if (holder.toString().equals("আগস্ট") || holder.toString().equals("অগাস্ট")) {
                ids[index2] = R.raw.august;
                index2++;
            }
            if (holder.toString().equals("শরৎকাল") || holder.toString().equals("শরৎ")) {
                ids[index2] = R.raw.autumn;
                index2++;
            }
            if (holder.toString().equals("বাংলাদেশ")) {
                ids[index2] = R.raw.bangladesh;
                index2++;
            }
            if (holder.toString().equals("আগে")) {
                ids[index2] = R.raw.before;
                index2++;
            }
            if (holder.toString().equals("কাল") || holder.toString().equals("কালো")) {
                ids[index2] = R.raw.black;
                index2++;
            }
            if (holder.toString().equals("রাজধানী")) {
                ids[index2] = R.raw.capital;
                index2++;
            }
            if (holder.toString().equals("চট্টগ্রাম")) {
                ids[index2] = R.raw.chittagong;
                index2++;
            }
            if (holder.toString().equals("শহর")) {
                ids[index2] = R.raw.city;
                index2++;
            }
            if (holder.toString().equals("কলেজ")) {
                ids[index2] = R.raw.college;
                index2++;
            }
            if (holder.toString().equals("মহাদেশ")) {
                ids[index2] = R.raw.continent;
                index2++;
            }
            if (holder.toString().equals("গণনা")) {
                ids[index2] = R.raw.count;
                index2++;
            }
            if (holder.toString().equals("দেশ")) {
                ids[index2] = R.raw.country;
                index2++;
            }
            if (holder.toString().equals("গরু")) {
                ids[index2] = R.raw.cow;
                index2++;
            }
            if (holder.toString().equals("রোজ")) {
                ids[index2] = R.raw.daily;
                index2++;
            }
            if (holder.toString().equals("দিন")) {
                ids[index2] = R.raw.day;
                index2++;
            }
            if (holder.toString().equals("ডিসেম্বর")) {
                ids[index2] = R.raw.december;
                index2++;
            }
            if (holder.toString().equals("ঢাকা")) {
                ids[index2] = R.raw.dhaka;
                index2++;
            }
            if (holder.toString().equals("রোগ")) {
                ids[index2] = R.raw.disease;
                index2++;
            }
            if (holder.toString().equals("জেলা")) {
                ids[index2] = R.raw.district;
                index2++;
            }
            if (holder.toString().equals("বিভাগ")) {
                ids[index2] = R.raw.division;
                index2++;
            }
            if (holder.toString().equals("পৃথিবী")) {
                ids[index2] = R.raw.earth;
                index2++;
            }
            if (holder.toString().equals("পূর্ব")) {
                ids[index2] = R.raw.east;
                index2++;
            }
            if (holder.toString().equals("ডিম")) {
                ids[index2] = R.raw.egg;
                index2++;
            }
            if (holder.toString().equals("8")) {
                ids[index2] = R.raw.eight;
                index2++;
            }
            if (holder.toString().equals("18")) {
                ids[index2] = R.raw.eighteen;
                index2++;
            }
            if (holder.toString().equals("আশি") || holder.toString().equals("80")) {
                ids[index2] = R.raw.eighty;
                index2++;
            }
            if (holder.toString().equals("11")) {
                ids[index2] = R.raw.eleven;
                index2++;
            }
            if (holder.toString().equals("ইউরোপ")) {
                ids[index2] = R.raw.europe;
                index2++;
            }
            if (holder.toString().equals("চারিদিক")) {
                ids[index2] = R.raw.everyside;
                index2++;
            }
            if (holder.toString().equals("দ্রুত")) {
                ids[index2] = R.raw.fast;
                index2++;
            }
            if (holder.toString().equals("ফেব্রুয়ারি")) {
                ids[index2] = R.raw.february;
                index2++;
            }
            if (holder.toString().equals("কিছু")) {
                ids[index2] = R.raw.few;
                index2++;
            }
            if (holder.toString().equals("15")) {
                ids[index2] = R.raw.fifteen;
                index2++;
            }
            if (holder.toString().equals("50")) {
                ids[index2] = R.raw.fifty;
                index2++;
            }
            if (holder.toString().equals("আগুন")) {
                ids[index2] = R.raw.fire;
                index2++;
            }
            if (holder.toString().equals("5")) {
                ids[index2] = R.raw.five;
                index2++;
            }
            if (holder.toString().equals("পতাকা")) {
                ids[index2] = R.raw.flag;
                index2++;
            }
            if (holder.toString().equals("খাদ্য")) {
                ids[index2] = R.raw.foodeat;
                index2++;
            }
            if (holder.toString().equals("খাওয়া") || holder.toString().equals("খাও") || holder.toString().equals("খাব") || holder.toString().equals("খাবে") || holder.toString().equals("খেয়েছ")) {
                ids[index2] = R.raw.foodeat;
                index2++;
            }
            if (holder.toString().equals("জন্য")) {
                ids[index2] = R.raw.furfor;
                index2++;
            }
            if (holder.toString().equals("পক্ষকাল")) {
                ids[index2] = R.raw.fortnight;
                index2++;
            }
            if (holder.toString().equals("40")) {
                ids[index2] = R.raw.forty;
                index2++;
            }
            if (holder.toString().equals("4")) {
                ids[index2] = R.raw.four;
                index2++;
            }
            if (holder.toString().equals("14")) {
                ids[index2] = R.raw.fourteen;
                index2++;
            }
            if (holder.toString().equals("শুক্রবার")) {
                ids[index2] = R.raw.friday;
                index2++;
            }
            if (holder.toString().equals("দাও") || holder.toString().equals("দেওয়া")) {
                ids[index2] = R.raw.give;
                index2++;
            }
            if (holder.toString().equals("কেমন") || holder.toString().equals("কিভাবে")) {
                ids[index2] = R.raw.how;
                index2++;
            }
            if (holder.toString().equals("তাড়াতাড়ি")) {
                ids[index2] = R.raw.hurry;
                index2++;
            }
            if (holder.toString().equals("জানুয়ারি")) {
                ids[index2] = R.raw.january;
                index2++;
            }
            if (holder.toString().equals("আনন্দ")) {
                ids[index2] = R.raw.joy;
                index2++;
            }
            if (holder.toString().equals("জুলাই")) {
                ids[index2] = R.raw.july;
                index2++;
            }
            if (holder.toString().equals("জুন")) {
                ids[index2] = R.raw.june;
                index2++;
            }
            if (holder.toString().equals("হেমন্তকাল") || holder.toString().equals("হেমন্ত")) {
                ids[index2] = R.raw.lateautumn;
                index2++;
            }
            if (holder.toString().equals("অনেকদিন")) {
                ids[index2] = R.raw.longtime;
                index2++;
            }
            if (holder.toString().equals("মার্চ")) {
                ids[index2] = R.raw.march;
                index2++;
            }
            if (holder.toString().equals("মে")) {
                ids[index2] = R.raw.may;
                index2++;
            }
            if (holder.toString().equals("মিনিট")) {
                ids[index2] = R.raw.minute;
                index2++;
            }
            if (holder.toString().equals("সোমবার")) {
                ids[index2] = R.raw.monday;
                index2++;
            }
            if (holder.toString().equals("মাস")) {
                ids[index2] = R.raw.month;
                index2++;
            }
            if (holder.toString().equals("সকাল")) {
                ids[index2] = R.raw.morning;
                index2++;
            }
            if (holder.toString().equals("জাতি")) {
                ids[index2] = R.raw.nation;
                index2++;
            }
            if (holder.toString().equals("কখনোনা")) {
                ids[index2] = R.raw.never;
                index2++;
            }
            if (holder.toString().equals("রাত")) {
                ids[index2] = R.raw.night;
                index2++;
            }
            if (holder.toString().equals("9")) {
                ids[index2] = R.raw.nine;
                index2++;
            }
            if (holder.toString().equals("19")) {
                ids[index2] = R.raw.nineteen;
                index2++;
            }
            if (holder.toString().equals("90")) {
                ids[index2] = R.raw.ninety;
                index2++;
            }
            if (holder.toString().equals("দুপুর")) {
                ids[index2] = R.raw.noon;
                index2++;
            }
            if (holder.toString().equals("উত্তর")) {
                ids[index2] = R.raw.north;
                index2++;
            }
            if (holder.toString().equals("নভেম্বর")) {
                ids[index2] = R.raw.november;
                index2++;
            }
            if (holder.toString().equals("এখন")) {
                ids[index2] = R.raw.nowhere;
                index2++;
            }
            if (holder.toString().equals("এখানে")) {
                ids[index2] = R.raw.nowhere;
                index2++;
            }
            if (holder.toString().equals("অক্টোবর")) {
                ids[index2] = R.raw.october;
                index2++;
            }
            if (holder.toString().equals("1")) {
                ids[index2] = R.raw.one;
                index2++;
            }
            if (holder.toString().equals("1000")) {
                ids[index2] = R.raw.onehundred;
                index2++;
            }
            if (holder.toString().equals("মাত্র")) {
                ids[index2] = R.raw.only;
                index2++;
            }
            if (holder.toString().equals("অথবা")) {
                ids[index2] = R.raw.or;
                index2++;
            }
            if (holder.toString().equals("সমতল")) {
                ids[index2] = R.raw.plane;
                index2++;
            }
            if (holder.toString().equals("বর্ষাকাল") || holder.toString().equals("বর্ষা")) {
                ids[index2] = R.raw.rainyseason;
                index2++;
            }
            if (holder.toString().equals("চাউল") || holder.toString().equals("ভাত")) {
                ids[index2] = R.raw.rice;
                index2++;
            }
            if (holder.toString().equals("সালাম")) {
                ids[index2] = R.raw.salam;
                index2++;
            }
            if (holder.toString().equals("শনিবার")) {
                ids[index2] = R.raw.saturday;
                index2++;
            }
            if (holder.toString().equals("সেপ্টেম্বর")) {
                ids[index2] = R.raw.september;
                index2++;
            }
            if (holder.toString().equals("7")) {
                ids[index2] = R.raw.seven;
                index2++;
            }
            if (holder.toString().equals("17")) {
                ids[index2] = R.raw.seventeen;
                index2++;
            }
            if (holder.toString().equals("70")) {
                ids[index2] = R.raw.seventy;
                index2++;
            }
            if (holder.toString().equals("অসুস্থ")) {
                ids[index2] = R.raw.sick;
                index2++;
            }
            if (holder.toString().equals("6")) {
                ids[index2] = R.raw.six;
                index2++;
            }
            if (holder.toString().equals("16")) {
                ids[index2] = R.raw.sixteen;
                index2++;
            }
            if (holder.toString().equals("60")) {
                ids[index2] = R.raw.sixty;
                index2++;
            }
            if (holder.toString().equals("আকাশ")) {
                ids[index2] = R.raw.sky;
                index2++;
            }
            if (holder.toString().equals("দক্ষিণ")) {
                ids[index2] = R.raw.south;
                index2++;
            }
            if (holder.toString().equals("বসন্তকাল") || holder.toString().equals("বসন্ত")) {
                ids[index2] = R.raw.spring;
                index2++;
            }
            if (holder.toString().equals("গ্রীষ্ম") || holder.toString().equals("গ্রীষ্মকাল")) {
                ids[index2] = R.raw.summer;
                index2++;
            }
            if (holder.toString().equals("রবিবার")) {
                ids[index2] = R.raw.sunday;
                index2++;
            }
            if (holder.toString().equals("10")) {
                ids[index2] = R.raw.ten;
                index2++;
            }
            if (holder.toString().equals("যখন") || holder.toString().equals("তখন")) {
                ids[index2] = R.raw.then;
                index2++;
            }
            if (holder.toString().equals("13")) {
                ids[index2] = R.raw.thirteen;
                index2++;
            }
            if (holder.toString().equals("30")) {
                ids[index2] = R.raw.thirty;
                index2++;
            }
            if (holder.toString().equals("3")) {
                ids[index2] = R.raw.three;
                index2++;
            }
            if (holder.toString().equals("বৃহস্পতিবার")) {
                ids[index2] = R.raw.thursday;
                index2++;
            }
            if (holder.toString().equals("আজ")) {
                ids[index2] = R.raw.today;
                index2++;
            }
            if (holder.toString().equals("আগামীকাল") || holder.toString().equals("কালকে")) {
                ids[index2] = R.raw.tomorrow;
                index2++;
            }
            if (holder.toString().equals("মঙ্গলবার")) {
                ids[index2] = R.raw.tuesday;
                index2++;
            }
            if (holder.toString().equals("12")) {
                ids[index2] = R.raw.twelve;
                index2++;
            }
            if (holder.toString().equals("20")) {
                ids[index2] = R.raw.twenty;
                index2++;
            }
            if (holder.toString().equals("2")) {
                ids[index2] = R.raw.two;
                index2++;
            }
            if (holder.toString().equals("বিশ্ববিদ্যালয়")) {
                ids[index2] = R.raw.university;
                index2++;
            }
            if (holder.toString().equals("পানি")) {
                ids[index2] = R.raw.water;
                index2++;
            }
            if (holder.toString().equals("রাস্তা")) {
                ids[index2] = R.raw.way;
                index2++;
            }
            if (holder.toString().equals("বুধবার")) {
                ids[index2] = R.raw.wednesday;
                index2++;
            }
            if (holder.toString().equals("সপ্তাহ")) {
                ids[index2] = R.raw.week;
                index2++;
            }
            if (holder.toString().equals("পশ্চিম")) {
                ids[index2] = R.raw.west;
                index2++;
            }
            if (holder.toString().equals("কি")) {
                ids[index2] = R.raw.what;
                index2++;
            }
            if (holder.toString().equals("কোথায়")) {
                ids[index2] = R.raw.where;
                index2++;
            }
            if (holder.toString().equals("কখন")) {
                ids[index2] = R.raw.when;
                index2++;
            }
            if (holder.toString().equals("কেন")) {
                ids[index2] = R.raw.why;
                index2++;
            }
            if (holder.toString().equals("শীতকাল") || holder.toString().equals("শীত")) {
                ids[index2] = R.raw.winter;
                index2++;
            }
            if (holder.toString().equals("বছর")) {
                ids[index2] = R.raw.year;
                index2++;
            }
            if (holder.toString().equals("গতকাল")) {
                ids[index2] = R.raw.yesterday;
                index2++;
            }
            if (holder.toString().equals("0")) {
                ids[index2] = R.raw.zero;
                index2++;
            }
            if (holder.toString().equals("লাল")) {
                ids[index2] = R.raw.red;
                index2++;
            }
            if (holder.toString().equals("আকাশী")) {
                ids[index2] = R.raw.skycolor;
                index2++;
            }
            if (holder.toString().equals("রং")) {
                ids[index2] = R.raw.color;
                index2++;
            }
            if (holder.toString().equals("হইতে") || holder.toString().equals("হতে") || holder.toString().equals("থেকে")) {
                ids[index2] = R.raw.from;
                index2++;
            }
            if (holder.toString().equals("স্বাগত") || holder.toString().equals("স্বাগতম")) {
                ids[index2] = R.raw.welcome;
                index2++;
            }
            if (holder.toString().equals("সহজ") || holder.toString().equals("সোজা")) {
                ids[index2] = R.raw.easy;
                index2++;
            }
            if (holder.toString().equals("আমি") || holder.toString().equals("আমার")) {
                ids[index2] = R.raw.imy;
                index2++;
            }
            if (holder.toString().equals("নরমাল") || holder.toString().equals("সাধারাণ") || holder.toString().equals("মামুলি")) {
                ids[index2] = R.raw.ordinary;
                index2++;
            }
            if (holder.toString().equals("স্থায়ী")) {
                ids[index2] = R.raw.permanent;
                index2++;
            }
            if (holder.toString().equals("স্বয়ং") || holder.toString().equals("নিজে") || holder.toString().equals("নিজ")) {
                ids[index2] = R.raw.self;
                index2++;
            }
            if (holder.toString().equals("আমরা") || holder.toString().equals("আমাদের")) {
                ids[index2] = R.raw.weour;
                index2++;
            }
            if (holder.toString().equals("তুমি") || holder.toString().equals("তোমাদের")) {
                ids[index2] = R.raw.you;
                index2++;
            }
            if (holder.toString().equals("ঠিক") || holder.toString().equals("সঠিক")) {
                ids[index2] = R.raw.correct;
                index2++;
            }
            if (holder.toString().equals("বিপদজনক")) {
                ids[index2] = R.raw.dangerous;
                index2++;
            }
            if (holder.toString().equals("বিদায়")) {
                ids[index2] = R.raw.goodbye;
                index2++;
            }
            if (holder.toString().equals("যদি")) {
                ids[index2] = R.raw.jodi;
                index2++;
            }
            if (holder.toString().equals("বহু") || holder.toString().equals("অনেক")) {
                ids[index2] = R.raw.multiplebohuonek;
                index2++;
            }
            if (holder.toString().equals("সমস্যা")) {
                ids[index2] = R.raw.problem;
                index2++;
            }
            if (holder.toString().equals("রিজার্ভ")) {
                ids[index2] = R.raw.reserve;
                index2++;
            }
            if (holder.toString().equals("লজ্জা")) {
                ids[index2] = R.raw.shame;
                index2++;
            }
            if (holder.toString().equals("সাপোর্ট") || holder.toString().equals("সমর্থন")) {
                ids[index2] = R.raw.support;
                index2++;
            }
            if (holder.toString().equals("লম্বা")) {
                ids[index2] = R.raw.tall;
                index2++;
            }
            if (holder.toString().equals("শব্দ") || holder.toString().equals("অক্ষর")) {
                ids[index2] = R.raw.word;
                index2++;
            }
            if (holder.toString().equals("ড্রাইভার") || holder.toString().equals("চালক")) {
                ids[index2] = R.raw.driver;
                index2++;
            }
            if (holder.toString().equals("স্টুডেন্ট") || holder.toString().equals("ছাত্র")) {
                ids[index2] = R.raw.student;
                index2++;
            }
            if (holder.toString().equals("মধ্যে")) {
                ids[index2] = R.raw.between;
                index2++;
            }
            if (holder.toString().equals("বেকার")) {
                ids[index2] = R.raw.unemployed;
                index2++;
            }
            if (holder.toString().equals("সমান")) {
                ids[index2] = R.raw.equal;
                index2++;
            }
            if (holder.toString().equals("শক্তি") || holder.toString().equals("শক্তিশালী")) {
                ids[index2] = R.raw.strength;
                index2++;
            }
            if (holder.toString().equals("আসো") || holder.toString().equals("আসবে") || holder.toString().equals("এসেছো") || holder.toString().equals("এসেছিলে")) {
                ids[index2] = R.raw.come;
                index2++;
            }
            if (holder.toString().equals("আরম্ভ") || holder.toString().equals("শুরু")) {
                ids[index2] = R.raw.start;
                index2++;
            }
            if (holder.toString().equals("কারফিউ")) {
                ids[index2] = R.raw.curfew;
                index2++;
            }
            if (holder.toString().equals("দল")) {
                ids[index2] = R.raw.group;
                index2++;
            }
            if (holder.toString().equals("আলাদা")) {
                ids[index2] = R.raw.aladakora;
                index2++;
            }
            if (holder.toString().equals("আলাপ") || holder.toString().equals("কথা")) {
                ids[index2] = R.raw.kothabolaalapkora;
                index2++;
            }
            if (holder.toString().equals("জয়")) {
                ids[index2] = R.raw.win;
                index2++;
            }
            if (holder.toString().equals("খেলা") || holder.toString().equals("খেলছে")) {
                ids[index2] = R.raw.play;
                index2++;
            }
            if (holder.toString().equals("খেলোয়াড়")) {
                ids[index2] = R.raw.player;
                index2++;
            }
            if (holder.toString().equals("বল")) {
                ids[index2] = R.raw.ball;
                index2++;
            }
            if (holder.toString().equals("গাছ") || holder.toString().equals("গাছের")) {
                ids[index2] = R.raw.tree;
                index2++;
            }
            if (holder.toString().equals("কাঁটা")) {
                ids[index2] = R.raw.thorn;
                index2++;
            }
            if (holder.toString().equals("ডাব")) {
                ids[index2] = R.raw.greencoconut;
                index2++;
            }
            if (holder.toString().equals("তরমুজ")) {
                ids[index2] = R.raw.melon;
                index2++;
            }
            if (holder.toString().equals("কাঁঠাল")) {
                ids[index2] = R.raw.jackfruit;
                index2++;
            }
            if (holder.toString().equals("পেঁপে")) {
                ids[index2] = R.raw.papaya;
                index2++;
            }
            if (holder.toString().equals("শাপলা")) {
                ids[index2] = R.raw.shapla;
                index2++;
            }
            if (holder.toString().equals("ফুল")) {
                ids[index2] = R.raw.flower;
                index2++;
            }
            if (holder.toString().equals("চানাচুর")) {
                ids[index2] = R.raw.chanachur;
                index2++;
            }
            if (holder.toString().equals("জিলাপি")) {
                ids[index2] = R.raw.jilapi;
                index2++;
            }
            if (holder.toString().equals("প্রশ্ন")) {
                ids[index2] = R.raw.question;
                index2++;
            }
            if (holder.toString().equals("সবসম")) {
                ids[index2] = R.raw.everytime;
                index2++;
            }
            if (holder.toString().equals("সম")) {
                ids[index2] = R.raw.time;
                index2++;
            }
            else{
                holder.deleteCharAt(holder.length()-1);
                if(holder.length()==0){
                    return;
                }
                apple();
            }
    }
}
