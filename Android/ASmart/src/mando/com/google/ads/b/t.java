package com.google.ads.b;

import android.webkit.WebView;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.e.af;
import com.google.ads.e.ag;

class t
  implements Runnable
{
  private final String b;
  private final String c;
  private final WebView d;

  public t(n paramn, WebView paramWebView, String paramString1, String paramString2)
  {
    this.d = paramWebView;
    this.b = paramString1;
    this.c = paramString2;
  }

  public void run()
  {
    n.b(this.a).c.a(Boolean.valueOf(n.a(this.a)));
    ((w)((bt)n.b(this.a).a.a()).b.a()).k().a(n.a(this.a));
    a locala;
    if (((bt)n.b(this.a).a.a()).e.a() != null)
    {
      locala = (a)((bt)n.b(this.a).a.a()).e.a();
      if (n.a(this.a))
        break label157;
    }
    label157: for (boolean bool = true; ; bool = false)
    {
      locala.setOverlayEnabled(bool);
      if (this.c == null)
        break;
      this.d.loadDataWithBaseURL(this.b, this.c, "text/html", "utf-8", null);
      return;
    }
    this.d.loadUrl(this.b);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.t
 * JD-Core Version:    0.6.2
 */