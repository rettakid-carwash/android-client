package za.co.rettakid.carwash.fragments;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import za.co.rettakid.carwash.R;
import za.co.rettakid.carwash.models.dto.NewsDto;
import za.co.rettakid.carwash.models.dto.NewsListDto;
import za.co.rettakid.carwash.network.NetworkAsyncTask;
import za.co.rettakid.carwash.network.NewsClient;

public class NewsListActivity extends BaseActivity {

    private LinearLayout contentList;
    private List<NewsDto> newsDtos;

    @Override
    protected void onBaseCreate() {
        setContentView(R.layout.activity_news_list);
        contentList = (LinearLayout)findViewById(R.id.news_list_content);
    }

    @Override
    protected void onStart() {
        super.onStart();
        getNews();
    }

    private void getNews()   {
        getProgressView().start();
        contentList.removeAllViews();
        newsDtos = new ArrayList<>();
        NetworkAsyncTask asyncTask = new NetworkAsyncTask<Object, Void, NewsListDto>(getBaseContext()) {

            @Override
            protected NewsListDto doInBackground(Object... params) {
                NewsClient newsClient = new NewsClient(getBaseContext());
                return newsClient.getNewss();
            }

            @Override
            protected void onFailure() {
                getProgressView().stop();
                Toast.makeText(getBaseContext(),"Connection Error",Toast.LENGTH_LONG).show();
            }

            @Override
            protected void onPostExecute(NewsListDto newsListDto) {
                newsDtos = newsListDto.getNewsList();
                for (NewsDto newsDto : newsDtos) {
                    addNewsItem(newsDto);
                }
                getProgressView().stop();
            }
        };

        asyncTask.execute();
    }

    private void addNewsItem(final NewsDto newsDto)  {
        final ViewGroup view = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.news_list_item, contentList, false);
        TextView txtHeading = (TextView)view.findViewById(R.id.news_item_header);
        TextView txtSubHeading = (TextView)view.findViewById(R.id.news_item_body);

        txtHeading.setText(newsDto.getNewsHeading());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        txtSubHeading.setText(simpleDateFormat.format(newsDto.getNewsDate()));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),NewsActivity.class);
                intent.putExtra("newsDto",newsDto);
                startActivity(intent);
            }
        });
        contentList.addView(view);
    }

}