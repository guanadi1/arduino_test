package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class f
  implements a
{
  int a = 0;

  public f(int paramInt)
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
    int i = 4;
    int j = 1;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[10];
    arrayOfInt[0] = this.a;
    arrayOfInt[j] = paramg.a();
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    arrayOfInt[i] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 0;
    int k;
    if (paramc.i == 0)
      k = 8;
    while (true)
    {
      arrayOfInt[2] |= 0xF0 & k << 4;
      label156: int m;
      switch (paramc.h)
      {
      default:
        i = k;
      case 3:
        arrayOfInt[2] |= i & 0xF;
        m = paramc.g;
        if (m < 18)
        {
          m = 18;
          label187: int n = m + 6;
          arrayOfInt[7] |= n & 0xFF;
          if (!paramc.a)
            break label361;
        }
        break;
      case 4:
      case 2:
      case 0:
      case 1:
      }
      int i2;
      label361: for (int i1 = 8; ; i1 = 0)
      {
        arrayOfInt[8] = (0x70 | i1 & 0xF);
        i2 = 0;
        while (j <= 7)
        {
          i2 = i2 + (0xF & arrayOfInt[j] >> 4) + (0xF & arrayOfInt[j]);
          j++;
        }
        if (paramc.i == j)
        {
          k = i;
          break;
        }
        if (paramc.i == 2)
        {
          k = 2;
          break;
        }
        if (paramc.i != 3)
          break label397;
        k = j;
        break;
        i = 8;
        break label156;
        i = j;
        break label156;
        i = 10;
        break label156;
        i = 2;
        break label156;
        if (m <= 30)
          break label187;
        m = 30;
        break label187;
      }
      arrayOfInt[9] = (0xF0 & i2 << 4);
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      label397: k = 0;
    }
  }

  public int b()
  {
    return 10;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.f
 * JD-Core Version:    0.6.2
 */