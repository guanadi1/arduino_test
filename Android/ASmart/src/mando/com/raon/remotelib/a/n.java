package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class n
  implements a
{
  int a = 0;

  public n(int paramInt)
  {
    this.a = paramInt;
  }

  public int a()
  {
    return this.a;
  }

  public int a(g paramg, int paramInt, c paramc)
  {
    return 0;
  }

  public int a(g paramg, int[] paramArrayOfInt, c paramc, int paramInt)
  {
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = this.a;
    int i;
    label105: int j;
    switch (paramc.h)
    {
    default:
      i = 0;
      if (paramc.a)
        i |= 8;
      arrayOfInt[1] |= i & 0xF;
      if (paramc.i == 0)
      {
        i = 1;
        if ((paramc.b) || (paramc.c))
          i += 4;
        arrayOfInt[1] |= 0xF0 & i << 4;
        if (paramc.h != 0)
          break label276;
        j = 25;
      }
      break;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      int k = j - 16;
      arrayOfInt[2] |= k & 0xF;
      arrayOfInt[3] = 0;
      arrayOfInt[4] = 80;
      arrayOfInt[5] = 2;
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      i = 0;
      break;
      i = 1;
      break;
      i = 2;
      break;
      i = 3;
      break;
      i = 4;
      break;
      if (paramc.i == 1)
      {
        i = 2;
        break label105;
      }
      if (paramc.i == 2)
      {
        i = 3;
        break label105;
      }
      if (paramc.i != 3)
        break label105;
      i = 0;
      break label105;
      label276: j = paramc.g;
      if (j < 16)
        j = 16;
      else if (j > 30)
        j = 30;
    }
  }

  public int b()
  {
    return 6;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.n
 * JD-Core Version:    0.6.2
 */