package com.google.ads.e;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ac
{
  private static final Object a = new Object();
  private static int b = 0;
  private static HashMap c = new HashMap();
  private final ArrayList d = new ArrayList();
  public final int u;

  public ac()
  {
    synchronized (a)
    {
      int i = b;
      b = i + 1;
      this.u = i;
      Integer localInteger = (Integer)c.get(getClass());
      if (localInteger == null)
      {
        c.put(getClass(), Integer.valueOf(1));
        i.d("State created: " + toString());
        return;
      }
      c.put(getClass(), Integer.valueOf(1 + localInteger.intValue()));
    }
  }

  private void a(ae paramae)
  {
    this.d.add(paramae);
  }

  protected void finalize()
  {
    synchronized (a)
    {
      c.put(getClass(), Integer.valueOf(-1 + ((Integer)c.get(getClass())).intValue()));
      super.finalize();
      return;
    }
  }

  public String toString()
  {
    return getClass().getSimpleName() + "[" + this.u + "]";
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.ac
 * JD-Core Version:    0.6.2
 */