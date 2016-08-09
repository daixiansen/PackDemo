package daixiansen.packdemo;

import android.app.Application;

import com.mcxiaoke.packer.helper.PackerNg;
import com.umeng.analytics.AnalyticsConfig;

/**
 * Description ${TODO}
 * Author daiyongxin
 * Date   2016/8/9 10:05
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        // 如果没有使用PackerNg打包添加渠道，默认返回的是""
    // com.mcxiaoke.packer.helper.PackerNg
        final String market = PackerNg.getMarket(this);
    // 或者使用 PackerNg.getMarket(Context,defaultValue)
    // 之后就可以使用了，比如友盟可以这样设置
        AnalyticsConfig.setChannel(market);
    }
}
