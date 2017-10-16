package com.example.wewarriors.library.models;

/*******************************
 * Created by liuqiang      
 *******************************
 * data: 2017/8/22  
 ********************************/

public enum Mode {
    C("text/x-csrc"),
    CPlus("text/x-c++src"),
    CSharp("text/x-csharp"),
    CMake("text/x-cmake"),
    CSS("text/css"),
    GO("text/x-go"),
    HTML("text/html"),
    Java("text/x-java"),
    JavaScript("text/javascript\", " +
            "\"text/ecmascript\",\"application/javascript\", " +
            "\"application/x-javascript\",\"application/ecmascript"),
    JSON("application/json\", \"application/x-json"),
    Kotlin("text/x-kotlin"),
    MySQL("text/x-mysql"),
    ObjectiveC("text/x-objectivec"),
    PHP("application/x-httpd-php"),
    Python("text/x-python"),
    R("text/x-rsrc"),
    Shell("text/x-sh"),
    SQL("text/x-sql"),
    SQLite("text/x-sqlite"),
    Swift("text/x-swift"),
    Verilog("text/x-verilog"),
    VHDL("text/x-vhdl"),
    XML("application/xml\", \"text/xml");
    
    private final String ModeName;

    Mode(String ModeName) {
        this.ModeName = ModeName;
    }

    public String getName() {
        return  ModeName;
    }
}
