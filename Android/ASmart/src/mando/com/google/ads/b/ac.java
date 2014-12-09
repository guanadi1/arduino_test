package com.google.ads.b;

import android.content.Context;
import com.google.ads.g;

public class ac
{
  public static final ac a = new ac(null, true);
  private g b;
  private boolean c;
  private final boolean d;

  private ac(g paramg, boolean paramBoolean)
  {
    this.b = paramg;
    this.d = paramBoolean;
  }

  public static ac a(g paramg)
  {
    return a(paramg, null);
  }

  public static ac a(g paramg, Context paramContext)
  {
    return new ac(g.a(paramg, paramContext), false);
  }

  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public boolean a()
  {
    return this.d;
  }

  public void b(g paramg)
  {
    if (!this.d)
      this.b = paramg;
  }

  public boolean b()
  {
    return this.c;
  }

  public g c()
  {
    return this.b;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.ac
 * JD-Core Version:    0.6.2
 */