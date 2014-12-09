package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class af
  implements a
{
  int a = 0;

  public af(int paramInt)
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
    arrayOfInt[2] = paramg.b();
    arrayOfInt[3] = 240;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    int i = paramc.g;
    int j;
    label128: int k;
    if (i < 17)
    {
      i = 17;
      arrayOfInt[4] = (0x80 | 0xF & 1 + (i - 17));
      switch (paramc.i)
      {
      default:
        j = 112;
        arrayOfInt[5] = j;
        switch (paramc.h)
        {
        case 1:
        default:
          k = 2;
          label175: arrayOfInt[5] = (k | arrayOfInt[5]);
          if (!paramc.b);
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
    for (int m = 144; ; m = 128)
    {
      arrayOfInt[4] = (m | arrayOfInt[4]);
      if (paramInt == i.G.bA)
      {
        arrayOfInt[4] = 128;
        if (!paramc.a)
          arrayOfInt[5] = 112;
      }
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      if (i <= 30)
        break;
      i = 30;
      break;
      j = 96;
      break label128;
      j = 80;
      break label128;
      j = 64;
      break label128;
      k = 3;
      break label175;
      k = 6;
      break label175;
      k = 0;
      break label175;
      k = 0;
      break label175;
    }
  }

  public int b()
  {
    return 6;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.af
 * JD-Core Version:    0.6.2
 */