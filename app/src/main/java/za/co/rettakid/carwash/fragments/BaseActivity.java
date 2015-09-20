package za.co.rettakid.carwash.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.rey.material.widget.ProgressView;

import za.co.rettakid.carwash.R;

/**
 * Created by Lwazi Prusent on 2015/09/11.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private SlidingMenu menu;
    private Toolbar toolbar;
    private ProgressView progressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onBaseCreate();
        init();
    }

    protected abstract void onBaseCreate();

    private void init() {
        progressView = (ProgressView)findViewById(R.id.progress_view);
        progressView.stop();
        initToolbar();
        initMenu();
    }

    private void initToolbar()     {
        this.toolbar = (Toolbar)findViewById(R.id.tool_bar);
        this.toolbar.setTitle("");
        setSupportActionBar(this.toolbar);
    }

    private void initMenu()     {
        this.menu = new SlidingMenu(this);
        this.menu.setMode(SlidingMenu.LEFT);
        this.menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        this.menu.setFadeDegree(0.35f);
        this.menu.setShadowWidthRes(R.dimen.menu_shadow);
        this.menu.setShadowDrawable(R.drawable.shadow);
        this.menu.setBehindOffsetRes(R.dimen.menu_offset);
        this.menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        this.menu.setMenu(R.layout.menu);
    }

    /*menu events*/

    public void toggleMenu(View view) {
        this.menu.toggle();
    }

    public void openMenuNews(View view) {
        menu.showContent(false);
        Intent intent = new Intent(getBaseContext(), NewsListActivity.class);
        startActivity(intent);
    }

    public void openMenuServices(View view) {
        menu.showContent(false);
        Intent intent = new Intent(getBaseContext(), ServiceListActivity.class);
        startActivity(intent);
    }

    /*getters and setters*/

    public SlidingMenu getMenu() {
        return menu;
    }

    public void setMenu(SlidingMenu menu) {
        this.menu = menu;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public ProgressView getProgressView() {
        return progressView;
    }

    public void setProgressView(ProgressView progressView) {
        this.progressView = progressView;
    }
}
