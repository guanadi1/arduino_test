package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class y
  implements a
{
  int a = 0;

  public y(int paramInt)
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
    int[] arrayOfInt = new int[10];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    int i;
    int j;
    label106: int k;
    label132: int n;
    label195: int i2;
    int i1;
    if (paramc.a)
    {
      i = 0;
      switch (paramc.h)
      {
      case 3:
      default:
        paramc.g = 24;
        j = 7;
        arrayOfInt[3] = (i | j);
        k = paramc.g;
        if (k < 18)
        {
          k = 18;
          int m = 32 - k;
          arrayOfInt[3] |= 0xF0 & m << 4;
          arrayOfInt[9] = 0;
          switch (paramc.e)
          {
          default:
            n = 0;
            if (paramc.f == 1)
            {
              i2 = 3;
              i1 = 2;
            }
            break;
          case 0:
          case 1:
          case 2:
          }
        }
        break;
      case 1:
      case 2:
      case 4:
      }
    }
    while (true)
    {
      arrayOfInt[1] = (0x18 & i1 << 3);
      arrayOfInt[1] |= 0xE0 & i2 << 5;
      arrayOfInt[1] = (0x7 | arrayOfInt[1]);
      arrayOfInt[5] = 42;
      arrayOfInt[2] = (0xFF ^ arrayOfInt[1]);
      arrayOfInt[4] = (0xFF ^ arrayOfInt[3]);
      arrayOfInt[6] = (0xFF ^ arrayOfInt[5]);
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      i = 128;
      break;
      j = 6;
      break label106;
      j = 5;
      break label106;
      j = 3;
      break label106;
      if (k <= 30)
        break label132;
      k = 30;
      break label132;
      n = 1;
      break label195;
      n = 3;
      break label195;
      n = 2;
      break label195;
      switch (paramc.i)
      {
      default:
        i1 = n;
        i2 = 0;
        break;
      case 0:
        i1 = n;
        i2 = 4;
        break;
      case 1:
        i1 = n;
        i2 = 5;
        break;
      case 2:
        i1 = n;
        i2 = 6;
        break;
      case 3:
        i1 = n;
        i2 = 7;
      }
    }
  }

  public int b()
  {
    return 7;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.y
 * JD-Core Version:    0.6.2
 */