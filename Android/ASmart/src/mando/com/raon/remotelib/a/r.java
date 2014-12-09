package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class r
  implements a
{
  int a = 0;

  public r(int paramInt)
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
    int i = 6;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[10];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 192;
    arrayOfInt[i] = 0;
    arrayOfInt[7] = 32;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 0;
    if (paramInt == i.G.bA)
    {
      if (paramc.a)
        arrayOfInt[2] = 65;
    }
    else
    {
      if (paramInt == i.bt.bA);
      switch (paramc.h)
      {
      case 1:
      default:
        arrayOfInt[2] = 194;
        arrayOfInt[7] = 32;
        label170: if ((paramInt == i.bq.bA) || (paramInt == i.br.bA));
        switch (paramc.e)
        {
        default:
          arrayOfInt[2] = 132;
          arrayOfInt[3] = 0;
          label236: if (paramInt == i.bv.bA)
            switch (paramc.i)
            {
            default:
              arrayOfInt[2] = 163;
              arrayOfInt[i] = 64;
            case 1:
            case 2:
            case 3:
            }
          break;
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
    int m;
    while ((paramInt != i.bw.bA) && (paramInt != i.bx.bA))
      while (true)
      {
        int k = 1;
        m = 0;
        while (k <= 8)
        {
          m += (0xFF & arrayOfInt[k]);
          k++;
        }
        arrayOfInt[2] = 32;
        break;
        arrayOfInt[2] = 194;
        arrayOfInt[7] = 64;
        break label170;
        arrayOfInt[2] = 194;
        arrayOfInt[7] = 96;
        break label170;
        arrayOfInt[2] = 194;
        arrayOfInt[7] = 128;
        break label170;
        arrayOfInt[2] = 130;
        arrayOfInt[7] = 0;
        break label170;
        arrayOfInt[2] = 101;
        arrayOfInt[3] = 32;
        break label236;
        arrayOfInt[2] = 133;
        arrayOfInt[3] = 32;
        break label236;
        arrayOfInt[2] = 165;
        arrayOfInt[3] = 32;
        break label236;
        arrayOfInt[2] = 195;
        arrayOfInt[i] = 128;
        continue;
        arrayOfInt[2] = 227;
        arrayOfInt[i] = 192;
        continue;
        arrayOfInt[2] = 131;
        arrayOfInt[i] = 0;
      }
    label532: int j;
    if (paramInt == i.bw.bA)
    {
      arrayOfInt[2] = (i & 0xF);
      arrayOfInt[7] = 32;
      j = paramc.g;
      if (j >= 17)
        break label592;
      j = 17;
    }
    while (true)
    {
      arrayOfInt[2] |= 0xF0 & j << 4;
      break;
      i = 7;
      break label532;
      label592: if (j > 30)
        j = 30;
    }
    arrayOfInt[8] = m;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 10;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.r
 * JD-Core Version:    0.6.2
 */