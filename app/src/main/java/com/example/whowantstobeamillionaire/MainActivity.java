package com.example.whowantstobeamillionaire;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Amount at the beginning of the question
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        //checks if the user has clicked a radio button and whether the answer is correct or not
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            //correct answer
            case R.id.radio_btn1a:
                if (checked) {
                    count += 1000;
                    Toast toastCorrect = Toast.makeText(MainActivity.this, "+1000 Total= $1,000 ", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(MainActivity.this, question2.class));
                }
                break;
            //incorrect answer
            case R.id.radio_btn1b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(MainActivity.this, lost.class));
                }
                break;
            //incorrect answer
            case R.id.radio_btn1c:
                if (checked) {
                    Toast toastWrong = Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(MainActivity.this, lost.class));
                }
                break;
            //incorrect answer
            case R.id.radio_btn1d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(MainActivity.this, lost.class));
                }
                break;
        }
    }
}