package pagemanager.android.com.pagemanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import pagemanager.android.com.pagemanagerlibrary.PageManager;

public class MainActivity extends AppCompatActivity {

    private PageManager mPageManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PageManager.initInApp(this);
        mPageManager = PageManager.init(findViewById(R.id.rl_layout), new Runnable() {
            @Override
            public void run() {
                //mPageManager.showError("我是点了错误");
                Log.d("----","111111111111111111111111111");
            }
        });
        mPageManager.showError();
        findViewById(R.id.tv_loading).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPageManager.showLoading("我在家族");
                mPageManager.seLoadingLayoutParam();
            }
        });
        findViewById(R.id.tv_emtry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPageManager.showEmpty("我是空");
                mPageManager.setEmptyLayoutParam();

            }
        });
        findViewById(R.id.tv_retry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPageManager.showError("我是错误");
            }
        });
        findViewById(R.id.tv_content).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPageManager.showContent();
            }
        });
    }
}
