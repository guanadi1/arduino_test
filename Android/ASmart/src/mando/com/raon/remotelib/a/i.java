package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class i
  implements a
{
  int a = 0;

  public i(int paramInt)
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
    int[] arrayOfInt = new int[28];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = 17;
    arrayOfInt[2] = 218;
    arrayOfInt[3] = 39;
    arrayOfInt[4] = 240;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 2;
    arrayOfInt[9] = 17;
    arrayOfInt[10] = 218;
    arrayOfInt[11] = 39;
    arrayOfInt[12] = 0;
    arrayOfInt[13] = 0;
    arrayOfInt[14] = 0;
    arrayOfInt[15] = 0;
    arrayOfInt[16] = 0;
    arrayOfInt[17] = 0;
    arrayOfInt[18] = 0;
    arrayOfInt[19] = 0;
    arrayOfInt[20] = 0;
    arrayOfInt[21] = 0;
    arrayOfInt[22] = 0;
    arrayOfInt[23] = 0;
    arrayOfInt[24] = 192;
    arrayOfInt[25] = 0;
    arrayOfInt[26] = 0;
    arrayOfInt[27] = 0;
    int i;
    int j;
    label228: int k;
    int m;
    label280: int n;
    if (paramc.a)
    {
      i = 1;
      arrayOfInt[14] = i;
      j = paramc.g;
      if (j >= 17)
        break label384;
      j = 17;
      k = 36 + (j - 17);
      switch (paramc.h)
      {
      case 1:
      default:
        m = 48;
        arrayOfInt[14] = (m | arrayOfInt[14]);
        arrayOfInt[15] = k;
        if (paramc.i == 0)
          n = 48;
        break;
      case 2:
      case 4:
      case 3:
      case 0:
      }
    }
    while (true)
    {
      label311: arrayOfInt[17] = n;
      int i1;
      if (paramc.e == 0)
        i1 = 0;
      int i3;
      while (true)
      {
        arrayOfInt[17] |= i1 & 0xF;
        int i2 = 9;
        i3 = 0;
        while (i2 <= 26)
        {
          i3 += (0xFF & arrayOfInt[i2]);
          i2++;
        }
        i = 0;
        break;
        label384: if (j <= 30)
          break label228;
        j = 30;
        break label228;
        m = 32;
        k = 192;
        break label280;
        m = 64;
        break label280;
        m = 96;
        break label280;
        m = 0;
        break label280;
        if (paramc.i == 1)
        {
          n = 80;
          break label311;
        }
        if (paramc.i == 2)
        {
          n = 112;
          break label311;
        }
        if (paramc.i != 3)
          break label530;
        n = 160;
        break label311;
        if (paramc.e == 1)
        {
          i1 = 15;
        }
        else
        {
          paramc.e = 0;
          i1 = 0;
        }
      }
      arrayOfInt[27] = (i3 & 0xFF);
      System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
      return b();
      label530: n = 0;
    }
  }

  public int b()
  {
    return 28;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.i
 * JD-Core Version:    0.6.2
 */