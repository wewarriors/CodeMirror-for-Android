package com.example.wewarriors.library.utils;

import android.util.Log;



public class HtmlPage {

    private static final String TAG = "HtmlPage";

    public static String GetPage(String mode, String theme, String language,
                                 boolean isShowNumber, boolean isLineWrapping,
                                 boolean isFoldGutter, String code){

        StringBuilder builder=new StringBuilder("<script>\n");
        builder.append("var config = {};\n");
        if (mode!=null){
            builder.append("config.mode ="+"\"").append(mode).append("\""+";\n");
        }


        builder.append("config.inputStyle=\"contenteditable\";");
        if (theme!=null){
            builder.append("config.theme="+"\"").append(theme).append("\""+";");
        }
        builder.append("config.lineNumbers =").append(isShowNumber).append(";\n");
        builder.append("config.matchBrackets = true;\n");
        builder.append("config.lineWrapping =").append(isLineWrapping).append(";\n");
        //builder.append("config.spellcheck = true;\n");
        if (isFoldGutter){
            builder.append("config.foldGutter = true;\n");
            builder.append("config.gutters = [\"CodeMirror-linenumbers\", \"CodeMirror-foldgutter\"];");
        }

        /*builder.append("config.lineNumbers =").append(mShowNumber).append(";");
        builder.append("config.lineNumbers =").append(mShowNumber).append(";");
        builder.append("config.lineNumbers =").append(mShowNumber).append(";");*/

        builder.append("var editor = CodeMirror.fromTextArea(document.getElementById(\"code\"), config); \n");
        builder.append("</script>\n");
        Log.e("TAG",builder.toString());
        return createPageHeader(theme, language)+generateTextarea(code)+builder.toString();
    }

    private static String createPageHeader(String theme, String language) {
        return "<!doctype html>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<link rel=stylesheet href=\"./codemirror/lib/codemirror.css\">\n" +
                "<script src=\"./codemirror/lib/codemirror.js\"></script>\n" +

                "<script src=\"./codemirror/mode/"+language+".js\"></script>\n" +


                "<link rel=\"stylesheet\" href=\"./codemirror/theme/"+theme+".css\">\n" +
                "<link rel=\"stylesheet\" href=\"./codemirror/addon/fold/foldgutter.css\">\n" +
                "<script src=\"./codemirror/addon/fold/foldcode.js\"></script>\n" +
                "<script src=\"./codemirror/addon/fold/foldgutter.js\"></script>\n" +
                "<script src=\"./codemirror/addon/fold/brace-fold.js\"></script>\n" +
                "<script src=\"./codemirror/addon/fold/comment-fold.js\"></script>\n" +
                "<script src=\"./codemirror/addon/fold/indent-fold.js\"></script>\n" +
                "<script src=\"./codemirror/addon/fold/markdown-fold.js\"></script>\n" +
                "<script src=\"./codemirror/addon/fold/xml-fold.js\"></script>\n" +
                "\n" +
                "<style type=\"text/css\">\n" +
                "  body {\n" +
                "    width: 100%;\n" +
                "    height: 100%;\n" +
                "    margin: 0;\n" +
                "    padding: 0;\n" +
                "    font-size: 12px;\n" +
                "  }\n" +
                "  .CodeMirror {\n" +
                "    height: auto;\n" +
                "    overflow-y: hidden;\n" +
                "    overflow-x: hidden;\n" +
                "    line-height: 1.4em;\n" +
                "  }\n" +
                "  .CodeMirror-scroll {\n" +
                "    overflow-y: hidden;\n" +
                "    overflow-x: auto;\n" +
                "  }\n" +
                "</style>";
    }



    private static String generateTextarea(String code){
        return "<body>\n" +
                "<textarea id=code>" +
                code
                + "</textarea>" +
                "</body>";

        /*return "<body>\n" +
                "<textarea id=code>\n" +
                "<link rel=\"stylesheet\" href=\"lib/codemirror.css\">\n" +
                "<script src=\"lib/codemirror.js\"></script>\n" +
                "<script>\n" +
                "  var editor = CodeMirror.fromTextArea(myTextarea, {\n" +
                "    lineNumbers: true\n" +
                "  });\n" +
                "</script>      \n" +
                "  </textarea>\n" +
                "</body>";*/
    }

    private static String generateCodeMirrorEditor(){

        return "<script>\n" +
                "    var config = {};\n" +
                "    config.mode = \"text/html\";\n" +
                "    config.lineNumbers = false;\n" +
                "    config.matchBrackets = true;\n" +
                "    config.lineWrapping = false;\n" +
                "    config.foldGutter = true;\n" +
                "    config.gutters = [\"CodeMirror-linenumbers\", \"CodeMirror-foldgutter\"];\n" +
                "\n" +
                "    var editor = CodeMirror.fromTextArea(document.getElementById(\"code\"), config);\n" +
                "</script>";
        /*StringBuilder builder=new StringBuilder("<script> var config = {};");
        builder.append("config.mode =").append(mode).append(";");
        builder.append("config.lineNumbers =").append(isShowNumber).append(";");
        builder.append("config.matchBrackets = true;");
        builder.append("config.lineWrapping =").append(isLineWrapping).append(";");
        builder.append("config.spellcheck = true;");
        if (isFoldGutter){
            builder.append("config.foldGutter = true;");
            builder.append("config.gutters = [\"CodeMirror-linenumbers\", \"CodeMirror-foldgutter\"]");
        }

        *//*builder.append("config.lineNumbers =").append(mShowNumber).append(";");
        builder.append("config.lineNumbers =").append(mShowNumber).append(";");
        builder.append("config.lineNumbers =").append(mShowNumber).append(";");*//*

        builder.append("var editor = CodeMirror.fromTextArea(document.getElementById(\"code\"), config);");
        builder.append("</script>");
        return builder.toString();*/
    }

}
