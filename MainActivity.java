
package com.example.elijah_calculator;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
   TextView textviewnumber1, textviewnumber2, display;
    EditText inputnumber1, inputnumber2;
    Button btnadd, btnsubtract, btnmultiply, btndivide, btnclear;
    
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
        
        
        textviewnumber1=findViewById(R.id.textviewnumber1);
        textviewnumber2=findViewById(R.id.textviewnumber2);
        display=findViewById(R.id.display);
        inputnumber1=findViewById(R.id.inputnumber1);
        inputnumber2=findViewById(R.id.inputnumber2);
        btnadd=findViewById(R.id.btnadd);
        btnsubtract=findViewById(R.id.btnsubtract);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivide);
        btnclear=findViewById(R.id.btnclear);
        
        
        btnadd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float num1 = Float.parseFloat(inputnumber1.getText().toString());
            float num2 = Float.parseFloat(inputnumber2.getText().toString());
                    
            float sum = num1 + num2;
            display.setText("The sum is " + sum);
                    
            
               Toast.makeText(getApplicationContext(), "The sum is " + sum, Toast.LENGTH_LONG).show();
                         
                    
                    
                    }
           
    });
        
   // 
        
        btnsubtract.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float num1 = Float.parseFloat(inputnumber1.getText().toString());
            float num2 = Float.parseFloat(inputnumber2.getText().toString());

            float difference = num1 - num2;
            display.setText("The difference is " + difference);
                    Toast.makeText(getApplicationContext(), "The difference is " + difference, Toast.LENGTH_LONG).show();
                    
                    }
           
    });
        //
         
        btnmultiply.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float num1 = Float.parseFloat(inputnumber1.getText().toString());
            float num2 = Float.parseFloat(inputnumber2.getText().toString());

            float product = num1 * num2;
            display.setText("The product is " + product);
                    Toast.makeText(getApplicationContext(), "The product is " + product, Toast.LENGTH_LONG).show();
                    
                    }
           
    });
        //
         
        
        btndivide.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float num1 = Float.parseFloat(inputnumber1.getText().toString());
            float num2 = Float.parseFloat(inputnumber2.getText().toString());

            float quotient = num1 / num2;
            display.setText("The quotient is " + quotient);
                    Toast.makeText(getApplicationContext(), "The quotient is " + quotient, Toast.LENGTH_LONG).show();
                    
                    }
           
    });
        //
         
 btnclear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            
                    inputnumber1.setText("");
                    inputnumber2.setText("");
                    display.setText("");
                    Toast.makeText(getApplicationContext(), "CLEAR", Toast.LENGTH_LONG).show();
                    
                    }
           
    });
        //
         
 
        

        
        
  }
}
