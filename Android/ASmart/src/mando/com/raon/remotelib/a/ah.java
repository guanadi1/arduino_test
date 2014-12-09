package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class ah
  implements a
{
  int a = 0;

  public ah(int paramInt)
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
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    arrayOfInt[2] = paramg.b();
    arrayOfInt[3] = 0;
    arrayOfInt[i] = 16;
    arrayOfInt[5] = 16;
    arrayOfInt[6] = 252;
    arrayOfInt[7] = 8;
    arrayOfInt[8] = 48;
    arrayOfInt[9] = 34;
    arrayOfInt[10] = 96;
    arrayOfInt[11] = 48;
    arrayOfInt[12] = 0;
    arrayOfInt[13] = 0;
    arrayOfInt[14] = 0;
    arrayOfInt[15] = 0;
    int j;
    label208: int k;
    switch (paramc.h)
    {
    case 1:
    default:
      j = 1;
      arrayOfInt[10] = j;
      switch (paramc.i)
      {
      default:
        arrayOfInt[11] = i;
        k = paramc.g;
        if (k < 18)
          k = 18;
        break;
      case 1:
      case 2:
      case 3:
      }
      break;
    case 2:
    case 4:
    case 3:
    case 0:
    }
    int n;
    while (true)
    {
      arrayOfInt[9] = (0xFF & k - 16 << 4);
      int m = 8;
      n = 0;
      while (m <= 14)
      {
        n += (0xFF & arrayOfInt[m]);
        m++;
      }
      j = 2;
      break;
      j = i;
      break;
      j = 3;
      break;
      j = 0;
      break;
      i = 3;
      break label208;
      i = 2;
      break label208;
      i = 1;
      break label208;
      if (k > 30)
        k = 30;
    }
    arrayOfInt[15] = (0xFF & (0xFF & 256 - n));
    if (!paramc.a)
    {
      arrayOfInt[6] = 2;
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, 7);
      return 7;
    }
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 16;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.ah
 * JD-Core Version:    0.6.2
 */