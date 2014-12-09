package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class e
  implements a
{
  int a = 0;

  public e(int paramInt)
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
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[7];
    arrayOfInt[0] = this.a;
    arrayOfInt[i] = 32;
    int j;
    int k;
    if (paramInt == i.G.bA)
      if (paramc.a)
      {
        j = 0;
        arrayOfInt[i] |= j & 0xF;
        switch (paramc.h)
        {
        default:
          k = 4;
        case 1:
        case 2:
        case 3:
        }
      }
    while (true)
    {
      label107: arrayOfInt[2] |= 0xF0 & k << 4;
      int m = paramc.g;
      if (m < 18)
      {
        m = 18;
        label141: int n = m - 15;
        arrayOfInt[2] |= n & 0xF;
        arrayOfInt[3] = 0;
        arrayOfInt[4] = 0;
        if (paramc.h != 0)
          break label387;
        arrayOfInt[5] = 2;
      }
      int i1;
      while (true)
      {
        i1 = 0;
        while (i <= 5)
        {
          i1 = i1 + (0xF & arrayOfInt[i] >> 4) + (0xF & arrayOfInt[i]);
          i++;
        }
        j = 8;
        break;
        if (paramc.b)
        {
          j = 9;
          break;
        }
        j = 8;
        break;
        if (paramc.i == 0)
        {
          k = 7;
          break label107;
        }
        if (paramc.i == i)
        {
          k = 6;
          break label107;
        }
        if (paramc.i == 2)
        {
          k = 5;
          break label107;
        }
        if (paramc.i != 3)
          break label425;
        k = 4;
        break label107;
        k = 11;
        break label107;
        if (paramc.i == 0)
        {
          k = 3;
          break label107;
        }
        if (paramc.i == i)
        {
          k = 2;
          break label107;
        }
        if (paramc.i == 2)
        {
          k = i;
          break label107;
        }
        if (paramc.i != 3)
          break label425;
        k = 3;
        break label107;
        if (m <= 30)
          break label141;
        m = 30;
        break label141;
        label387: arrayOfInt[5] = 0;
      }
      arrayOfInt[6] = (0xF0 & i1 << 4);
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      label425: k = 0;
    }
  }

  public int b()
  {
    return 7;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.e
 * JD-Core Version:    0.6.2
 */