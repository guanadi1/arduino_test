package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class v
  implements a
{
  int a = 0;

  public v(int paramInt)
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
    int[] arrayOfInt = new int[5];
    arrayOfInt[0] = this.a;
    arrayOfInt[i] = paramg.a();
    int j;
    int k;
    label96: int m;
    int n;
    switch (paramc.h)
    {
    default:
      j = 0;
      k = paramc.g;
      if (k < 18)
      {
        k = 18;
        paramc.g = k;
        m = k - 15;
        switch (paramc.i)
        {
        default:
          n = 0;
          label143: if (paramInt == i.G.bA)
            if (!paramc.a)
            {
              arrayOfInt[2] = 192;
              arrayOfInt[3] = 5;
            }
          break;
        case 1:
        case 2:
        case 3:
        }
      }
      break;
    case 4:
    case 2:
    case 0:
    case 1:
    case 3:
    }
    int i1;
    while (true)
    {
      i1 = 0;
      while (i <= 3)
      {
        i1 = i1 + (0xF & arrayOfInt[i] >> 4) + (0xF & arrayOfInt[i]);
        i++;
      }
      j = 4;
      break;
      j = i;
      break;
      j = 3;
      break;
      j = 0;
      break;
      j = 2;
      break;
      if (k <= 30)
        break label96;
      k = 30;
      break label96;
      n = 2;
      break label143;
      n = 4;
      break label143;
      n = 5;
      break label143;
      arrayOfInt[2] = 0;
      paramc.h = i;
      if (paramc.g < 22)
        paramc.g = 21;
      int i2 = -15 + paramc.g;
      arrayOfInt[3] |= 0xF0 & i2 << 4;
      arrayOfInt[3] |= n & 0x4;
      continue;
      if (paramInt == i.bq.bA)
      {
        arrayOfInt[2] = 16;
        if (paramc.b)
          arrayOfInt[3] = 0;
        else
          arrayOfInt[3] = 0;
      }
      else if (paramInt == i.br.bA)
      {
        arrayOfInt[2] = 19;
        if (paramc.c)
          arrayOfInt[3] = 0;
        else
          arrayOfInt[3] = 0;
      }
      else
      {
        arrayOfInt[2] = 8;
        arrayOfInt[2] |= j & 0x7;
        arrayOfInt[3] |= 0xF0 & m << 4;
        arrayOfInt[3] |= n & 0x4;
      }
    }
    arrayOfInt[4] = (i1 & 0xF);
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 5;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.v
 * JD-Core Version:    0.6.2
 */