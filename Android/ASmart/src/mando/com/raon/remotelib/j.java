package com.raon.remotelib;

import java.util.ArrayList;
import java.util.Iterator;

class j
{
  public int a;
  public int b;
  public int c;
  public boolean d;
  public boolean e;
  public boolean f;
  public boolean g;
  public boolean h;
  public int i;
  public ArrayList j;

  public h a(int paramInt)
  {
    if (this.j == null)
      return null;
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.a == paramInt)
        return localh;
    }
    return null;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.j
 * JD-Core Version:    0.6.2
 */