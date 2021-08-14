package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class temperateur extends AppCompatActivity {

    TextView resultat;
    EditText temp;
    double nbr;
    int choix = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperateur);
        resultat = (TextView)findViewById(R.id.resultat);
        temp = (EditText)findViewById(R.id.temp);
    }
    public  void auClic(View view)
    {
        nbr = Float.parseFloat(temp.getText().toString());
        if(choix == 1)
        {
            nbr =  0.555555556*(nbr-32);
        }
        else{
            nbr = 1.8*nbr+32;
        }
        String message = String.valueOf(nbr) ;

        resultat.setText(message);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.btn1:
                if (checked)
                    choix = 1;
                break;
            case R.id.btn2:
                if (checked)
                    choix = 2;
                break;
        }
    }
}