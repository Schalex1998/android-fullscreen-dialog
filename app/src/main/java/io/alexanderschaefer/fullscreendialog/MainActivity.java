package io.alexanderschaefer.fullscreendialog;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton button = findViewById(R.id.button);
        button.setOnClickListener(v -> openDialog());
    }

    private void openDialog() {
        ExampleDialog.display(getSupportFragmentManager());
    }
}
