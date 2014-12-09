package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class h
  implements a
{
  int a = 0;

  public h(int paramInt)
  {
    this.a = paramInt;
  }

  public int a()
  {
    return this.a;
  }

  public int a(g paramg, int paramInt, c paramc)
  {
    paramc.j = (1 + paramc.j);
    return 0;
  }

  public int a(g paramg, int[] paramArrayOfInt, c paramc, int paramInt)
  {
    int i = 1;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = this.a;
    arrayOfInt[i] = paramg.a();
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 12;
    arrayOfInt[10] = 0;
    arrayOfInt[11] = 12;
    arrayOfInt[12] = 0;
    arrayOfInt[13] = 0;
    arrayOfInt[14] = 12;
    arrayOfInt[15] = 0;
    int j = paramc.g;
    int k;
    if (j < 17)
    {
      j = 17;
      arrayOfInt[2] = (109 + (j - 17));
      if (paramc.i != 0)
        break label319;
      k = 2;
    }
    while (true)
    {
      label159: int m = 64;
      label200: int i1;
      switch (paramc.h)
      {
      default:
        arrayOfInt[5] = ((byte)(k | m));
        if (paramInt == i.G.bA)
          if (paramc.a)
          {
            i1 = 0;
            label231: arrayOfInt[6] = i1;
          }
        break;
      case 4:
      case 2:
      case 0:
      case 1:
      case 3:
      }
      int n;
      while (true)
      {
        arrayOfInt[12] = ((byte)(0xFF & paramc.j));
        if (paramc.j >= 255)
          paramc.j = 0;
        n = 0;
        while (i <= 14)
        {
          n = n + (0xF & paramArrayOfInt[i] >> 4) + (0xF & paramArrayOfInt[i]);
          i++;
        }
        if (j <= 30)
          break;
        j = 30;
        break;
        label319: if (paramc.i == i)
        {
          k = 3;
          break label159;
        }
        if (paramc.i == 2)
        {
          k = i;
          break label159;
        }
        if (paramc.i != 3)
          break label463;
        k = 0;
        break label159;
        m = 16;
        break label200;
        m = 48;
        break label200;
        m = 64;
        break label200;
        m = 32;
        break label200;
        m = 80;
        k = 4;
        break label200;
        i1 = 192;
        break label231;
        if ((paramInt == i.bq.bA) || (paramInt == i.br.bA))
          arrayOfInt[5] = 2;
      }
      arrayOfInt[15] = n;
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      label463: k = 0;
    }
  }

  public int b()
  {
    return 16;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.h
 * JD-Core Version:    0.6.2
 */