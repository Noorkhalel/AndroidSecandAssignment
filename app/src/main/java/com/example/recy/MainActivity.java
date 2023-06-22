package com.example.recy;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        QuestionAnswer Q = new QuestionAnswer();
        int  n  = Q.question.length;
        dataList = new ArrayList<>();

        dataList.add("158=___ + 106. What number will come in the blank to make the number sentence correct?:" +
                "\n A)52   B)152   C)158   D)264");
        dataList.add("The simplest form of 16/24 is:"+
                "\n A)3/5   B)2/3   C)2/5   D)1/3");
        dataList.add("Which of these lies between 6.3 and 6.6?"+
                "\n A)6.2   B)6.9   C)6.05   D)6.41");
        dataList.add("Which of the following is true?"+
                "\n A)20 + 0 = 20   B)20 - 0 = 0   C)20 - 20 - 0 = 20   D)20 * 0 = 200");
        dataList.add("Which number means we have nothing?"
                +"\n A)0   B)1   C)3   D)99");
        dataList.add("What number follows 5?"+
                "\n A)6   B)5   C)4   D)0");

        adapter = new MyAdapter(this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
