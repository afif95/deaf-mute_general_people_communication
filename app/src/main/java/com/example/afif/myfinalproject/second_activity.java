package com.example.afif.myfinalproject;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class second_activity extends AppCompatActivity{

    private TextView resultText;
    private ImageButton button;
    private Button block;
    private String str;
    private ListView acok;
    private String[] names={"উপর","উচ্চ","উপরিভাগ","পরে","বিকাল","আমেরিকা","এবং","ঘোষণা","এপ্রিল","এলাকা","আগস্ট","অগাস্ট","শরৎকাল","শরৎ",
            "বাংলাদেশ","আগে","কাল","কালো","রাজধানী","চট্টগ্রাম","শহর","কলেজ","মহাদেশ","গণনা","দেশ","গরু","রোজ","দিন","ডিসেম্বর","ঢাকা","রোগ","জেলা",
            "বিভাগ","পৃথিবী","পূর্ব","ডিম","আট","আঠারো","আশি","এগারো","ইউরোপ","চারিদিক","দ্রুত","ফেব্রুয়ারি","কিছু","পনের","পঞ্চাশ","আগুন","পাঁচ","পতাকা","খাদ্য",
            "খাওয়া","খাও","খাব","খাবে","খেয়েছ","জন্য","পক্ষকাল","চল্লিশ","চার","চৌদ্দ","শুক্রবার","দাও","দেওয়া","কেমন","কিভাবে","তাড়াতাড়ি","জানুয়ারি","আনন্দ","জুলাই",
            "জুন","হেমন্তকাল","হেমন্ত","অনেকদিন","মার্চ","মে","মিনিট","সোমবার","মাস","সকাল","জাতি","কখনোনা","রাত","নয়","উনিশ","নব্বই","দুপুর","উত্তর","নভেম্বর",
            "এখন","এখানে","অক্টোবর","এক","হাজার","এক হাজার","মাত্র","অথবা","সমতল","বর্ষাকাল","বর্ষা","চাউল","ভাত","সালাম","শনিবার","সেপ্টেম্বর","সাত","সতের",
            "সত্তর","অসুস্থ","ছয়","ষোল","ষাট","আকাশ","দক্ষিণ","বসন্তকাল","বসন্ত","গ্রীষ্ম","গ্রীষ্মকাল","রবিবার","দশ","যখন","তখন","তের","তিরিশ","তিন","বৃহস্পতিবার","আজ",
            "আগামীকাল","কালকে","মঙ্গলবার","বারো","বিশ","দুই","বিশ্ববিদ্যালয়","পানি","রাস্তা","বুধবার","সপ্তাহ","পশ্চিম","কি","কোথায়","কখন","কেন","শীতকাল","শীত",
            "বছর","গতকাল","শূন্য","লাল","আকাশী","রং","হইতে","হতে","থেকে","স্বাগত","স্বাগতম","সহজ","সোজা","আমি","আমার","নরমাল","সাধারাণ","মামুলি","স্থায়ী","স্বয়ং",
            "নিজে","নিজ","আমরা","আমাদের","তুমি","তোমাদের","ঠিক","সঠিক","বিপদজনক","বিদায়","যদি","বহু","অনেক","সমস্যা","রিজার্ভ","লজ্জা","সাপোর্ট","সমর্থন","লম্বা",
            "শব্দ","অক্ষর","ড্রাইভার","চালক","স্টুডেন্ট","ছাত্র","মধ্যে","বেকার","সমান","শক্তি","শক্তিশালী","আসো","আসবে","এসেছো","এসেছিলে","আরম্ভ","শুরু","কারফিউ","দল",
            "আলাদা","আলাপ","কথা","জয়","খেলা","খেলছে","খেলোয়াড়","বল","গাছ","গাছের কাঁটা","ডাব","তরমুজ","কাঁঠাল","পেঁপে","শাপলা","ফুল","চানাচুর","জিলাপি","প্রশ্ন","সবসময়","সময়"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        resultText=findViewById(R.id.textViewid);
        button=findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                promptInputSpeech();
            }
        });
        block=findViewById(R.id.button3);
        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(second_activity.this,third_activity.class);
                ob.putExtra("tag",str);
                startActivity(ob);
            }
        });
        acok=findViewById(R.id.listviewid);
        ArrayAdapter<String>object=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        acok.setAdapter(object);
    }

    public void promptInputSpeech(){
        Intent ob=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        ob.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        ob.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "bn");
        ob.putExtra(RecognizerIntent.EXTRA_PROMPT,"নির্ধারিত শব্দগুচ্ছ থেকে কথা বলুন");
        try{
            startActivityForResult(ob,100);
        }catch (ActivityNotFoundException e){
            Toast.makeText(getApplicationContext(),"sorry your device doesn't support speech language",Toast.LENGTH_LONG).show();
        }
        Intent detailsIntent =  new Intent(RecognizerIntent.ACTION_GET_LANGUAGE_DETAILS);
        sendOrderedBroadcast(detailsIntent, null, new LanguageDetailsChecker(), null, Activity.RESULT_OK, null, null);
    }

    public void onActivityResult(int request_code,int result_code,Intent ob){
        super.onActivityResult(request_code,result_code,ob);
        if (request_code == 100){
            if(result_code==RESULT_OK && ob!=null){
                ArrayList<String> result=ob.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                resultText.setText(result.get(0));
                str=result.get(0);
            }
        }
    }
}
