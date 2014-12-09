package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class z
  implements a
{
  int a = 0;

  public z(int paramInt)
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
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    int i = paramc.g;
    if (i < 18)
    {
      i = 18;
      if (paramInt == i.G.bA)
      {
        if (!paramc.a)
          break label212;
        i = 239;
        label93: arrayOfInt[2] = i;
      }
      arrayOfInt[1] = 3;
      switch (paramc.h)
      {
      case 1:
      default:
        arrayOfInt[3] = 238;
      case 2:
      case 3:
      case 0:
      }
    }
    int k;
    while (true)
    {
      paramc.g = i;
      arrayOfInt[4] = (242 + (29 - i));
      int j = 1;
      k = 3;
      while (j <= 4)
      {
        k += (0xFF & arrayOfInt[j]);
        j++;
      }
      if (i <= 29)
        break;
      i = 29;
      break;
      label212: i = 255;
      break label93;
      arrayOfInt[3] = 141;
      i = 24;
      continue;
      arrayOfInt[3] = 235;
      i = 26;
      continue;
      arrayOfInt[3] = 239;
      i = 24;
    }
    arrayOfInt[5] = (k & 0xFF);
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 6;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.z
 * JD-Core Version:    0.6.2
 */