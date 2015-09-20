package za.co.rettakid.carwash.fragments;

import android.databinding.DataBindingUtil;

import za.co.rettakid.carwash.R;
import za.co.rettakid.carwash.databinding.ActivityNewsBinding;
import za.co.rettakid.carwash.models.dto.NewsDto;
import za.co.rettakid.carwash.utils.binding.BindNews;

public class NewsActivity extends BaseActivity {

    private ActivityNewsBinding binding;

    @Override
    protected void onBaseCreate() {
        setContentView(R.layout.activity_news);
        NewsDto newsDto = (NewsDto)getIntent().getSerializableExtra("newsDto");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news);
        binding.setNews(BindNews.bindNews(newsDto));
    }

}
