package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class ac
  implements a
{
  int a = 0;

  public ac(int paramInt)
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
    int i = 2;
    int j = 19;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[5];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = 0;
    arrayOfInt[i] = 0;
    arrayOfInt[3] = 113;
    arrayOfInt[4] = 0;
    int k;
    int m;
    if (paramc.a)
    {
      k = i;
      arrayOfInt[1] = (k | arrayOfInt[1]);
      m = paramc.g;
      if (m >= 18)
        break label233;
      m = 18;
      label92: switch (paramc.h)
      {
      case 1:
      default:
        j = 17;
        if (m > 27)
          m = 27;
        break;
      case 2:
      case 4:
      case 3:
      case 0:
      }
    }
    while (true)
    {
      label147: int n = 18 + (m - 18);
      arrayOfInt[1] |= 0xF8 & j << 3;
      arrayOfInt[4] |= n & 0x1F;
      if (paramc.i == 0)
        i = 1;
      while (true)
      {
        arrayOfInt[4] = (0xE0 & i << 5);
        System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
        return b();
        k = 0;
        break;
        label233: if (m <= 28)
          break label92;
        m = 28;
        break label92;
        int i1 = j;
        j = 18;
        m = i1;
        break label147;
        if (m >= j)
          break label341;
        m = j;
        j = 20;
        break label147;
        m = j;
        break label147;
        j = 16;
        m = 25;
        break label147;
        if (paramc.i != 1)
          if (paramc.i == i)
            i = 4;
          else if (paramc.i == 3)
            i = 0;
          else
            i = 0;
      }
      label341: j = 20;
    }
  }

  public int b()
  {
    return 4;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.ac
 * JD-Core Version:    0.6.2
 */