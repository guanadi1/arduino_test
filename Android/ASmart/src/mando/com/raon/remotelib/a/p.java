package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class p
  implements a
{
  int a = 0;

  public p(int paramInt)
  {
    this.a = paramInt;
  }

  private static int a(int paramInt)
  {
    int i = paramInt & 0x80;
    int j = 0;
    if (i != 0)
      j = 1;
    if ((paramInt & 0x40) != 0)
      j |= 2;
    if ((paramInt & 0x20) != 0)
      j |= 4;
    if ((paramInt & 0x10) != 0)
      j |= 8;
    if ((paramInt & 0x8) != 0)
      j |= 16;
    if ((paramInt & 0x4) != 0)
      j |= 32;
    if ((paramInt & 0x2) != 0)
      j |= 64;
    if ((paramInt & 0x1) != 0)
      j |= 128;
    return j;
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
    arrayOfInt[i] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    int j;
    switch (paramc.j)
    {
    default:
      paramc.j = i;
      j = 3;
      arrayOfInt[i] = j;
      if (!paramc.b)
        break;
    case 1:
    case 2:
    case 3:
    }
    for (int k = 7; ; k = 0)
    {
      arrayOfInt[2] |= (k & 0x7) << 5;
      label145: label204: int m;
      if (paramc.i == 0)
      {
        j = 0;
        arrayOfInt[2] |= (j & 0x3) << 3;
        switch (paramc.h)
        {
        default:
          i = j;
        case 2:
          arrayOfInt[2] |= i & 0x7;
          m = paramc.g;
          if (m < 16)
            m = 16;
          break;
        case 4:
        case 0:
        case 1:
        case 3:
        }
      }
      while (true)
      {
        arrayOfInt[3] = a(m);
        arrayOfInt[4] = 2;
        if (paramc.a)
          arrayOfInt[4] = (0x1 | arrayOfInt[4]);
        arrayOfInt[5] = 0;
        arrayOfInt[6] = 3;
        System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
        return b();
        j = 11;
        paramc.j = (1 + paramc.j);
        break;
        j = 7;
        paramc.j = (1 + paramc.j);
        break;
        j = 15;
        paramc.j = (1 + paramc.j);
        break;
        if (paramc.i == i)
        {
          j = 2;
          break label145;
        }
        if (paramc.i == 2)
        {
          j = i;
          break label145;
        }
        if (paramc.i != 3)
          break label145;
        j = 3;
        break label145;
        i = 6;
        break label204;
        i = 4;
        break label204;
        i = 2;
        break label204;
        i = 5;
        break label204;
        if (m > 30)
          m = 30;
      }
    }
  }

  public int b()
  {
    return 6;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.p
 * JD-Core Version:    0.6.2
 */