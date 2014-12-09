package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class j
  implements a
{
  int a = 0;

  public j(int paramInt)
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
    int[] arrayOfInt = new int[5];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    int i;
    label105: int j;
    switch (paramc.h)
    {
    default:
      i = 1;
      if (paramc.a)
        i |= 8;
      arrayOfInt[2] |= 0xF0 & i << 4;
      if (paramc.i == 0)
      {
        i = 11;
        arrayOfInt[2] |= i & 0xF;
        j = paramc.g;
        if (j >= 18)
          break label269;
        j = 18;
      }
      break;
    case 3:
    case 4:
    }
    int n;
    while (true)
    {
      int k = j - 16;
      arrayOfInt[3] |= 0xF0 & k << 4;
      arrayOfInt[3] = (0x0 | arrayOfInt[3]);
      int m = 1;
      n = 0;
      while (m <= 3)
      {
        n = n + (0xF & arrayOfInt[m] >> 4) + (0xF & arrayOfInt[m]);
        m++;
      }
      i = 2;
      break;
      i = 3;
      break;
      if (paramc.i == 1)
      {
        i = 11;
        break label105;
      }
      if (paramc.i == 2)
      {
        i = 10;
        break label105;
      }
      if (paramc.i != 3)
        break label105;
      i = 10;
      break label105;
      label269: if (j > 31)
        j = 31;
    }
    arrayOfInt[4] = n;
    paramArrayOfInt[0] = arrayOfInt[0];
    paramArrayOfInt[1] = arrayOfInt[1];
    paramArrayOfInt[2] = arrayOfInt[2];
    paramArrayOfInt[3] = arrayOfInt[3];
    paramArrayOfInt[4] = arrayOfInt[4];
    paramArrayOfInt[5] = arrayOfInt[5];
    return b();
  }

  public int b()
  {
    return 5;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.j
 * JD-Core Version:    0.6.2
 */