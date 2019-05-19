package com.chat.gson.Gsonparser;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chat.gson.Gsonparser.Models.MovieModel;
import com.chat.gson.R;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GsonParserActivity extends AppCompatActivity {
    private static final String TAG = "GsonParserActivity";

    private Button parserbtn;
    private TextView tv_parsed;
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson_parser);
        initParse();
    }

    private void initParse() {
        parserbtn = findViewById(R.id.parseBtn);
        tv_parsed = findViewById(R.id.tv_parsed);

        parserbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSONtask().execute("https://pixabay.com/images/search/cat/");

            }
        });
    }

    public class JSONtask extends AsyncTask<String, String,  List<MovieModel>> {

        @Override
        protected  List<MovieModel> doInBackground(String... strings) {
            try {
                URL url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.connect();
                InputStream inputStream = urlConnection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuffer buffer = new StringBuffer();

                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }

                String finalJson = buffer.toString();

                StringBuffer stringBufferData = new StringBuffer();

                JSONObject parentObject = new JSONObject(finalJson);
                JSONArray jsonArray = parentObject.getJSONArray("movies");

                List<MovieModel>movieModelList= new ArrayList<>();

                for (int i = 0; i < jsonArray.length(); i++) {

                    JSONObject finalObject = jsonArray.getJSONObject(i);
                    MovieModel movieModel = new MovieModel();
                    movieModel.setName("name");
                    movieModel.setYear("year");
                    movieModel.setTagline("tagline");
                    movieModel.setStory("story");
                    movieModel.setRating("ratings");
                    movieModel.setImage("image");
                    movieModel.setDuration("duration");

                    List<MovieModel.Cast> castList = new ArrayList<>();
                    for (int j = 0; i < finalObject.getJSONArray("cast").length(); j++) {
                        MovieModel.Cast cast = new MovieModel.Cast();
                        cast.setName(finalObject.getJSONArray("cast").getJSONObject(j).getString("name"));
                        castList.add(cast);
                    }

                    movieModel.setCastList(castList);
                    movieModelList.add(movieModel);
                }
                return movieModelList;
                //return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }

                try {
                    if (reader != null) {
                        reader.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute( List<MovieModel> result_String) {
            super.onPostExecute(result_String);

        }
    }
}
