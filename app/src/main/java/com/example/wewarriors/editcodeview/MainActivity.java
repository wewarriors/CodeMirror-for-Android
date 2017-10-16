package com.example.wewarriors.editcodeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wewarriors.library.EditCodeView;

public class MainActivity extends AppCompatActivity {
    EditCodeView editCodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editCodeView = (EditCodeView) findViewById(R.id.editcodeview);
        editCodeView.setSource("public enum Theme {\n" +
                "\n" +
                "    DRACULA(\"dracula\"),\n" +
                "    SOLARIZED(\"solarized\"),\n" +
                "    TOMORROW_NIGHT_BRIGHT(\"tomorrow-night-bright\"),\n" +
                "    TOMORROW_NIGHT_EIGHTIES(\"tomorrow-night-eighties\");\n" +
                "\n" +
                "    private final String themeName;\n" +
                "\n" +
                "    Theme(String themeName) {\n" +
                "        this.themeName = themeName;\n" +
                "    }\n" +
                "\n" +
                "    public String getName() {\n" +
                "        return themeName;\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
