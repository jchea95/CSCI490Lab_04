package com.example.juliechea.csci490_lab_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlList("https://jsonplaceholder.typicode.com/users");


    }
    private String urlList(String link){

        URL url;
        URLConnection connection;
        InputStreamReader in;
        BufferedReader reader;

        try {
            url = new URL("https://jsonplaceholder.typicode.com/users");
            connection = url.openConnection();
            in = new InputStreamReader(connection.getInputStream());
            reader = new BufferedReader(in);
            link = reader.readLine();
            Log.i("link", "contents");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return link;
    }

}
