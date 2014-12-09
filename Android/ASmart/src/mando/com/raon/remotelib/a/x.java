package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class x
  implements a
{
  int a = 0;

  public x(int paramInt)
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
    int j = 1;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[15];
    arrayOfInt[0] = this.a;
    arrayOfInt[j] = paramg.a();
    arrayOfInt[i] = 203;
    arrayOfInt[3] = 38;
    arrayOfInt[4] = j;
    arrayOfInt[5] = 0;
    int k;
    int m;
    label130: int n;
    label154: int i1;
    if (paramc.a)
    {
      k = 4;
      arrayOfInt[6] = (k | 0x20);
      switch (paramc.h)
      {
      default:
        paramc.g = 24;
        m = 8;
        arrayOfInt[7] = m;
        n = paramc.g;
        if (n < 16)
        {
          n = 16;
          arrayOfInt[8] = (31 - n);
          arrayOfInt[9] = 0;
          switch (paramc.e)
          {
          default:
            i1 = 0;
            label211: arrayOfInt[9] |= 0x38 & i1 << 3;
            switch (paramc.i)
            {
            default:
              i = 0;
            case 1:
            case 0:
            case 2:
            case 3:
            }
            break;
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          }
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
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
      i2 = 0;
      while (j <= 13)
      {
        i2 += (0xFF & arrayOfInt[j]);
        j++;
      }
      k = 0;
      break;
      m = 3;
      break label130;
      paramc.g = 24;
      m = i;
      break label130;
      paramc.g = 24;
      m = 7;
      break label130;
      m = j;
      break label130;
      if (n <= 31)
        break label154;
      n = 31;
      break label154;
      i1 = j;
      break label211;
      i1 = i;
      break label211;
      i1 = 3;
      break label211;
      i1 = 4;
      break label211;
      i1 = 5;
      break label211;
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
 * Qualified Name:     com.raon.remotelib.a.x
 * JD-Core Version:    0.6.2
 */