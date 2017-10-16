package com.example.wewarriors.library.models;

/*******************************
 * Created by liuqiang      
 *******************************
 * data: 2017/8/22  
 ********************************/

public enum Theme {

    DRACULA("dracula"),
    SOLARIZED("solarized"),
    ECLIPSE("eclipse"),
    MIDNIGHT("midnight"),
    NIGHT("night"),
    SETI("seti"),
    TOMORROW_NIGHT_BRIGHT("tomorrow-night-bright"),
    TOMORROW_NIGHT_EIGHTIES("tomorrow-night-eighties");


    private final String themeName;

    Theme(String themeName) {
        this.themeName = themeName;
    }

    public String getName() {
        return  themeName;
    }

}