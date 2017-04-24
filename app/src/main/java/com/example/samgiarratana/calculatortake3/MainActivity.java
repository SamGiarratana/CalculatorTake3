package com.example.samgiarratana.calculatortake3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView result;

    private double valOne;
    private double valTwo;

    private boolean isAdding, isSubtracting, isMultiplying, isDividing;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result.setText("");
        valOne = 0;
        valTwo = 0;
    }

    //FirstRow
    public void clearClicked(View v)
    {
        if(valOne != 0 && result.getText().toString() != "")
        {
            valTwo = 0;
            result.setText("");
        }
        else if (valTwo == 0 && result.getText().toString() != "")
        {
            valOne = 0;
            result.setText("");
            isAdding = false;
            isSubtracting = false;
            isMultiplying = false;
            isDividing = false;
        }
    }

    public void negativeClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText("-" + result.getText());
    }

    public void percentClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        divide(valOne, 100);
    }

    public void divideClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        valOne = Double.parseDouble(result.getText().toString());
        result.setText("");
        isAdding = false;
        isSubtracting = false;
        isMultiplying = false;
        isDividing = true;
    }

    //Second Row
    public void sevenClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "7");
    }

    public void eightClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "8");
    }

    public void nineClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "9");
    }

    public void multiplyClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        valOne = Double.parseDouble(result.getText().toString());
        result.setText("");
        isAdding = false;
        isSubtracting = false;
        isMultiplying = true;
        isDividing = false;
    }

    //Third Row
    public void fourClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "4");
    }

    public void fiveClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "5");
    }

    public void sixClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "6");
    }

    public void subtractClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        valOne = Double.parseDouble(result.getText().toString());
        result.setText("");
        isAdding = false;
        isSubtracting = true;
        isMultiplying = false;
        isDividing = false;
    }

    //Fourth Row
    public void oneClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "1");
    }

    public void twoClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "2");
    }

    public void threeClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "3");
    }

    public void addClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        valOne = Double.parseDouble(result.getText().toString());
        result.setText("");
        isAdding = true;
        isSubtracting = false;
        isMultiplying = false;
        isDividing = false;
    }

    //Fifth Row
    public void zeroClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "0");
    }

    public void decimalClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + ".");
    }

    public void equalsClicked(View v)
    {
        result = (TextView) findViewById(R.id.result_text);
        valTwo = Double.parseDouble(result.getText().toString());
        result.setText("");
        if (isAdding)
            add();
        else if (isSubtracting)
            subtract();
        else if (isMultiplying)
            multiply();
        else if (isDividing)
            divide(valOne, valTwo);
        isAdding = false;
        isSubtracting = false;
        isMultiplying = true;
        isDividing = false;
    }

    //Mathematics
    public void divide(double num, double denom)
    {
        double solution = num / denom;
        result.setText(Double.toString(solution));
        valOne = solution;
    }

    public void multiply()
    {
        double solution = valOne * valTwo;
        result.setText(Double.toString(solution));
        valOne = solution;
    }

    public void subtract()
    {
        double solution = valOne - valTwo;
        result.setText(Double.toString(solution));
        valOne = solution;
    }

    public void add()
    {
        double solution = valOne + valTwo;
        result.setText(Double.toString(solution));
        valOne = solution;
    }
}
