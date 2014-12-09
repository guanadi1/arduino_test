package com.google.ads.b;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.e.af;
import com.google.ads.e.i;
import java.lang.ref.WeakReference;

class d
  implements Runnable
{
  private final WeakReference a;

  public d(c paramc)
  {
    this.a = new WeakReference(paramc);
  }

  public void a()
  {
    ((Handler)br.a().c.a()).postDelayed(this, 250L);
  }

  public void run()
  {
    c localc = (c)this.a.get();
    if (localc == null)
    {
      i.d("The video must be gone, so cancelling the timeupdate task.");
      return;
    }
    localc.f();
    ((Handler)br.a().c.a()).postDelayed(this, 250L);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.d
 * JD-Core Version:    0.6.2
 */