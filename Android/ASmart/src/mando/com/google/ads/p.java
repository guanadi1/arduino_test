package com.google.ads;

import com.google.ads.b.w;
import com.google.ads.e.i;
import java.lang.ref.WeakReference;

public class p
  implements Runnable
{
  private WeakReference a;

  public p(w paramw)
  {
    this.a = new WeakReference(paramw);
  }

  public void run()
  {
    w localw = (w)this.a.get();
    if (localw == null)
    {
      i.a("The ad must be gone, so cancelling the refresh timer.");
      return;
    }
    localw.x();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.p
 * JD-Core Version:    0.6.2
 */