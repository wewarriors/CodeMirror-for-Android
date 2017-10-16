package com.example.wewarriors.library.models;

/**
 * Created by wewarriors on 2017/10/15.
 */

public enum Language {
    C("clike/clike"),
    CPlus("clike/clike"),
    CSharp("clike/clike"),
    CMake("cmake/cmake"),
    CSS("css/css"),
    GO("go/go"),
    HTML("htmlmixed/htmlmixed"),
    Java("clike/clike"),
    JavaScript("javascript/javascript"),
    JSON("javascript/javascript"),
    Kotlin("clike/clike"),
    MySQL("sql/sql"),
    ObjectiveC("clike/clike"),
    PHP("php/php"),
    Python("python/python"),
    R("r/r"),
    Shell("shell/shell"),
    SQL("sql/sql"),
    SQLite("sql/sql"),
    Swift("swift/swift"),
    Verilog("verilog/verilog"),
    VHDL("vhdl/vhdl"),
    XML("xml/xml");

    private final String Language;

    Language(String Language) {
        this.Language = Language;
    }

    public String getName() {
        return Language;
    }
}
