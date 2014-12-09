package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class q
  implements a
{
  int a = 0;

  public q(int paramInt)
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
    int[] arrayOfInt = new int[8];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    int i = paramc.g;
    int j;
    int n;
    if (i < 16)
    {
      i = 16;
      j = i - 16;
      if (paramInt != i.G.bA)
        break label214;
      if (!paramc.a)
        break label208;
      n = 3;
      label107: arrayOfInt[1] = (n | arrayOfInt[1]);
      arrayOfInt[2] = 31;
      arrayOfInt[3] = 133;
      arrayOfInt[4] = 248;
      arrayOfInt[5] = 10;
      arrayOfInt[6] = 76;
    }
    int m;
    while (true)
    {
      int k = 1;
      m = 0;
      while (k <= 6)
      {
        m = m + (0xF & arrayOfInt[k] >> 4) + (0xF & arrayOfInt[k]);
        k++;
      }
      if (i <= 30)
        break;
      i = 30;
      break;
      label208: n = 0;
      break label107;
      label214: arrayOfInt[1] = 3;
      if (paramInt == i.bt.bA)
      {
        switch (paramc.h)
        {
        default:
          arrayOfInt[2] = 131;
          arrayOfInt[3] = 181;
          arrayOfInt[4] = 251;
          arrayOfInt[5] = 8;
          arrayOfInt[6] = 76;
          break;
        case 2:
          arrayOfInt[2] = 132;
          arrayOfInt[3] = 0;
          arrayOfInt[4] = 0;
          arrayOfInt[5] = 0;
          arrayOfInt[6] = 76;
          break;
        case 3:
          arrayOfInt[2] = 131;
          arrayOfInt[3] = 181;
          arrayOfInt[4] = 251;
          arrayOfInt[5] = 10;
          arrayOfInt[6] = 60;
          break;
        }
      }
      else if (paramInt == i.bv.bA)
      {
        switch (paramc.i)
        {
        default:
          arrayOfInt[2] = 131;
          arrayOfInt[3] = 69;
          arrayOfInt[4] = 244;
          arrayOfInt[5] = 2;
          arrayOfInt[6] = 42;
          break;
        case 1:
          arrayOfInt[2] = 131;
          arrayOfInt[3] = 69;
          arrayOfInt[4] = 244;
          arrayOfInt[5] = 1;
          arrayOfInt[6] = 26;
          break;
        case 2:
          arrayOfInt[2] = 131;
          arrayOfInt[3] = 69;
          arrayOfInt[4] = 244;
          arrayOfInt[5] = 0;
          arrayOfInt[6] = 138;
          break;
        }
      }
      else if (paramInt == i.bw.bA)
      {
        arrayOfInt[2] = 131;
        arrayOfInt[3] = 117;
        arrayOfInt[4] = 247;
        arrayOfInt[5] = 0;
        arrayOfInt[6] = j;
      }
      else if (paramInt == i.bx.bA)
      {
        arrayOfInt[2] = 4;
        arrayOfInt[3] = 0;
        arrayOfInt[4] = 0;
        arrayOfInt[5] = 0;
        arrayOfInt[6] = j;
      }
      else if (paramInt == i.bq.bA)
      {
        arrayOfInt[2] = 131;
        arrayOfInt[3] = 165;
        arrayOfInt[4] = 251;
        arrayOfInt[5] = 12;
        arrayOfInt[6] = 12;
      }
      else if (paramInt == i.br.bA)
      {
        arrayOfInt[2] = 131;
        arrayOfInt[3] = 165;
        arrayOfInt[4] = 250;
        arrayOfInt[5] = 8;
        arrayOfInt[6] = 12;
      }
    }
    arrayOfInt[7] = (0xF0 & (m ^ 0xFF) << 4);
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 8;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.q
 * JD-Core Version:    0.6.2
 */