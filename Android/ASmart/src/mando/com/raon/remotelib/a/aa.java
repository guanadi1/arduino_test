package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class aa
  implements a
{
  int a = 0;

  public aa(int paramInt)
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
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[15];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = 35;
    arrayOfInt[i] = 203;
    arrayOfInt[3] = 38;
    arrayOfInt[4] = 1;
    arrayOfInt[5] = 0;
    int j;
    int k;
    label118: int m;
    label142: int n;
    if (paramc.a)
    {
      j = 4;
      arrayOfInt[6] = (j | 0x20);
      switch (paramc.h)
      {
      default:
        paramc.g = 24;
        k = 8;
        arrayOfInt[7] = k;
        m = paramc.g;
        if (m < 16)
        {
          m = 16;
          arrayOfInt[8] = (31 - m);
          arrayOfInt[9] = 0;
          if (!paramc.b)
            break label366;
          n = 7;
          label169: arrayOfInt[9] |= 0x38 & n << 3;
          switch (paramc.i)
          {
          default:
            i = 0;
          case 1:
          case 0:
          case 2:
          case 3:
          }
        }
        break;
      case 1:
      case 2:
      case 3:
      }
    }
    int i2;
    while (true)
    {
      arrayOfInt[9] = (i | arrayOfInt[9]);
      if (paramc.k > 12)
        paramc.k = 12;
      arrayOfInt[10] = (6 * paramc.k);
      arrayOfInt[11] = 0;
      arrayOfInt[12] = 0;
      arrayOfInt[13] = 0;
      int i1 = 1;
      i2 = 0;
      while (i1 <= 13)
      {
        i2 += (0xFF & arrayOfInt[i1]);
        i1++;
      }
      j = 0;
      break;
      k = 3;
      break label118;
      paramc.g = 24;
      k = i;
      break label118;
      paramc.g = 24;
      k = 7;
      break label118;
      if (m <= 31)
        break label142;
      m = 31;
      break label142;
      label366: n = 0;
      break label169;
      i = 0;
      continue;
      i = 3;
      continue;
      i = 4;
    }
    arrayOfInt[14] = (i2 & 0xFF);
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 15;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.aa
 * JD-Core Version:    0.6.2
 */