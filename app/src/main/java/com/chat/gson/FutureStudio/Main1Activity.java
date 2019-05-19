package com.chat.gson.FutureStudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.chat.gson.FutureStudio.Model.UserAdress;
import com.chat.gson.FutureStudio.Model.UserNested;
import com.chat.gson.FutureStudio.Model.UserSample;
import com.chat.gson.R;
import com.google.gson.Gson;

public class Main1Activity extends AppCompatActivity {
    private static final String TAG = "Main1Activity";
    private TextView tvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        tvv=findViewById(R.id.tvv);
        serailizeUserSample();
        deserializeUserSample();
        NestedSerialize();
        NestedDeserialize();
    }

    private void serailizeUserSample() {

        Gson gson = new Gson();
        UserSample userSample = new UserSample("jwngma", "smkbyt@gmail.com", 23, true);
        String json = gson.toJson(userSample);
        Log.d(TAG, "serailizeUserSample: json file" + json);
    }

    private void deserializeUserSample() {

        String userJsonfile = "{'age': 26, 'email': 'smkbyt@gmail.com', 'isdeveloper': true, 'name': 'jwngma'}";

        Gson gson = new Gson();
        UserSample userSample = gson.fromJson(userJsonfile, UserSample.class);
    }

    private void NestedSerialize() {
        UserAdress userAdress = new UserAdress("Nh 47 kajalgaon", "hosue no. 45", "kajalgaon", "India");
        UserNested userNested = new UserNested("jwngma", "smkbtyy@gmai.com", 34, true, userAdress);


        Gson gson= new Gson();
        String nestedjson=gson.toJson(userNested);
        Log.d(TAG, "NestedSerialize: nestedjson"+nestedjson);
        tvv.setText(nestedjson);
    }

    private void NestedDeserialize() {
    }

}
