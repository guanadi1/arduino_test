package com.google.ads;

import com.google.ads.c.b;
import com.google.ads.e.g;
import com.google.ads.e.i;

class bl
  implements Runnable
{
  bl(bk parambk)
  {
  }

  public void run()
  {
    if (this.a.h())
      g.a(bk.a(this.a));
    try
    {
      bk.a(this.a).a();
      i.a("Called destroy() for adapter with class: " + bk.a(this.a).getClass().getName());
      return;
    }
    catch (Throwable localThrowable)
    {
      i.b("Error while destroying adapter (" + this.a.f() + "):", localThrowable);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bl
 * JD-Core Version:    0.6.2
 */