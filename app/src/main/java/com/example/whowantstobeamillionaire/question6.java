package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question6 extends AppCompatActivity {

    public int count = 50000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn6a:
                if (checked) {
                    count += 25000;
                    Toast toastCorrect = Toast.makeText(question6.this, "+25000 Total= $75,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question6.this, question7.class));
                }
                break;
            case R.id.radio_btn6b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question6.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question6.this, lost.class));
                }
                break;
            case R.id.radio_btn6c:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question6.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question6.this, lost.class));
                }
                break;
            case R.id.radio_btn6d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question6.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question6.this, lost.class));
                }
                break;
        }
    }
}
