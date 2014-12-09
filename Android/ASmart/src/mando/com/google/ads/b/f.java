package com.google.ads.b;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.google.ads.AdActivity;
import com.google.ads.e.a;
import com.google.ads.e.i;

class f
  implements DownloadListener
{
  f(e parame)
  {
  }

  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      AdActivity localAdActivity = this.a.i();
      if ((localAdActivity != null) && (a.a(localIntent, localAdActivity)))
        localAdActivity.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      i.a("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
      return;
    }
    catch (Throwable localThrowable)
    {
      i.b("Unknown error trying to start activity to view URL: " + paramString1, localThrowable);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.f
 * JD-Core Version:    0.6.2
 */