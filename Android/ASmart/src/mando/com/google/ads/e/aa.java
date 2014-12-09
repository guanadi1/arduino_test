package com.google.ads.e;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.ads.b.ad;
import com.google.ads.b.n;
import com.google.ads.b.w;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class aa extends ad
{
  public aa(w paramw, Map paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramw, paramMap, paramBoolean1, paramBoolean2);
  }

  private static WebResourceResponse a(String paramString, Context paramContext)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
    try
    {
      a.a(localHttpURLConnection, paramContext.getApplicationContext());
      localHttpURLConnection.connect();
      WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(a.a(new InputStreamReader(localHttpURLConnection.getInputStream())).getBytes("UTF-8")));
      return localWebResourceResponse;
    }
    finally
    {
      localHttpURLConnection.disconnect();
    }
  }

  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    try
    {
      if ("mraid.js".equalsIgnoreCase(new File(paramString).getName()))
      {
        n localn = this.a.j();
        if (localn != null)
          localn.c(true);
        while (true)
        {
          localbs = (bs)((br)this.a.h().d.a()).b.a();
          if (this.a.h().b())
            break label215;
          if (!this.b)
            break;
          String str3 = (String)localbs.f.a();
          i.a("shouldInterceptRequest(" + str3 + ")");
          return a(str3, paramWebView.getContext());
          this.a.a(true);
        }
      }
    }
    catch (IOException localIOException)
    {
      bs localbs;
      i.d("IOException fetching MRAID JS.", localIOException);
      return super.shouldInterceptRequest(paramWebView, paramString);
      String str2 = (String)localbs.e.a();
      i.a("shouldInterceptRequest(" + str2 + ")");
      return a(str2, paramWebView.getContext());
      String str1 = (String)localbs.g.a();
      i.a("shouldInterceptRequest(" + str1 + ")");
      WebResourceResponse localWebResourceResponse = a(str1, paramWebView.getContext());
      return localWebResourceResponse;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        label215: i.d("An unknown error occurred fetching MRAID JS.", localThrowable);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.aa
 * JD-Core Version:    0.6.2
 */