package com.google.ads;

import android.view.View;
import com.google.ads.b.w;
import com.google.ads.e.i;

class bg
  implements Runnable
{
  bg(bd parambd, bk parambk, View paramView, bh parambh)
  {
  }

  public void run()
  {
    if (bd.a(this.d, this.a))
    {
      i.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
      return;
    }
    bd.b(this.d).a(this.b, this.a, this.c, false);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bg
 * JD-Core Version:    0.6.2
 */