package com.google.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class bc
{
  private ba a = null;
  private long b = -1L;

  public void a(ba paramba, int paramInt)
  {
    this.a = paramba;
    this.b = (TimeUnit.MILLISECONDS.convert(paramInt, TimeUnit.SECONDS) + SystemClock.elapsedRealtime());
  }

  public boolean a()
  {
    return (this.a != null) && (SystemClock.elapsedRealtime() < this.b);
  }

  public ba b()
  {
    return this.a;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bc
 * JD-Core Version:    0.6.2
 */