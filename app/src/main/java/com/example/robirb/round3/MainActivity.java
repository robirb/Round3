package com.example.robirb.round3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;



public class MainActivity extends AppCompatActivity {
    MyButton myButton;
    RobiAdapter adapter;
    Student[] students = new Student[10];

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initItem();

        adapter = new RobiAdapter(this,students);

        recyclerView= (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        //myButton=new MyButton(this);

        //root.addView(myButton);
    }

    private void initItem() {

        Student student = new Student("Sohel Ahmed","sohel.ahmed2189@gmail.com","01700000000",32);
        Student student1 = new Student("Rasel Rana","raselrana@gmail.com","01911111111",43);
        Student student2 = new Student("Sakib Ahmed","Sakibahmedf@gmail.com","01899999999",23);
        Student student3 = new Student("Luki Ahmed","Lukiahmed@gmail.com","01741888888",51);
        Student student4 = new Student("Kiron Ahmed","Kironahmedfg@gmail.com","01199111111",64);
        Student student5 = new Student("linka Ahmed","Linkaahmed@gmail.com","01678912345",37);
        Student student6 = new Student("Ero Ahmed","Eroahmed@gmail.com","01551467432",28);
        Student student7 = new Student("Heri Ahmed","Heriahmed@gmail.com","01987456213",30);
        Student student8 = new Student("Sakil Ahmed","Sakilahmed@gmail.com","01783425679",22);
        Student student9 = new Student("Jori Ahmed","Joriahmed@gmail.com","01741888888",68);

        students[0]=student;
        students[1]=student1;
        students[2]=student2;
        students[3]=student3;
        students[4]=student4;
        students[5]=student5;
        students[6]=student6;
        students[7]=student7;
        students[8]=student8;
        students[9]=student9;


    }
}
