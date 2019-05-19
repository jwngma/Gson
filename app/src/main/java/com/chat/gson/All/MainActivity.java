package com.chat.gson.All;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import com.chat.gson.All.EMployeee;
import com.chat.gson.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);


        Gson gson= new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        EMployeee eMployeee = new EMployeee("jwngma basumatary", 12, "lapsqd8mx5", "smkbty@gmail.com");
        String json_result = gson.toJson(eMployeee);
        Log.d(TAG, "onCreate: json_result"+json_result);
        tv1.setText(json_result);







        /*Address address;
        address = new Address("germany", "delhi");
        List<familyMember> family = new ArrayList<>();
        family.add(new familyMember("wide", 30));
        family.add(new familyMember("gather", 400));
        family.add(new familyMember("ddd", 400));
        family.add(new familyMember("ddds", 45));
        family.add(new familyMember("sfd", 555));
        family.add(new familyMember("dddd", 22));


        *//* java to gson format*//*

        Employee employee = new Employee("jwngma", "smkbty@gmail.com", 22, address, family);
        String json = gson.toJson(employee);
        Log.d(TAG, "onCreate: " + json);
        tv1.setText(json);
*/
//         java to gson format

        /* *//* from json to java file*//*
        String json = "{\"age\":22,\"email\":\"smkbty2gmail.com\",\"name\":\"jwngma\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        Log.d(TAG, "onCreate: employee" + employee);
        *//* from json to java file*/
    }

}
