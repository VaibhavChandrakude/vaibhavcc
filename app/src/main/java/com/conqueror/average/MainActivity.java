package com.conqueror.average;

import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public void clickBut(View veiw) {
        EditText tQ = (EditText) findViewById(R.id.tQ);
        String intialQua = tQ.getText().toString();
        Double Val1 = Double.parseDouble(intialQua);

        EditText iA = (EditText) findViewById(R.id.iA);
        String intialAver = iA.getText().toString();
        Double Val2 = Double.parseDouble(intialAver);

        EditText nQ = (EditText) findViewById(R.id.nQ);
        String newQua = nQ.getText().toString();
        Double Val3 = Double.parseDouble(newQua);

        EditText pP = (EditText) findViewById(R.id.pP);
        String presentP = pP.getText().toString();
        Double Val4 = Double.parseDouble(presentP);



        Double A1 = ((Val1 * Val2) + (Val3 * Val4)) / (Val1 + Val3);

        String  toastText =  A1.toString();

        




        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        closekey();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void closekey() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}