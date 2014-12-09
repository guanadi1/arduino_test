package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class t
  implements a
{
  int a = 0;

  public t(int paramInt)
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
    int i = 6;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[14];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    arrayOfInt[2] = paramg.b();
    arrayOfInt[3] = 178;
    arrayOfInt[4] = 138;
    arrayOfInt[5] = 15;
    arrayOfInt[i] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 0;
    arrayOfInt[10] = 0;
    arrayOfInt[11] = 0;
    arrayOfInt[12] = 0;
    arrayOfInt[13] = 0;
    int j;
    int k;
    label204: int m;
    switch (paramc.i)
    {
    default:
      j = 16;
      arrayOfInt[7] = (j | arrayOfInt[7]);
      switch (paramc.h)
      {
      case 1:
      default:
        k = i;
        arrayOfInt[7] = k;
        m = paramc.g;
        if (m < 17)
        {
          m = 17;
          label228: arrayOfInt[8] = (0xFF & 21 + 2 * (m - 17));
          if (!paramc.a)
            break label371;
        }
        break;
      case 2:
      case 4:
      case 3:
      case 0:
      }
      break;
    case 1:
    case 2:
    case 3:
    }
    int i1;
    label371: for (int n = 0; ; n = 128)
    {
      arrayOfInt[12] = (n | arrayOfInt[12]);
      i1 = 0;
      while (i <= 12)
      {
        i1 = i1 + (0xF & arrayOfInt[i] >> 4) + (0xF & arrayOfInt[i]);
        i++;
      }
      j = 32;
      break;
      j = 64;
      break;
      j = 128;
      break;
      k = 4;
      break label204;
      k = 3;
      break label204;
      k = 2;
      break label204;
      k = 7;
      break label204;
      if (m <= 30)
        break label228;
      m = 30;
      break label228;
    }
    arrayOfInt[13] = (i1 & 0xFF);
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 14;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.t
 * JD-Core Version:    0.6.2
 */