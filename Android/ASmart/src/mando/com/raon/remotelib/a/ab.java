package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class ab
  implements a
{
  int a = 0;

  public ab(int paramInt)
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
    int[] arrayOfInt1 = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt2 = new int[8];
    arrayOfInt2[0] = this.a;
    int i = paramg.b() << 8 | paramg.a();
    int j;
    int k;
    int m;
    label203: int n;
    int i1;
    label233: int i3;
    if ((paramc.b) && (!paramc.c))
    {
      j = 26;
      k = 0x10 | -16 + paramc.g;
      if ((paramc.h == 4) && (paramc.i == 2))
        paramc.i = 0;
      switch (paramc.i)
      {
      default:
        m = 2;
        n = paramc.h;
        if ((n < 0) || (n > 4))
          n = 0;
        if (paramc.a)
        {
          i1 = 3;
          if (paramc.f != 1)
            break label648;
          i3 = 3;
        }
        break;
      case 1:
      case 2:
      case 3:
      }
    }
    int i6;
    while (true)
    {
      int i4 = paramc.h;
      int i5 = 0;
      if (i4 == 4)
      {
        boolean bool = paramc.d;
        i5 = 0;
        if (bool)
          i5 = 1;
      }
      arrayOfInt2[1] = (i & 0xFF);
      arrayOfInt2[2] |= 0xF & i >> 8;
      arrayOfInt2[3] |= 0xF0 & j << 4;
      arrayOfInt2[4] |= 0x1 & j >> 4;
      arrayOfInt2[4] |= 0xE & i3 << 1;
      arrayOfInt2[4] = (0x0 | arrayOfInt2[4]);
      arrayOfInt2[4] = (0x80 | arrayOfInt2[4]);
      arrayOfInt2[5] = (0x1 | arrayOfInt2[5]);
      arrayOfInt2[5] |= 0xC & i5 << 2;
      arrayOfInt2[5] |= 0xF0 & k << 4;
      arrayOfInt2[6] |= 0x1 & k >> 4;
      arrayOfInt2[6] |= 0xE & m << 1;
      arrayOfInt2[6] |= 0x70 & n << 4;
      arrayOfInt2[6] = (0x0 | arrayOfInt2[6]);
      arrayOfInt2[7] = (0x0 | arrayOfInt2[7]);
      arrayOfInt2[7] |= 0x30 & i1 << 4;
      arrayOfInt2[7] = (0xC0 | arrayOfInt2[7]);
      i6 = 0;
      for (int i7 = 1; i7 <= 7; i7++)
        i6 = i6 + arrayOfInt1[(0xF & arrayOfInt2[i7])] + arrayOfInt1[(0xF & arrayOfInt2[i7] >> 4)];
      if ((!paramc.b) && (paramc.c))
      {
        j = 27;
        break;
      }
      if ((paramc.b) && (paramc.c))
      {
        j = 28;
        break;
      }
      j = 31;
      break;
      m = 5;
      break label203;
      m = 7;
      break label203;
      m = 0;
      break label203;
      i1 = 0;
      break label233;
      label648: int i2 = paramc.f;
      i3 = 0;
      if (i2 == 2)
        i3 = 6;
    }
    int i8 = 0xFF & (i6 ^ 0xFF);
    arrayOfInt2[2] |= 0xF0 & i8 << 4;
    arrayOfInt2[3] |= 0xF & i8 >> 4;
    System.arraycopy(arrayOfInt2, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 8;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.ab
 * JD-Core Version:    0.6.2
 */