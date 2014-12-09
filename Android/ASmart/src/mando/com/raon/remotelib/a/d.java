package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;
import com.raon.remotelib.i;

public class d
  implements a
{
  int a = 0;

  public d(int paramInt)
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
    int[] arrayOfInt = new int[13];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    arrayOfInt[2] = paramg.b();
    arrayOfInt[3] = 0;
    arrayOfInt[4] = 0;
    arrayOfInt[5] = 0;
    arrayOfInt[6] = 0;
    arrayOfInt[7] = 0;
    arrayOfInt[8] = 0;
    arrayOfInt[9] = 0;
    arrayOfInt[10] = 0;
    arrayOfInt[11] = 0;
    arrayOfInt[12] = 0;
    int i = paramc.g;
    int k;
    label168: int n;
    label243: int m;
    if (paramg.c() == 1)
      if (i < 17)
      {
        i = 17;
        int j = i - 17;
        arrayOfInt[3] |= 0xF0 & j << 4;
        if (paramInt != i.G.bA)
          break label479;
        if (!paramc.a)
          break label472;
        k = 5;
        arrayOfInt[3] |= k & 0xF;
        if (paramg.c() != 1);
        switch (paramc.i)
        {
        default:
          n = 0;
          arrayOfInt[4] = (n | arrayOfInt[4]);
          if (paramg.c() == 1)
            switch (paramc.h)
            {
            default:
              if (paramc.i == 0)
                m = 2;
              break;
            case 1:
            case 2:
            case 3:
            }
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      }
    while (true)
    {
      arrayOfInt[4] = (m | arrayOfInt[4]);
      paramArrayOfInt[0] = arrayOfInt[0];
      paramArrayOfInt[1] = arrayOfInt[1];
      paramArrayOfInt[2] = arrayOfInt[2];
      paramArrayOfInt[3] = arrayOfInt[3];
      paramArrayOfInt[4] = arrayOfInt[4];
      paramArrayOfInt[5] = (0xFF ^ arrayOfInt[1]);
      paramArrayOfInt[6] = (0xFF ^ arrayOfInt[2]);
      paramArrayOfInt[7] = (0xFF ^ arrayOfInt[3]);
      paramArrayOfInt[8] = (0xFF ^ arrayOfInt[4]);
      paramArrayOfInt[9] = arrayOfInt[1];
      paramArrayOfInt[10] = arrayOfInt[2];
      paramArrayOfInt[11] = arrayOfInt[3];
      paramArrayOfInt[12] = arrayOfInt[4];
      return 13;
      if (i <= 32)
        break;
      i = 32;
      break;
      if (i < 18)
      {
        i = 18;
        break;
      }
      if (i <= 30)
        break;
      i = 30;
      break;
      label472: k = 11;
      break label168;
      label479: k = 9;
      if ((paramg.c() != 2) || (!paramc.b))
        break label168;
      k = 13;
      break label168;
      n = 224;
      break label243;
      n = 208;
      break label243;
      n = 192;
      break label243;
      n = 112;
      break label243;
      n = 96;
      break label243;
      n = 80;
      break label243;
      n = 240;
      break label243;
      n = 64;
      break label243;
      m = 4;
      continue;
      if (paramc.i == 0)
      {
        m = 7;
      }
      else
      {
        m = 9;
        continue;
        m = 5;
        continue;
        if (paramc.i == 0)
        {
          m = 10;
        }
        else
        {
          m = 12;
          continue;
          switch (paramc.h)
          {
          default:
            if (paramc.i == 0)
              m = 2;
            else if (paramc.i == 1)
              m = 3;
            else if (paramc.i == 2)
              m = 4;
            else if (paramc.i == 3)
              m = 1;
            break;
          case 1:
            if (paramc.i == 0)
              m = 7;
            else if (paramc.i == 1)
              m = 8;
            else if (paramc.i == 2)
              m = 9;
            else if (paramc.i == 3)
              m = 6;
            break;
          case 2:
            m = 5;
            break;
          case 3:
            if (paramc.i == 0)
              m = 10;
            else if (paramc.i == 1)
              m = 11;
            else if (paramc.i == 2)
              m = 12;
            else if (paramc.i == 3)
              m = 10;
            else
              m = 0;
            break;
          }
        }
      }
    }
  }

  public int b()
  {
    return 13;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.d
 * JD-Core Version:    0.6.2
 */