package com.google.ads.b;

import android.webkit.WebView;
import com.google.ads.ba;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.e.af;

class p
  implements Runnable
{
  p(n paramn, ba paramba)
  {
  }

  public void run()
  {
    if (n.d(this.b) != null)
    {
      n.d(this.b).stopLoading();
      n.d(this.b).destroy();
    }
    ((w)((bt)n.b(this.b).a.a()).b.a()).a(n.e(this.b));
    if (n.f(this.b) != null)
      ((ac)((bt)n.b(this.b).a.a()).g.a()).b(n.f(this.b));
    ((w)((bt)n.b(this.b).a.a()).b.a()).a(this.a);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.p
 * JD-Core Version:    0.6.2
 */