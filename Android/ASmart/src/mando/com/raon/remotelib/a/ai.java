package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class ai
  implements a
{
  int a = 0;

  public ai(int paramInt)
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
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = this.a;
    arrayOfInt[j] = paramg.a();
    arrayOfInt[i] = paramg.b();
    arrayOfInt[3] = 38;
    arrayOfInt[4] = j;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 0;
    arrayOfInt[10] = 0;
    arrayOfInt[11] = 0;
    arrayOfInt[12] = 0;
    arrayOfInt[13] = 0;
    arrayOfInt[14] = 0;
    arrayOfInt[15] = 0;
    int k;
    int m;
    label161: int n;
    if (paramc.a)
    {
      k = 36;
      arrayOfInt[6] = k;
      m = paramc.g;
      if (m >= 16)
        break label304;
      m = 16;
      switch (paramc.h)
      {
      case 1:
      default:
        n = 3;
        label203: arrayOfInt[7] = n;
        arrayOfInt[8] = (0x80 | 0xF & 15 - (m - 16));
        switch (paramc.i)
        {
        default:
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
    }
    int i1;
    while (true)
    {
      arrayOfInt[9] = i;
      i1 = 0;
      while (j <= 13)
      {
        i1 += (0xFF & arrayOfInt[j]);
        j++;
      }
      k = 32;
      break;
      label304: if (m <= 31)
        break label161;
      m = 31;
      break label161;
      m = 24;
      n = i;
      break label203;
      n = j;
      break label203;
      m = 24;
      n = 7;
      break label203;
      n = 8;
      m = 24;
      break label203;
      i = 3;
      continue;
      i = 5;
      continue;
      i = 0;
    }
    arrayOfInt[14] = (i1 & 0xFF);
    arrayOfInt[15] = 0;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 16;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.ai
 * JD-Core Version:    0.6.2
 */