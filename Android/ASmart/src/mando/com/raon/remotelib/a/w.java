package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class w
  implements a
{
  int a = 0;

  public w(int paramInt)
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
    int[] arrayOfInt = new int[18];
    arrayOfInt[0] = this.a;
    arrayOfInt[i] = paramg.a();
    arrayOfInt[2] = paramg.b();
    arrayOfInt[3] = 20;
    arrayOfInt[4] = 128;
    arrayOfInt[5] = 67;
    int i1;
    if (paramInt == i.G.bA)
    {
      if (!paramc.a)
      {
        arrayOfInt[6] = 2;
        arrayOfInt[7] = 170;
        arrayOfInt[9] = 35;
        arrayOfInt[14] = 0;
      }
      while (true)
      {
        arrayOfInt[8] = 198;
        arrayOfInt[10] = 0;
        arrayOfInt[11] = 104;
        arrayOfInt[12] = 0;
        arrayOfInt[13] = 0;
        arrayOfInt[15] = 0;
        arrayOfInt[16] = 0;
        i1 = 0;
        while (i <= 16)
        {
          i1 = i1 + (0xF & arrayOfInt[i] >> 4) + (0xF & arrayOfInt[i]);
          i++;
        }
        arrayOfInt[6] = i;
        arrayOfInt[7] = 170;
        arrayOfInt[9] = 3;
        arrayOfInt[15] = 32;
      }
    }
    arrayOfInt[9] = 35;
    int j;
    int k;
    label278: int m;
    switch (paramc.h)
    {
    default:
      j = 0;
      k = 0;
      arrayOfInt[6] |= 0xF0 & k << 4;
      arrayOfInt[7] |= j & 0x80;
      if (paramc.i == 0)
        m = 8;
      break;
    case 1:
    case 2:
    case 4:
    case 3:
    case 0:
    }
    while (true)
    {
      label325: arrayOfInt[6] |= m & 0xF;
      label376: int n;
      switch (paramc.e)
      {
      default:
        arrayOfInt[14] = (0x1 & m << 1);
        if ((paramInt == i.bq.bA) || (paramInt == i.br.bA))
          arrayOfInt[14] = (0x8 | arrayOfInt[14]);
        n = paramc.g;
        if (n < 17)
          n = 17;
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfInt[7] = (0x3E & 13 + (n - 17) << 1);
        break;
        k = 8;
        j = 0;
        break label278;
        k = 12;
        j = 0;
        break label278;
        k = 4;
        j = 0;
        break label278;
        j = 0;
        k = 0;
        break label278;
        j = 128;
        k = 0;
        break label278;
        if (paramc.i == i)
        {
          m = 12;
          break label325;
        }
        if (paramc.i == 2)
        {
          m = 4;
          break label325;
        }
        if (paramc.i != 3)
          break label623;
        m = 0;
        break label325;
        m = 0;
        break label376;
        m = i;
        break label376;
        m = 2;
        break label376;
        m = 3;
        break label376;
        if (n > 30)
          n = 30;
      }
      arrayOfInt[17] = (0xFF & i1 - 8);
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      label623: m = 0;
    }
  }

  public int b()
  {
    return 18;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.w
 * JD-Core Version:    0.6.2
 */