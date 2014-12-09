package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.e.ac;
import com.google.ads.e.af;
import com.google.ads.e.ag;

public class br extends ac
{
  private static final br d = new br();
  public final ag a = new ag(this, "marketPackages", null);
  public final af b = new af(this, "constants", new bs());
  public final af c = new af(this, "uiHandler", new Handler(Looper.getMainLooper()));

  public static br a()
  {
    return d;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.br
 * JD-Core Version:    0.6.2
 */