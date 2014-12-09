package com.raon.remotelib.a;

import com.raon.remotelib.c;
import com.raon.remotelib.g;

public class m
  implements a
{
  int a = 0;

  public m(int paramInt)
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
    int[] arrayOfInt = new int[19];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = paramg.a();
    arrayOfInt[2] = paramg.b();
    int i = paramc.g;
    int k;
    if (i < 16)
    {
      i = 16;
      int j = i - 15;
      arrayOfInt[3] |= 0xF0 & j << 4;
      if (!paramc.a)
        arrayOfInt[3] = (0x8 | arrayOfInt[3]);
      if ((!paramc.b) || (paramc.c))
        break label439;
      k = 5;
    }
    while (true)
    {
      label117: arrayOfInt[3] |= k & 0x7;
      int m;
      switch (paramc.h)
      {
      default:
        if (paramc.i == 0)
          m = 33;
        break;
      case 1:
      case 2:
      case 3:
      case 5:
      case 4:
      }
      while (true)
      {
        arrayOfInt[4] = (m | arrayOfInt[4]);
        arrayOfInt[5] = 0;
        arrayOfInt[6] = (0xFF & arrayOfInt[1] + arrayOfInt[2] + arrayOfInt[3] + arrayOfInt[4] + arrayOfInt[5]);
        paramArrayOfInt[0] = arrayOfInt[0];
        paramArrayOfInt[1] = arrayOfInt[1];
        paramArrayOfInt[2] = arrayOfInt[2];
        paramArrayOfInt[3] = arrayOfInt[3];
        paramArrayOfInt[4] = arrayOfInt[4];
        paramArrayOfInt[5] = arrayOfInt[5];
        paramArrayOfInt[6] = arrayOfInt[6];
        paramArrayOfInt[7] = (0xFF ^ arrayOfInt[1]);
        paramArrayOfInt[8] = (0xFF ^ arrayOfInt[2]);
        paramArrayOfInt[9] = (0xFF ^ arrayOfInt[3]);
        paramArrayOfInt[10] = (0xFF ^ arrayOfInt[4]);
        paramArrayOfInt[11] = (0xFF ^ arrayOfInt[5]);
        paramArrayOfInt[12] = (0xFF & paramArrayOfInt[7] + paramArrayOfInt[8] + paramArrayOfInt[9] + paramArrayOfInt[10] + paramArrayOfInt[11]);
        paramArrayOfInt[13] = arrayOfInt[1];
        paramArrayOfInt[14] = arrayOfInt[2];
        paramArrayOfInt[15] = arrayOfInt[3];
        paramArrayOfInt[16] = arrayOfInt[4];
        paramArrayOfInt[17] = arrayOfInt[5];
        paramArrayOfInt[18] = arrayOfInt[6];
        return b();
        if (i <= 30)
          break;
        i = 30;
        break;
        label439: if ((!paramc.b) && (paramc.c))
        {
          k = 6;
          break label117;
        }
        if ((!paramc.b) || (!paramc.c))
          break label827;
        k = 7;
        break label117;
        if (paramc.i == 1)
        {
          m = 49;
        }
        else if (paramc.i == 2)
        {
          m = 65;
        }
        else if (paramc.i == 3)
        {
          m = 33;
          continue;
          if (paramc.i == 0)
          {
            m = 34;
          }
          else if (paramc.i == 1)
          {
            m = 50;
          }
          else if (paramc.i == 2)
          {
            m = 66;
          }
          else if (paramc.i == 3)
          {
            m = 18;
            continue;
            if (paramc.i == 0)
            {
              m = 36;
              continue;
            }
            if (paramc.i == 1)
            {
              m = 52;
              continue;
            }
            if (paramc.i == 2)
            {
              m = 68;
              continue;
            }
            if (paramc.i == 3)
            {
              m = 36;
              continue;
              if (paramc.i == 0)
              {
                m = 35;
                continue;
              }
              if (paramc.i == 1)
              {
                m = 51;
                continue;
              }
              if (paramc.i == 2)
              {
                m = 67;
                continue;
              }
              if (paramc.i == 3)
              {
                m = 35;
                continue;
                if (paramc.i == 0)
                {
                  m = 37;
                  continue;
                }
                if (paramc.i == 1)
                {
                  m = 53;
                  continue;
                }
                if (paramc.i == 2)
                {
                  m = 69;
                  continue;
                }
                if (paramc.i == 3)
                {
                  m = 37;
                  continue;
                  if (paramc.i == 0)
                  {
                    m = 38;
                    continue;
                  }
                  if (paramc.i == 1)
                  {
                    m = 54;
                    continue;
                  }
                  if (paramc.i == 2)
                  {
                    m = 70;
                    continue;
                  }
                  if (paramc.i == 3)
                    m = 38;
                }
              }
            }
          }
        }
        else
        {
          m = 0;
        }
      }
      label827: k = 4;
    }
  }

  public int b()
  {
    return 19;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a.m
 * JD-Core Version:    0.6.2
 */