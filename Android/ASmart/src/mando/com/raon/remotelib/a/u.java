package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class u
  implements a
{
  int a = 0;

  public u(int paramInt)
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
    int i = 3;
    int j = 1;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[7];
    arrayOfInt[0] = this.a;
    arrayOfInt[j] = paramg.a();
    arrayOfInt[2] = 6;
    arrayOfInt[i] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    if (paramInt == i.G.bA);
    for (int k = 4; ; k = 0)
    {
      arrayOfInt[i] = (k | arrayOfInt[i]);
      int m;
      int n;
      label154: int i1;
      switch (paramc.h)
      {
      default:
        m = 2;
        arrayOfInt[4] |= m & 0xF;
        n = paramc.g;
        if (n < 18)
        {
          n = 18;
          i1 = 18 - n;
          if (paramInt != i.bq.bA)
            break label385;
        }
        break;
      case 2:
      case 3:
      }
      label385: for (int i2 = 128; ; i2 = 0)
      {
        arrayOfInt[2] = (i2 | arrayOfInt[2]);
        label227: int i3;
        switch (paramc.i)
        {
        default:
          i = 0;
        case 0:
          if (paramc.f == j)
            i3 = 0;
          break;
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          arrayOfInt[2] |= j & 0xF;
          arrayOfInt[4] |= 0xF0 & i3 << 4;
          if (paramc.k > 0)
          {
            if (paramc.k > 34)
              paramc.k = 34;
            arrayOfInt[4] = (0x8 | arrayOfInt[4]);
            arrayOfInt[5] = paramc.k;
          }
          System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
          return b();
          m = i;
          break;
          m = 4;
          break;
          if (n <= 32)
            break label154;
          n = 32;
          break label154;
          i = 2;
          break label227;
          i = j;
          break label227;
          i = 0;
          break label227;
          i3 = i1;
          j = i;
        }
      }
    }
  }

  public int b()
  {
    return 7;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.u
 * JD-Core Version:    0.6.2
 */