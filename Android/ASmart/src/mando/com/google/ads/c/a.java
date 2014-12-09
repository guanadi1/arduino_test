package com.google.ads.c;

import android.content.Context;
import com.google.ads.d;

public class a
{
  private d a;
  private boolean b;
  private boolean c;

  public a(d paramd, Context paramContext, boolean paramBoolean)
  {
    this.a = paramd;
    this.c = paramBoolean;
    if (paramContext == null)
    {
      this.b = true;
      return;
    }
    this.b = paramd.b(paramContext);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.c.a
 * JD-Core Version:    0.6.2
 */