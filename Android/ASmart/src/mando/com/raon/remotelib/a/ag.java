package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class ag
  implements a
{
  int a = 0;

  public ag(int paramInt)
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
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt1 = new int[13];
    int[] arrayOfInt2 = { 0, 8, 12, 4, 6, 14, 10, 2, 3, 11, 9, 1, 5, 13 };
    arrayOfInt1[0] = this.a;
    arrayOfInt1[1] = 77;
    arrayOfInt1[2] = 178;
    arrayOfInt1[3] = 0;
    arrayOfInt1[4] = 0;
    arrayOfInt1[5] = 0;
    arrayOfInt1[6] = 0;
    if (!paramc.a)
    {
      arrayOfInt1[3] = 222;
      arrayOfInt1[5] = 7;
      arrayOfInt1[2] = (0xFF ^ arrayOfInt1[1]);
      arrayOfInt1[4] = (0xFF ^ arrayOfInt1[3]);
      arrayOfInt1[6] = (0xFF ^ arrayOfInt1[5]);
      paramArrayOfInt[7] = arrayOfInt1[1];
      paramArrayOfInt[8] = arrayOfInt1[2];
      paramArrayOfInt[9] = arrayOfInt1[3];
      paramArrayOfInt[10] = arrayOfInt1[4];
      paramArrayOfInt[11] = arrayOfInt1[5];
      paramArrayOfInt[12] = arrayOfInt1[6];
      return b();
    }
    int i = paramc.g;
    label265: int j;
    int k;
    label311: int i1;
    int n;
    int m;
    if (i < 17)
    {
      i = 30;
      j = arrayOfInt2[(i - 17)];
      switch (paramc.i)
      {
      default:
        k = 0;
        switch (paramc.h)
        {
        default:
          i1 = 7;
          n = 8;
          m = arrayOfInt2[6];
        case 1:
        case 2:
        case 3:
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      arrayOfInt1[3] = (n | 0xF0);
      arrayOfInt1[5] = (0xF0 & i1 << 4 | m & 0xF);
      break;
      if (i <= 30)
        break label265;
      i = 30;
      break label265;
      k = 9;
      break label311;
      k = 10;
      break label311;
      k = 12;
      break label311;
      k = 13;
      break label311;
      m = j;
      n = k;
      i1 = 2;
      continue;
      m = j;
      n = 8;
      i1 = 3;
      continue;
      m = 7;
      n = k;
      i1 = 4;
    }
  }

  public int b()
  {
    return 13;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.ag
 * JD-Core Version:    0.6.2
 */