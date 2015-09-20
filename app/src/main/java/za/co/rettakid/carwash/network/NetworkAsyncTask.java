package za.co.rettakid.carwash.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

/**
 * Created by Lwazi Prusent on 2015/09/20.
 */
public abstract class NetworkAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    protected Context context;

    public NetworkAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected Result doInBackground(Params... params) {
        onFailure();
        return null;
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        onFailure();
    }

    protected abstract void onFailure();

    protected void checkNetworkConnection() {
        ConnectivityManager connMgr = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo == null || !networkInfo.isConnected()) {
            onFailure();
        }
    }

}
