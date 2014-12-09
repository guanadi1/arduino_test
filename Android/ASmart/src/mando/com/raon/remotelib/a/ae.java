package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class ae
  implements a
{
  int a = 0;

  public ae(int paramInt)
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
    int[] arrayOfInt = new int[14];
    arrayOfInt[0] = this.a;
    arrayOfInt[j] = paramg.a();
    arrayOfInt[i] = paramg.b();
    arrayOfInt[3] = 207;
    arrayOfInt[4] = 16;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 8;
    arrayOfInt[10] = 128;
    arrayOfInt[11] = 0;
    arrayOfInt[12] = 240;
    arrayOfInt[13] = 0;
    int k = paramc.g;
    int m;
    int n;
    label180: label220: int i1;
    if (k < 18)
    {
      k = 18;
      m = 1 + (k - 18);
      switch (paramc.i)
      {
      default:
        n = 48;
        switch (paramc.h)
        {
        case 1:
        default:
          arrayOfInt[5] = m;
          arrayOfInt[7] = (0xFF & (n | i));
          if (paramInt == i.G.bA)
            if (paramc.a)
              i1 = 17;
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
    }
    int i2;
    while (true)
    {
      arrayOfInt[6] = i1;
      i2 = 0;
      while (j <= 12)
      {
        i2 = i2 ^ 0xF & arrayOfInt[j] >> 4 ^ 0xF & arrayOfInt[j];
        j++;
      }
      if (k <= 30)
        break;
      k = 30;
      break;
      n = 80;
      break label180;
      n = 112;
      break label180;
      n = 32;
      break label180;
      i = 3;
      m = 0;
      break label220;
      i = j;
      break label220;
      n = 48;
      i = 4;
      m = 0;
      break label220;
      m = 0;
      i = 0;
      break label220;
      i1 = 33;
      continue;
      if (paramc.a)
        i1 = 49;
      else
        i1 = 33;
    }
    arrayOfInt[13] = (0xFF & (0xFF & (i2 ^ 0x1)));
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 14;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.ae
 * JD-Core Version:    0.6.2
 */