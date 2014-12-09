package com.raon.remotelib.a;

import com.raon.remotelib.c;

public class g
  implements a
{
  int a = 0;

  public g(int paramInt)
  {
    this.a = paramInt;
  }

  public int a()
  {
    return this.a;
  }

  public int a(com.raon.remotelib.g paramg, int paramInt, c paramc)
  {
    return 0;
  }

  public int a(com.raon.remotelib.g paramg, int[] paramArrayOfInt, c paramc, int paramInt)
  {
    int i = 3;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[12];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[i] = 6;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 2;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 6;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 233;
    arrayOfInt[10] = 27;
    arrayOfInt[11] = 1;
    int j;
    if (paramc.i == 0)
      j = 1;
    while (true)
    {
      arrayOfInt[1] |= 0xF0 & j << 4;
      int k;
      if (!paramc.a)
      {
        k = 1;
        arrayOfInt[1] |= k & 0xF;
        switch (paramc.h)
        {
        case 1:
        default:
          i = paramc.g;
          if (i < 16)
            i = 16;
          break;
        case 0:
        case 2:
        case 3:
        }
      }
      while (true)
      {
        arrayOfInt[2] = (i & 0xFF);
        System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
        return b();
        if (paramc.i == 1)
        {
          j = 2;
          break;
        }
        if (paramc.i == 2)
        {
          j = i;
          break;
        }
        if (paramc.i != i)
          break label370;
        j = 0;
        break;
        k = 9;
        switch (paramc.h)
        {
        default:
          break;
        case 0:
          k = 8;
          break;
        case 4:
          k = 12;
          break;
        case 2:
          k = 10;
          break;
        case 1:
          k = 9;
          break;
        case 3:
          k = 11;
          break;
          i = 0;
          continue;
          if (i > 30)
            i = 30;
          break;
        }
      }
      label370: j = 0;
    }
  }

  public int b()
  {
    return 12;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.g
 * JD-Core Version:    0.6.2
 */