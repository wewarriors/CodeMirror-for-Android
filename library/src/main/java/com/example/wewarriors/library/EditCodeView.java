package com.example.wewarriors.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.wewarriors.library.models.Language;
import com.example.wewarriors.library.models.Mode;
import com.example.wewarriors.library.models.Theme;
import com.example.wewarriors.library.utils.FileUtils;
import com.example.wewarriors.library.utils.HtmlPage;

import java.io.File;

/**
 * Created by wewarriors on 2017/10/16.
 */

public class EditCodeView extends WebView{
    private static final String TAG = "EditCodeView";


    private boolean mShowNumber = true;
    private boolean mLineWrapping = false;
    private boolean mReadOnly = false;
    private boolean mFoldGutter=true;

    private Language mLanguage = Language.Java;
    private Mode mMode= Mode.Java;
    private Theme mTheme = Theme.DRACULA;



    public EditCodeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public EditCodeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EditCodeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context);
    }

    private void initView(Context context) {
        //make sure the view is blank
        loadUrl("about:blank");
        //set the settings for the view
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        //disable zoom controls on +Honeycomb devices
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) settings.setDisplayZoomControls(false);
        //to remove padding and margin
        setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

    }


    public void setSource(String source) {
        if(source != null && !(source.length() == 0)) {
            //generate and load the content
            //this.content = source;
            String page = HtmlPage.GetPage(mMode.getName(), mTheme.getName(), mLanguage.getName(),
                    mShowNumber,mLineWrapping,mFoldGutter,source);
            Log.i(TAG, "setSource: "+page);
            loadDataWithBaseURL("file:///android_asset/", page, "text/html", "utf-8", null);
            //notify the callback (if set)
        } else Log.e(getClass().getSimpleName(), "Source can't be null or empty.");
    }

    /**
     * Set the source to highlight from a File
     * @param source - The source as {@linkplain File}
     */
    public void setSource(File source) {
        //try to encode and set the source
        String encSource = FileUtils.loadSourceFromFile(source);
        if(encSource == null) {
            Log.e(getClass().getSimpleName(), "Unable to encode file: " + source.getAbsolutePath());
        } else setSource(encSource);
    }

    public Language getmLanguage() {
        return mLanguage;
    }

    public void setmLanguage(Language mLanguage) {
        this.mLanguage = mLanguage;
    }

    public Mode getmMode() {
        return mMode;
    }

    public void setmMode(Mode mMode) {
        this.mMode = mMode;
    }

    public Theme getmTheme() {
        return mTheme;
    }

    public void setmTheme(Theme mTheme) {
        this.mTheme = mTheme;
    }

}
