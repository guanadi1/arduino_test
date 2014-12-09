package com.raon.remotelib.a;

import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class c
  implements a
{
  int a = 0;

  public c(int paramInt)
  {
    this.a = paramInt;
  }

  public int a()
  {
    return this.a;
  }

  public int a(g paramg, int paramInt, com.raon.remotelib.c paramc)
  {
    return 0;
  }

  public int a(g paramg, int[] paramArrayOfInt, com.raon.remotelib.c paramc, int paramInt)
  {
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[14];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = 195;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 224;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 0;
    arrayOfInt[10] = 0;
    arrayOfInt[11] = 0;
    arrayOfInt[12] = 0;
    arrayOfInt[13] = 0;
    int n;
    if (paramInt == i.G.bA)
      if (paramc.a)
      {
        n = 32;
        arrayOfInt[3] = 224;
        arrayOfInt[5] = 160;
        arrayOfInt[7] = 64;
        arrayOfInt[10] = n;
        arrayOfInt[12] = 5;
        label158: if (paramInt != i.bv.bA)
          break label585;
        arrayOfInt[2] = 143;
        arrayOfInt[3] = 224;
        arrayOfInt[10] = 32;
        arrayOfInt[12] = 4;
        switch (paramc.i)
        {
        default:
          arrayOfInt[5] = 160;
        case 1:
        case 2:
        case 3:
        }
      }
    int m;
    label585: 
    while ((paramInt != i.bw.bA) && (paramInt != i.bx.bA))
      while (true)
      {
        int k = 1;
        m = 0;
        while (k <= 12)
        {
          m += (0xFF & paramArrayOfInt[k]);
          k++;
        }
        n = 0;
        break;
        if (paramInt == i.bt.bA)
        {
          arrayOfInt[10] = 32;
          switch (paramc.h)
          {
          case 1:
          default:
            arrayOfInt[2] = 143;
            arrayOfInt[5] = 32;
            arrayOfInt[7] = 32;
            arrayOfInt[12] = 1;
            break;
          case 2:
            arrayOfInt[2] = 135;
            arrayOfInt[5] = 160;
            arrayOfInt[7] = 64;
            arrayOfInt[12] = 6;
            break;
          case 4:
            arrayOfInt[2] = 143;
            arrayOfInt[5] = 160;
            arrayOfInt[7] = 128;
            arrayOfInt[12] = 0;
            break;
          case 3:
            arrayOfInt[2] = 7;
            arrayOfInt[5] = 96;
            arrayOfInt[7] = 192;
            arrayOfInt[12] = 6;
            break;
          case 0:
            arrayOfInt[2] = 7;
            arrayOfInt[5] = 160;
            arrayOfInt[7] = 0;
            arrayOfInt[12] = 6;
            break;
          }
        }
        if (paramInt == i.bq.bA)
        {
          arrayOfInt[2] = 128;
          arrayOfInt[3] = 224;
          arrayOfInt[10] = 32;
          arrayOfInt[12] = 2;
          break label158;
        }
        if (paramInt != i.br.bA)
          break label158;
        arrayOfInt[2] = 135;
        arrayOfInt[3] = 0;
        arrayOfInt[10] = 32;
        arrayOfInt[12] = 3;
        break label158;
        arrayOfInt[5] = 96;
        continue;
        arrayOfInt[5] = 64;
        continue;
        arrayOfInt[5] = 32;
      }
    int i = paramc.g;
    if (i < 17)
    {
      i = 17;
      label624: if (paramc.h != 4)
        break label693;
      if (i < 25)
        i = 25;
      arrayOfInt[12] = 0;
    }
    while (true)
    {
      int j = 10 + (i - 17);
      arrayOfInt[2] |= 0xF8 & j << 3;
      break;
      if (i <= 30)
        break label624;
      i = 30;
      break label624;
      label693: if (paramc.h == 1)
      {
        if (i > 25)
          i = 25;
        arrayOfInt[12] = 1;
      }
    }
    arrayOfInt[13] = m;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 14;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.c
 * JD-Core Version:    0.6.2
 */