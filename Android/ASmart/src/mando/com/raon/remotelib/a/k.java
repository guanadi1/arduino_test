package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class k
  implements a
{
  int a = 0;

  public k(int paramInt)
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
    int i = 1;
    int j = 3;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[9];
    arrayOfInt[0] = this.a;
    arrayOfInt[i] = paramg.a();
    arrayOfInt[2] = paramg.b();
    int k;
    switch (paramc.h)
    {
    default:
      k = i;
      if (paramc.a)
        k |= 8;
      arrayOfInt[j] |= 0xF0 & k << 4;
      if (paramc.i != 0)
        break;
    case 3:
    case 4:
    }
    while (true)
    {
      label120: arrayOfInt[4] |= 0xE0 & j << 5;
      int m = paramc.g;
      int n;
      if (m < 18)
        n = 18;
      while (true)
      {
        label154: int i1 = n - 18 << 1;
        if ((n < 23) || (n > 27))
          i1 |= 1;
        arrayOfInt[4] |= i1 & 0x1F;
        arrayOfInt[5] = (0x0 | arrayOfInt[5]);
        arrayOfInt[6] = 0;
        arrayOfInt[7] = 0;
        int i2 = 0;
        while (true)
          if (i <= 7)
          {
            i2 = i2 + (0xF & arrayOfInt[i] >> 4) + (0xF & arrayOfInt[i]);
            i++;
            continue;
            k = j;
            break;
            k = 7;
            break;
            if (paramc.i == 2)
            {
              j = 2;
              break label120;
            }
            if (paramc.i != j)
              break label347;
            j = 0;
            break label120;
            if (m <= 30)
              break label340;
            n = 30;
            break label154;
          }
        arrayOfInt[8] = i2;
        System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
        return b();
        label340: n = m;
      }
      label347: j = k;
    }
  }

  public int b()
  {
    return 9;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.k
 * JD-Core Version:    0.6.2
 */