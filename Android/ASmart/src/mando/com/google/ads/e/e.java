package com.google.ads.e;

import com.google.ads.b.a;
import com.google.ads.bt;
import com.google.ads.g;

public class e extends com.google.ads.b.e
{
  public e(bt parambt, g paramg)
  {
    super(parambt, paramg);
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    if (this.a.e.a() != null)
      return !((a)this.a.e.a()).b();
    return super.canScrollHorizontally(paramInt);
  }

  public boolean canScrollVertically(int paramInt)
  {
    if (this.a.e.a() != null)
      return !((a)this.a.e.a()).b();
    return super.canScrollVertically(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.e
 * JD-Core Version:    0.6.2
 */