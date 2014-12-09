package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class ad
  implements a
{
  int a = 0;

  public ad(int paramInt)
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
    int[] arrayOfInt = new int[20];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 20;
    arrayOfInt[4] = 128;
    arrayOfInt[5] = 110;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 34;
    arrayOfInt[10] = 96;
    arrayOfInt[11] = 48;
    arrayOfInt[12] = 0;
    arrayOfInt[13] = 3;
    arrayOfInt[14] = 1;
    arrayOfInt[15] = 16;
    arrayOfInt[16] = 0;
    arrayOfInt[17] = 0;
    arrayOfInt[18] = 0;
    arrayOfInt[19] = 0;
    int i = paramc.g;
    int j;
    label215: int k;
    if (i < 16)
    {
      i = 16;
      arrayOfInt[7] = (0xFF & 24 + 2 * (i - 16));
      switch (paramc.i)
      {
      default:
        j = 0;
        arrayOfInt[6] = (j | arrayOfInt[6]);
        switch (paramc.h)
        {
        case 1:
        default:
          k = 128;
          label273: arrayOfInt[6] = (k | arrayOfInt[6]);
          if (paramInt == i.G.bA)
            if (paramc.a)
            {
              arrayOfInt[6] = 130;
              arrayOfInt[8] = 241;
              arrayOfInt[9] = 34;
              arrayOfInt[12] = 187;
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
    }
    int i1;
    label539: 
    do
      while (true)
      {
        int n = 1;
        i1 = 0;
        while (n <= 18)
        {
          i1 = i1 + (0xF & arrayOfInt[n] >> 4) + (0xF & arrayOfInt[n]);
          n++;
        }
        if (i <= 30)
          break;
        i = 30;
        break;
        j = 8;
        break label215;
        j = 12;
        break label215;
        j = 4;
        break label215;
        k = 192;
        break label273;
        k = 64;
        break label273;
        k = 4;
        break label273;
        k = 0;
        break label273;
        arrayOfInt[6] = 129;
        arrayOfInt[8] = 242;
        arrayOfInt[9] = 2;
        arrayOfInt[12] = 192;
        continue;
        if (paramInt != i.bt.bA)
          break label539;
        switch (paramc.h)
        {
        default:
          arrayOfInt[12] = 178;
          arrayOfInt[14] = 1;
          break;
        case 3:
          arrayOfInt[12] = 177;
          arrayOfInt[14] = 7;
        }
      }
    while (paramInt != i.bv.bA);
    switch (paramc.i)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    for (int m = 182; ; m = 181)
    {
      arrayOfInt[12] = m;
      break;
    }
    arrayOfInt[19] = (0xFF & i1 - 8);
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 20;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.ad
 * JD-Core Version:    0.6.2
 */