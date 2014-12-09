package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class l
  implements a
{
  int a = 0;

  public l(int paramInt)
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
    int[] arrayOfInt = new int[33];
    arrayOfInt[0] = this.a;
    arrayOfInt[i] = i;
    arrayOfInt[2] = 16;
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 64;
    arrayOfInt[6] = 255;
    arrayOfInt[8] = 204;
    arrayOfInt[10] = 146;
    arrayOfInt[12] = 0;
    arrayOfInt[14] = 0;
    arrayOfInt[16] = 0;
    arrayOfInt[18] = 0;
    arrayOfInt[20] = 0;
    arrayOfInt[22] = 0;
    arrayOfInt[24] = 0;
    arrayOfInt[26] = 0;
    arrayOfInt[28] = 0;
    arrayOfInt[30] = 0;
    arrayOfInt[32] = 0;
    int j;
    label224: int k;
    label254: int n;
    switch (paramc.h)
    {
    case 1:
    default:
      i = 3;
    case 3:
      arrayOfInt[26] = i;
      switch (paramc.i)
      {
      default:
        j = 32;
        arrayOfInt[26] = (j | arrayOfInt[26]);
        k = paramc.g;
        if (k < 17)
        {
          k = 17;
          arrayOfInt[14] = (0xFC & 17 + (k - 17) << 2);
          arrayOfInt[28] = 209;
          if (paramInt != i.G.bA)
            break label423;
          if (!paramc.a)
            break label415;
          n = 209;
          label304: arrayOfInt[12] = 19;
          arrayOfInt[14] = 4;
          arrayOfInt[28] = n;
        }
        break;
      case 1:
      case 2:
      case 3:
      }
      break;
    case 2:
    case 4:
    case 0:
    }
    while (true)
    {
      for (int m = 4; m <= 32; m += 2)
        arrayOfInt[(m + 1)] = (0xFF & (0xFF ^ arrayOfInt[m]));
      i = 5;
      break;
      i = 6;
      break;
      i = 7;
      break;
      j = 48;
      break label224;
      j = 64;
      break label224;
      j = 80;
      break label224;
      if (k <= 30)
        break label254;
      k = 30;
      break label254;
      label415: n = 193;
      break label304;
      label423: if (paramInt == i.bt.bA)
      {
        arrayOfInt[12] = 65;
      }
      else if (paramInt == i.bv.bA)
      {
        arrayOfInt[12] = 66;
        arrayOfInt[14] = 4;
      }
      else if ((paramInt == i.bw.bA) || (paramInt == i.bx.bA))
      {
        arrayOfInt[12] = 68;
      }
      else if ((paramInt == i.br.bA) || (paramInt == i.bq.bA))
      {
        arrayOfInt[12] = 129;
      }
    }
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 33;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.l
 * JD-Core Version:    0.6.2
 */