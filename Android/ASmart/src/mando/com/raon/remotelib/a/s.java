package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class s
  implements a
{
  int a = 0;

  public s(int paramInt)
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
    int[] arrayOfInt = new int[9];
    arrayOfInt[0] = this.a;
    arrayOfInt[i] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 184;
    arrayOfInt[4] = 24;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    int j;
    int k;
    label111: int n;
    label180: int i1;
    if (paramc.a)
    {
      j = 131;
      arrayOfInt[i] = j;
      k = paramc.g;
      if (k >= 17)
        break label316;
      k = 17;
      int m = 1 + (k - 17);
      arrayOfInt[6] |= m & 0xF;
      switch (paramc.h)
      {
      case 1:
      default:
        n = 16;
        arrayOfInt[6] = (n | arrayOfInt[6]);
        switch (paramc.i)
        {
        default:
          i1 = i;
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
    int i2;
    while (true)
    {
      arrayOfInt[5] = i1;
      if ((paramInt == i.br.bA) || (paramInt == i.bq.bA))
        arrayOfInt[5] = (0x80 | arrayOfInt[5]);
      i2 = 0;
      while (i <= 6)
      {
        i2 = i2 + (0xF & arrayOfInt[i] >> 4) + (0xF & arrayOfInt[i]);
        i++;
      }
      j = 128;
      break;
      label316: if (k <= 30)
        break label111;
      k = 30;
      break label111;
      n = 48;
      break label180;
      n = 32;
      break label180;
      n = 64;
      break label180;
      n = 0;
      break label180;
      i1 = 2;
      continue;
      i1 = 3;
      continue;
      i1 = 0;
    }
    arrayOfInt[7] = (0xF0 & (i2 ^ 0xFF) << 4);
    arrayOfInt[8] = 0;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 9;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.s
 * JD-Core Version:    0.6.2
 */