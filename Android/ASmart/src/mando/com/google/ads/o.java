package com.google.ads;

import android.content.Context;
import com.google.ads.e.a;
import com.google.ads.e.i;
import java.net.HttpURLConnection;
import java.net.URL;

public class o
  implements Runnable
{
  private final Context a;
  private final String b;

  public o(String paramString, Context paramContext)
  {
    this.b = paramString;
    this.a = paramContext;
  }

  protected HttpURLConnection a(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }

  public void run()
  {
    try
    {
      i.a("Pinging URL: " + this.b);
      HttpURLConnection localHttpURLConnection = a(new URL(this.b));
      try
      {
        a.a(localHttpURLConnection, this.a);
        localHttpURLConnection.setInstanceFollowRedirects(true);
        localHttpURLConnection.connect();
        int i = localHttpURLConnection.getResponseCode();
        if ((i < 200) || (i >= 300))
          i.e("Did not receive 2XX (got " + i + ") from pinging URL: " + this.b);
        return;
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
    }
    catch (Throwable localThrowable)
    {
      i.d("Unable to ping the URL: " + this.b, localThrowable);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.o
 * JD-Core Version:    0.6.2
 */