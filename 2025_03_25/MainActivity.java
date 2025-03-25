package com.example.dice;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    private Random random= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    imageView=findViewById(R.id.Dice1);
    imageView=findViewById(R.id.Dice2);
    }public void RollDice(View view){
        int DIceNumber=random.nextInt(5)+1;
        int DiceNumber2=random.nextInt(5)+1;
        if(DIceNumber == 1){
           imageView.setImageResource(R.drawable.one);
           imageView=findViewById(R.id.Dice1);
        }
        if(DIceNumber==2){
            imageView.setImageResource(R.drawable.two);
            imageView=findViewById(R.id.Dice1);
        }
        if(DIceNumber==3){
            imageView.setImageResource(R.drawable.three);
            imageView=findViewById(R.id.Dice1);
        }
        if(DIceNumber==4){
            imageView.setImageResource(R.drawable.four);
            imageView=findViewById(R.id.Dice1);
        }
        if(DIceNumber==5){
            imageView.setImageResource(R.drawable.five);
            imageView=findViewById(R.id.Dice1);
        }
        if(DIceNumber==6){
            imageView.setImageResource(R.drawable.six);
            imageView=findViewById(R.id.Dice1);
        }
        //////////////////////////////

        if(DiceNumber2 == 1){
            imageView.setImageResource(R.drawable.one);
            imageView=findViewById(R.id.Dice2);
        }
        if(DiceNumber2==2){
            imageView.setImageResource(R.drawable.two);
            imageView=findViewById(R.id.Dice2);
        }
        if(DiceNumber2==3){
            imageView.setImageResource(R.drawable.three);
            imageView=findViewById(R.id.Dice2);
        }
        if(DiceNumber2==4){
            imageView.setImageResource(R.drawable.four);
            imageView=findViewById(R.id.Dice2);
        }
        if(DiceNumber2==5){
            imageView.setImageResource(R.drawable.five);
            imageView=findViewById(R.id.Dice2);
        }
        if(DiceNumber2==6){
            imageView.setImageResource(R.drawable.six);
            imageView=findViewById(R.id.Dice2);
        }


    }
}