package com.google.ads.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ak;
import com.google.ads.al;
import com.google.ads.bt;
import com.google.ads.e;
import com.google.ads.e.a;
import com.google.ads.e.aa;
import com.google.ads.e.af;
import com.google.ads.e.ag;
import com.google.ads.e.i;
import com.google.ads.e.q;
import java.util.HashMap;
import java.util.Map;

public class ad extends WebViewClient
{
  private static final h c = (h)h.a.b();
  protected w a;
  protected boolean b;
  private final Map d;
  private final boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;

  public ad(w paramw, Map paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramw;
    this.d = paramMap;
    this.e = paramBoolean1;
    this.g = paramBoolean2;
    this.b = false;
    this.h = false;
    this.i = false;
  }

  public static ad a(w paramw, Map paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (a.a >= 11)
      return new aa(paramw, paramMap, paramBoolean1, paramBoolean2);
    return new ad(paramw, paramMap, paramBoolean1, paramBoolean2);
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public boolean a()
  {
    return this.f;
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public void d(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    this.f = false;
    if (this.h)
    {
      n localn = this.a.j();
      if (localn == null)
        break label53;
      localn.b();
    }
    while (true)
    {
      this.h = false;
      if (this.i)
      {
        c.a(paramWebView);
        this.i = false;
      }
      return;
      label53: i.a("adLoader was null while trying to setFinishedLoadingHtml().");
    }
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    this.f = true;
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.f = false;
    n localn = this.a.j();
    if (localn != null)
      localn.a(e.c);
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    try
    {
      i.a("shouldOverrideUrlLoading(\"" + paramString + "\")");
      localUri1 = Uri.parse(paramString);
      if (c.a(localUri1))
      {
        c.a(this.a, this.d, localUri1, paramWebView);
        return true;
      }
      if (this.g)
      {
        if (a.a(localUri1))
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        HashMap localHashMap2 = new HashMap();
        localHashMap2.put("u", paramString);
        AdActivity.a(this.a, new x("intent", localHashMap2));
        return true;
      }
      boolean bool = this.e;
      if (bool)
      {
        try
        {
          bt localbt = this.a.h();
          Context localContext = (Context)localbt.f.a();
          ak localak = (ak)localbt.s.a();
          if ((localak == null) || (!localak.a(localUri1)))
            break label302;
          Uri localUri3 = localak.a(localUri1, localContext);
          localUri2 = localUri3;
          HashMap localHashMap1 = new HashMap();
          localHashMap1.put("u", localUri2.toString());
          AdActivity.a(this.a, new x("intent", localHashMap1));
          return true;
        }
        catch (al localal)
        {
          i.e("Unable to append parameter to URL: " + paramString);
        }
      }
      else
      {
        i.e("URL is not a GMSG and can't handle URL: " + paramString);
        return true;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Uri localUri1;
        i.d("An unknown error occurred in shouldOverrideUrlLoading.", localThrowable);
        continue;
        label302: Uri localUri2 = localUri1;
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.ad
 * JD-Core Version:    0.6.2
 */