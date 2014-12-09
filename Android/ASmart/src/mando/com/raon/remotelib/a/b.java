package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class b
  implements a
{
  int a = 0;

  public b(int paramInt)
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
    int i = 2;
    int j = 1;
    if (paramArrayOfInt.length < b())
      return 0;
    int[] arrayOfInt = new int[13];
    arrayOfInt[0] = this.a;
    arrayOfInt[j] = paramg.a();
    arrayOfInt[i] = 0;
    arrayOfInt[3] = 32;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 0;
    arrayOfInt[10] = 0;
    arrayOfInt[11] = 0;
    arrayOfInt[12] = 0;
    int k = paramc.g;
    int n;
    label188: int i1;
    label240: int i2;
    if (k < 17)
    {
      k = 17;
      int m = k - 16;
      arrayOfInt[i] |= m & 0xF;
      switch (paramc.h)
      {
      case 1:
      default:
        n = i;
        arrayOfInt[5] |= 0xF0 & n << 4;
        switch (paramc.i)
        {
        default:
          i1 = j;
          arrayOfInt[5] |= i1 & 0xF;
          if (paramc.a)
          {
            i2 = 128;
            label266: arrayOfInt[6] = (i2 | arrayOfInt[6]);
            switch (paramc.e)
            {
            default:
              i = i2;
            case 1:
            case 0:
            case 2:
            case 3:
            }
          }
          break;
        case 1:
        case 2:
        case 3:
        }
        break;
      case 4:
      case 2:
      case 3:
      case 0:
      }
    }
    int i3;
    while (true)
    {
      arrayOfInt[6] = (i | arrayOfInt[6]);
      i3 = 0;
      while (j <= 11)
      {
        i3 += (0xFF & arrayOfInt[j]);
        j++;
      }
      if (k <= 30)
        break;
      k = 30;
      break;
      n = j;
      break label188;
      n = 3;
      break label188;
      n = 4;
      break label188;
      n = 5;
      break label188;
      i1 = i;
      break label240;
      i1 = 3;
      break label240;
      i1 = 0;
      break label240;
      i2 = 0;
      break label266;
      i = j;
      continue;
      i = 3;
      continue;
      i = 4;
    }
    arrayOfInt[12] = i3;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, b());
    return b();
  }

  public int b()
  {
    return 13;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.b
 * JD-Core Version:    0.6.2
 */